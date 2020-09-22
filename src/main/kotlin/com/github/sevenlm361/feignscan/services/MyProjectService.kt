package com.github.sevenlm361.feignscan.services

import com.intellij.openapi.project.Project
import com.github.sevenlm361.feignscan.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
