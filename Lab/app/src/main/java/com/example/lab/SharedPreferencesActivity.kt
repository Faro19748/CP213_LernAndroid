package com.example.lab

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
import com.example.lab.ui.theme.LabTheme
import com.example.lab.utils.SharedPreferencesUtil

class SharedPreferencesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SharedPreferencesUtil.init(context = this)

        SharedPreferencesUtil.saveString("User_name", "Theeraphat")
        SharedPreferencesUtil.saveBoolean("Is_dark_Mode", true)

        val name = SharedPreferencesUtil.getString(key = "User_name")
        val darkMode = SharedPreferencesUtil.getBoolean(key = "IS_dark_Mode")



        enableEdgeToEdge()
        setContent {
            LabTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
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
    LabTheme {
        Greeting("Android")
    }
}