package com.codeavial.prostudent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codeavial.prostudent.domain.model.Session
import com.codeavial.prostudent.domain.model.Subject
import com.codeavial.prostudent.domain.model.Task
import com.codeavial.prostudent.presentation.dashboard.DashboardScreen
import com.codeavial.prostudent.presentation.session.SessionScreen
import com.codeavial.prostudent.presentation.subject.SubjectScreen
import com.codeavial.prostudent.presentation.task.TaskScreen
import com.codeavial.prostudent.presentation.theme.ProStudentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProStudentTheme {
               // SubjectScreen()
               // DashboardScreen()
               // TaskScreen()
                SessionScreen()
            }
        }
    }
}
val subjects = listOf(
    Subject(
        name = "C++" ,
        goalHours = 10f ,
        colors = Subject.subjectCardColors[0] ,
        subjectID = 1
    ) ,
    Subject(
        name = "Android" ,
        goalHours = 10f ,
        colors = Subject.subjectCardColors[1] ,
        subjectID = 1
    ) ,
    Subject(
        name = "java" ,
        goalHours = 10f ,
        colors = Subject.subjectCardColors[2] ,
        subjectID = 1
    ) ,
    Subject(
        name = "Kotlin" ,
        goalHours = 10f ,
        colors = Subject.subjectCardColors[3] ,
        subjectID = 1
    ) ,
    Subject(
        name = "ML" ,
        goalHours = 10f ,
        colors = Subject.subjectCardColors[4] ,
        subjectID = 1
    )
)

val tasks = listOf(
    Task(
        title = "Prepare notes" ,
        description = "notes available on online" ,
        dueDate = 0L ,
        priority = 1 ,
        relatedToSubject = "" ,
        isComplete = false ,
        taskSubjectId = 1 ,
        taskId = 1
    ) ,
    Task(
        title = "Do Homework" ,
        description = "notes available on online" ,
        dueDate = 0L ,
        priority = 0 ,
        relatedToSubject = "" ,
        isComplete = false ,
        taskSubjectId = 1 ,
        taskId = 1
    ) ,
    Task(
        title = "Attent online class" ,
        description = "notes available on online" ,
        dueDate = 0L ,
        priority = 2 ,
        relatedToSubject = "" ,
        isComplete = false ,
        taskSubjectId = 1 ,
        taskId = 1
    ) ,
    Task(
        title = "Revision for exam" ,
        description = "notes available on online" ,
        dueDate = 0L ,
        priority = 1 ,
        relatedToSubject = "" ,
        isComplete = false ,
        taskSubjectId = 1 ,
        taskId = 1
    ) ,
    Task(
        title = "do projects" ,
        description = "notes available on online" ,
        dueDate = 0L ,
        priority = 0 ,
        relatedToSubject = "" ,
        isComplete = false ,
        taskSubjectId = 1 ,
        taskId = 1
    ) ,
)

val sessions = listOf(
    Session(
        relatedToSubject = "Python",
        date = 0L,
        duration = 2,
        sessionSubjectId = 0,
        sessionId = 0
    ) ,
    Session(
        relatedToSubject = "Blockchain",
        date = 0L,
        duration = 2,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "Java",
        date = 0L,
        duration = 2,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "Node.js",
        date = 0L,
        duration = 2,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "HTML",
        date = 0L,
        duration = 2,
        sessionSubjectId = 0,
        sessionId = 0
    )
)
@Preview
@Composable
fun AllPre() {
    DashboardScreen()
}

@Preview
@Composable
fun sunj() {
    SubjectScreen()

}

@Preview
@Composable
fun Tsk() {
    TaskScreen()
}

@Preview
@Composable
fun sessiScre() {
    SessionScreen()
}