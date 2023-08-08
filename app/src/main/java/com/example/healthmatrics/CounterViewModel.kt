package com.example.healthmatrics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _count = MutableLiveData<Int>()

    // LiveData to expose the count value (read-only)
    val count: LiveData<Int>
        get() = _count

    // MutableLiveData to indicate whether the data is ready
    private val _isReady = MutableLiveData<Boolean>()

    // LiveData to expose the isReady value (read-only)
    val isReady: LiveData<Boolean>
        get() = _isReady

    init {
        // Initialize the count value to zero
        _count.value = 0

        // Indicate that the data is not ready yet
        _isReady.value = false
    }

    // Method to increment the count
    fun increment() {
        _count.value = (_count.value ?: 0) + 1

        // Assume that data is ready after incrementing the count
        _isReady.value = true
    }
}
