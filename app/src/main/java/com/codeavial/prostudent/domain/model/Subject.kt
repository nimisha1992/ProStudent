package com.codeavial.prostudent.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.codeavial.prostudent.presentation.theme.gradient1
import com.codeavial.prostudent.presentation.theme.gradient2
import com.codeavial.prostudent.presentation.theme.gradient3
import com.codeavial.prostudent.presentation.theme.gradient4
import com.codeavial.prostudent.presentation.theme.gradient5

@Entity
data class Subject(
    val name: String ,
    val goalHours: Float ,
    val colors: List<Int>,
    @PrimaryKey(autoGenerate = true)
    val subjectID: Int? = null
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
