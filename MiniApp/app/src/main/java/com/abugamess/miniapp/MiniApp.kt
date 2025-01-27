package com.abugamess.miniapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.abugamess.moiandroidlibrary.IMiniApp
import com.abugamess.moiandroidlibrary.IMiniAppData


// sample
open class MiniApp: IMiniApp {


    override fun launch(context: Context, data: IMiniAppData) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}