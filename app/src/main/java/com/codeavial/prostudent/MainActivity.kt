package com.codeavial.prostudent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.codeavial.prostudent.presentation.dashboard.DashBoardScreen
import com.codeavial.prostudent.presentation.theme.ProStudentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProStudentTheme {
                DashBoardScreen()
            }
        }
    }
}

