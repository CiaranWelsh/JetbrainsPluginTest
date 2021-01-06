package com.github.ciaranwelsh.jetbrainsplugintest.services

import com.intellij.openapi.project.Project
import com.github.ciaranwelsh.jetbrainsplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
