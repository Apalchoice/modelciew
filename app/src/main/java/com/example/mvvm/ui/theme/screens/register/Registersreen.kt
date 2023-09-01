package com.example.mvvm.ui.theme.screens.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mvvm.navigation.ROUT_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registerscreen (navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Register here",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 28.sp
        )
        OutlinedTextField(value = email, onValueChange ={email=it} )
        OutlinedTextField(value = pass, onValueChange ={pass=it} )
        Button(onClick = { /*TODO*/ },
            colors= ButtonDefaults.buttonColors(Color.Blue),
            shape= CircleShape
        ) {
            Text(text ="Login",
                fontSize = 28.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            colors= ButtonDefaults.buttonColors(Color.Blue),
            shape= CircleShape
        ) {
            Text(text ="Have account? Login here",
                fontSize = 28.sp,
                fontFamily = FontFamily.Serif)

        }
    }


}
