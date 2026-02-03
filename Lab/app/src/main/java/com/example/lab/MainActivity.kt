package com.example.lab



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//enableEdgeToEdge()

        setContent {
            Column (modifier = Modifier.fillMaxSize().background(color = Color.Gray).padding(32.dp)){

// hp
                Box(modifier = Modifier
                    .height(32.dp)
                    .background(color = Color.White)
                    .fillMaxWidth()

                ){

                    Text(
                        text = "HP",
                        modifier = Modifier
                            .align(alignment = Alignment.CenterStart)
                            .fillMaxWidth(fraction = 0.10f)
                            .background(color = Color.Red)
                            .padding(8.dp)
                    )
                }

// image

                Image(
                    painter = painterResource(id = R.drawable.peter),
                    contentDescription = "Porfile",
                    modifier = Modifier
                        .size(size = 400.dp)
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 32.dp)
                )

                var STR by remember { mutableStateOf(value = 5) }
                var AGI by remember { mutableStateOf(value = 3) }
                var DEF by remember { mutableStateOf(value = 7) }
                var INT by remember { mutableStateOf(value = -2) }
                var showHi by remember { mutableStateOf(false) }


//status

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.SpaceAround

                ){
                    Column {
                        Button(onClick = {
                            STR = STR + 1
                        }) {
                            Text(text = "+", fontSize = 32.sp)
                        }
                        Text(text = "STR", fontSize = 32.sp)
                        Text(text = STR.toString(), fontSize = 32.sp)
                    }

                    Column {
                        Button(onClick = {
                            AGI = AGI + 1
                        }) {
                            Text(text = "+", fontSize = 32.sp)
                        }
                        Text(text = "AGI", fontSize = 32.sp)
                        Text(text = AGI.toString(), fontSize = 32.sp)
                    }

                    Column {
                        Button(onClick = {
                            DEF = DEF+ 1
                        }) {
                            Text(text = "+", fontSize = 32.sp)
                        }
                        Text(text = "DEF", fontSize = 32.sp)
                        Text(text = DEF.toString(), fontSize = 32.sp)
                    }

                    Column {
                        Button(onClick = {
                            INT = INT + 1
                        }) {
                            Text(text = "+", fontSize = 32.sp)
                        }
                        Text(text = "INT", fontSize = 32.sp)
                        if (INT > -2) {
                            Text(text = "cant up Int", fontSize =28.sp, color = Color.Red)
                        } else {
                            Text(text = INT.toString(), fontSize = 32.sp)
                        }
                    }

                }




            }

        }

    }

}