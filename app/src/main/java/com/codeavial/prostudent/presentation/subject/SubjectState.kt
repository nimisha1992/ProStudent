package com.codeavial.prostudent.presentation.subject

import androidx.compose.ui.graphics.Color
import com.codeavial.prostudent.domain.model.Session
import com.codeavial.prostudent.domain.model.Subject
import com.codeavial.prostudent.domain.model.Task


data class SubjectState(
    val currentSubjectId: Int? = null ,
    val subjectName: String = "" ,
    val goalStudyHours: String = "" ,
    val subjectCardColors: List<Color> = Subject.subjectCardColors.random() ,
    val studiedHours: Float = 0f ,
    val progress: Float = 0f ,
    val recentSessions: List<Session> = emptyList() ,
    val upcomingTasks: List<Task> = emptyList() ,
    val completedTasks: List<Task> = emptyList() ,
    val session: Session? = null
)
