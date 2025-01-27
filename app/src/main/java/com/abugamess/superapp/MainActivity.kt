package com.abugamess.superapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abugamess.miniapp.MiniApp
import com.abugamess.moiandroidlibrary.GeneralResponse
import com.abugamess.moiandroidlibrary.IMiniAppData

import com.abugamess.superapp.ui.theme.SuperAppTheme

  class MiniData: IMiniAppData {
    override fun getIsEmployee(): GeneralResponse<Boolean>? {
        return GeneralResponse(true, null, true)
    }

    override fun getUserEmail(): GeneralResponse<String>? {
        return GeneralResponse(true, null, "Super email")
    }

    override fun getUserName(): GeneralResponse<String>? {
        return GeneralResponse(true, null, "Super User")
    }

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MiniAppRegistry.register("miniapp1", MiniApp())

        enableEdgeToEdge()
        setContent {
            SuperAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                Button(onClick = {
                    MiniAppRegistry.getMiniApp("miniapp1")?.launch(context = this@MainActivity , MiniData())
                },  modifier = Modifier.padding(innerPadding)) {
                    Greeting(
                        name = "Goto Mini App",
                        modifier = Modifier.padding()
                    )
                }}
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
    SuperAppTheme {
        Greeting("Android")
    }
}
