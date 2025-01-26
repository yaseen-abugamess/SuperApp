package com.abugamess.superapp

import com.abugamess.moiandroidlibrary.IMiniApp

object MiniAppRegistry {
    private val miniApps = mutableMapOf<String, IMiniApp>()

    fun register(key: String, miniApp: IMiniApp) {
        miniApps[key] = miniApp
    }

    fun getMiniApp(key: String): IMiniApp? {
        return miniApps[key]
    }
}