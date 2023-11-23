package com.codeavial.prostudent.presentation.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codeavial.prostudent.R
import com.codeavial.prostudent.presentation.component.CountCard
import com.codeavial.prostudent.presentation.component.SubjectCard
import com.codeavial.prostudent.domain.model.Subject
import com.codeavial.prostudent.presentation.component.tasksList
import com.codeavial.prostudent.domain.model.Task
import com.codeavial.prostudent.presentation.component.studySessionsList


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoardScreen() {
    val subjects = listOf(
        Subject(
            name = "English" ,
            goalHours = 10f ,
            colors = Subject.subjectCardColors[0] ,
            subjectID = 1
        ) ,
        Subject(
            name = "Maths" ,
            goalHours = 10f ,
            colors = Subject.subjectCardColors[1] ,
            subjectID = 1
        ) ,
        Subject(
            name = "Arabic" ,
            goalHours = 10f ,
            colors = Subject.subjectCardColors[2] ,
            subjectID = 1
        ) ,
        Subject(
            name = "Arts" ,
            goalHours = 10f ,
            colors = Subject.subjectCardColors[3] ,
            subjectID = 1
        ) ,
        Subject(
            name = "Physics" ,
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



    Scaffold(
        topBar = { DashboardTopBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                CountCardsSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp) ,
                    subjectCount = 5 ,
                    studiedHours = "10" ,
                    goalHours = "15"
                )
            }
            item {
                SubjectCardsSection(
                    modifier = Modifier.fillMaxWidth() ,
                    subjectList = emptyList() ,

                    /* onAddIconClicked = { isAddSubjectDialogOpen = true }
                 )*/
                )
            }
            item {
                Button(
                    onClick = { /*TODO*/ } ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp , vertical = 20.dp)
                ) {
                    Text(
                        text = "Start Study Session" ,
                        style = MaterialTheme.typography.bodySmall
                    )

                }

            }
            tasksList(
                sectionTitle = "UPCOMING TASKS" ,
                emptyListText = "You don't have any upcoming tasks.\n " +
                        "Click the + button in subject screen to add new task." ,
                tasks = emptyList() ,
                onCheckBoxClick = {} ,
                onTaskCardClick = {}
            )
            item {
                Spacer(modifier = Modifier.height(20.dp))
            }
            studySessionsList(
                sectionTitle = "RECENT STUDY SESSIONS" ,
                emptyListText = "You don't have any recent study sessions.\n " +
                        "Start a study session to begin recording your progress." ,
                sessions = emptyList() ,
                onDeleteIconClick = {}
                //onDeleteIconClick = { isDeleteSessionDialogOpen = true }
            )
        }
    }
}


@Composable
private fun CountCardsSection(
    modifier: Modifier,
    subjectCount: Int,
    studiedHours: String,
    goalHours: String
) {
    Row(modifier = modifier) {
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Subject Count",
            count = "$subjectCount"
        )
        Spacer(modifier = Modifier.width(10.dp))
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Studied Hours",
            count = studiedHours
        )
        Spacer(modifier = Modifier.width(10.dp))
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Goal Study Hours",
            count = goalHours
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "ProStudent",
                style = MaterialTheme.typography.headlineMedium)
        })
}


@Composable
private fun SubjectCardsSection(
    modifier: Modifier ,
    subjectList: List<Subject> ,
    emptyListText: String = "You don't have any subjects.\n Click the + button to add new subject." ,
    //onAddIconClicked: () -> Unit
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth() ,
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "SUBJECTS" ,
                style = MaterialTheme.typography.bodySmall ,
                modifier = Modifier.padding(start = 12.dp)
            )
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Add ,
                    contentDescription = "Add Subject"
                )
            }
        }
        if (subjectList.isEmpty()) {
            Image(
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.CenterHorizontally) ,
                painter = painterResource(R.drawable.imagesubjects) ,
                contentDescription = emptyListText
            )
            Text(
                modifier = Modifier.fillMaxWidth() ,
                text = emptyListText ,
                style = MaterialTheme.typography.bodySmall ,
                color = Color.Gray ,
                textAlign = TextAlign.Center
            )
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp) ,
            contentPadding = PaddingValues(start = 12.dp , end = 12.dp)
        ) {
            items(subjectList) { subject ->
                SubjectCard(
                    subjectName = subject.name ,
                    gradientColors = subject.colors ,
                    onClick = {}
                )
            }
        }
    }
}














