package com.abugamess.moiandroidlibrary

data class GeneralResponse<T>(
    private val isSuccess: Boolean,
    private val message: String? =null,
    private val data: T?
)
