package com.abugamess.miniapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.abugamess.moiandroidlibrary.IMiniApp


// sample
open class MiniApp: IMiniApp {

    override fun launch(context: Context, data: Bundle?) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}