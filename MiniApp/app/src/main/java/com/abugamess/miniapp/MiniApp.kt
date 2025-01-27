package com.abugamess.miniapp

import android.content.Context
import android.content.Intent
import com.abugamess.moiandroidlibrary.IMiniApp
import com.abugamess.moiandroidlibrary.IMiniAppData


// sample
open class MiniApp: IMiniApp {

    companion object {
        var superData: IMiniAppData? = MiniData()
    }

    override fun launch(context: Context, data: IMiniAppData) {
        superData = data

        context.startActivity(Intent(context, MainActivity::class.java))

    }
}