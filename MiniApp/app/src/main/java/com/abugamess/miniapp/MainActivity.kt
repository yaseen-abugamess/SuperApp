package com.abugamess.miniapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abugamess.miniapp.MiniApp.Companion.superData
import com.abugamess.miniapp.ui.theme.MiniAppTheme
import com.abugamess.moiandroidlibrary.GeneralResponse
import com.abugamess.moiandroidlibrary.IMiniAppData

class MiniData: IMiniAppData{
    override fun getIsEmployee(): GeneralResponse<Boolean>? {
        return GeneralResponse(true, null, true)
    }

    override fun getUserEmail(): GeneralResponse<String>? {
        return GeneralResponse(true, null, "Mini email")
    }

    override fun getUserName(): GeneralResponse<String>? {
        return GeneralResponse(true, null, "Mini User")
    }

}

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            MiniAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = superData?.getUserName()?.data ?: "",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiniAppTheme {
        Greeting("Android")
    }
}