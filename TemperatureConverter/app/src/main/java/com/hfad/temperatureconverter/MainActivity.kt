package com.hfad.temperatureconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    MainActivityContent()
                }
            }
        }
    }
}


@Composable
fun EnterTemperature(temperature: String, changed: (String) -> Unit) {
    TextField(modifier = Modifier.fillMaxWidth(),
        value = temperature,
        onValueChange = changed,
        label = {
            Text(text = "Enter temp value")
        })
}

@Composable
fun ConverButton(clicked: () -> Unit) {
    Button(onClick = clicked) {
        Text(
            text = "Convert",
        )
    }
}

@Composable
fun TemperatureText(celsius: Int) {
    val fahrenheit = (celsius.toDouble() * 9 / 5) + 32
    Text(text = "$celsius Celsius is $fahrenheit Fahrenheit")
}

@Composable
fun Header(image: Int, description: String) {
    androidx.compose.foundation.Image(
        painter = painterResource(id = image),
        contentDescription = description,
        modifier = Modifier
            .height(180.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )

}

@Composable
fun MainActivityContent() {
    val celsius = remember { mutableStateOf(0) }
    val newCelsius = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(image = R.drawable.sunrise, description = "sunrise image")

        EnterTemperature(temperature = newCelsius.value, changed = { newCelsius.value = it })

        Row(horizontalArrangement = Arrangement.Center) {
            ConverButton {
                newCelsius.value.toInt().let { celsius.value = it }
            }
        }
        TemperatureText(celsius.value)
    }
}

@Preview
@Composable
fun PreviewMainActivity() {
    MaterialTheme {
        Surface() {
            MainActivityContent()
        }
    }
}