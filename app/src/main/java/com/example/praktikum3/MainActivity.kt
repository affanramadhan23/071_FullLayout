package com.example.praktikum3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3.ui.theme.Praktikum3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktikum3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Affan Nabil Ramadhan", fontSize = 25.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Lokasi()
        Keterangan()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "",
                modifier = Modifier.size(200.dp))
            Text(text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Lokasi() {
    Text(
        text = "24 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    Row() {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(50.dp))
        Spacer(modifier = Modifier.padding(7.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)
    }
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray)
}

@Composable
fun Keterangan() {
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .width(width = 350.dp)
        .height(height = 190.dp),
        contentAlignment = Alignment.Center) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Humidity")
                Text(
                    text = "98%",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunrise")
                Text(
                    text = "05.00 AM",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "UV Index")
                Text(
                    text = "9 / 10",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunset")
                Text(
                    text = "05.40 PM",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Praktikum3Theme {
        Surface {
            Home()
        }
    }
}