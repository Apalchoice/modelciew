package com.example.mvvm.navigation

import android.hardware.biometrics.BiometricManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.mvvm.ui.theme.screens.home.Homescreen
import com.example.mvvm.ui.theme.screens.login.Loginscreen
import com.example.mvvm.ui.theme.screens.register.Registerscreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination: BiometricManager.Strings = ROUT_LOGIN){
    NavHost(navController=navController,modifier=modifier,startDestination=startDestination){



        composable(ROUT_HOME){
            Homescreen(navController)
        }
        composable(ROUT_LOGIN){
            Loginscreen(navController)
        }
        composable(ROUT_REGISTER){
            Registerscreen(navController)
        }
    }



}


}
