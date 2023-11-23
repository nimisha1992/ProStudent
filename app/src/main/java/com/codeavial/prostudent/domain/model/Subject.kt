package com.codeavial.prostudent.domain.model

import androidx.compose.ui.graphics.Color
import com.codeavial.prostudent.presentation.theme.gradient1
import com.codeavial.prostudent.presentation.theme.gradient2
import com.codeavial.prostudent.presentation.theme.gradient3
import com.codeavial.prostudent.presentation.theme.gradient4
import com.codeavial.prostudent.presentation.theme.gradient5

data class Subject(
    val name: String ,
    val goalHours: Float ,
    val colors: List<Color>,
    val subjectID: Int
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
