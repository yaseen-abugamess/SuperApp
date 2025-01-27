package com.abugamess.moiandroidlibrary

data class GeneralResponse<T>(
     val isSuccess: Boolean,
     val message: String? =null,
     val data: T?
)
