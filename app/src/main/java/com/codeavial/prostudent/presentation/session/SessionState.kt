package com.codeavial.prostudent.presentation.session

import com.codeavial.prostudent.domain.model.Session
import com.codeavial.prostudent.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList() ,
    val sessions: List<Session> = emptyList() ,
    val relatedToSubject: String? = null ,
    val subjectId: Int? = null ,
    val session: Session? = null
)