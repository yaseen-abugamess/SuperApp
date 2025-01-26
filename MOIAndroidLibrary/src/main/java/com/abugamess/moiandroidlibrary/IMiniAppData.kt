package com.abugamess.moiandroidlibrary

interface IMiniAppData {
    fun getUserName(): GeneralResponse<String>?
    fun getUserEmail(): GeneralResponse<String>?
    fun getIsEmployee(): GeneralResponse<Boolean>?
}