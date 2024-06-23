package com.pinggo.uas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pinggo.uas.ui.theme.UASTheme

@Composable
fun LoginScreen(onLogin: () -> Unit = {}) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4CAF50)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.pinggo_ganteng), 
            contentDescription = null,
            modifier = Modifier.size(250.dp) 
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.gpt), 
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text("Pinggo Ukasyah Ferkasoe", fontSize = 24.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color(0xFFE0E0E0)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                decorationBox = { innerTextField ->
                    if (email.isEmpty()) Text("Email", color = Color.Gray)
                    innerTextField()
                }
            )

            BasicTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color(0xFFE0E0E0)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                decorationBox = { innerTextField ->
                    if (password.isEmpty()) Text("Password", color = Color.Gray)
                    innerTextField()
                }
            )

            Button(
                onClick = {
                    if (email == "your_email@example.com" && password == "your_password") {
                        onLogin()
                    }
                },
                modifier = Modifier
                    .padding(top = 16.dp)
                    .background(Color(0xFF4CAF50))
            ) {
                Text("LOGIN", color = Color.White)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text("Lupa Password? Klik Disini!", color = Color.Black)
            Text("Belum punya akun? Daftar Disini!", color = Color.Black)
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6BAE45))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.gpt),
            contentDescription = null,
            modifier = Modifier.size(200.dp) // Adjust size as needed
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.gpt), contentDescription = null)
                    Text("gpt", color = Color.Black)
                }
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null)
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.gpt), contentDescription = null)
                    Text("bing", color = Color.Black)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Rekomendasi Lapangan", fontSize = 20.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(painter = painterResource(R.drawable.gpt), contentDescription = null, modifier = Modifier.size(100.dp))
                Image(painter = painterResource(R.drawable.gpt), contentDescription = null, modifier = Modifier.size(100.dp))
                Image(painter = painterResource(R.drawable.gpt), contentDescription = null, modifier = Modifier.size(100.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Minggu, 08 Juli 2003", color = Color.Black)
            Text("Pukul 08.00 WIB", color = Color.Black)

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .background(Color(0xFF00B2A9))
                    .align(Alignment.CenterHorizontally)
            ) {
                Text("HALO", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    UASTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    UASTheme {
        MainScreen()
    }
}
