package com.abugamess.moiandroidlibrary

import android.content.Context
import android.os.Bundle

interface IMiniApp {
    fun launch(context: Context , data: Bundle? = null )
}