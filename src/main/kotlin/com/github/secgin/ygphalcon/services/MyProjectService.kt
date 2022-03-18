package com.github.secgin.ygphalcon.services

import com.intellij.openapi.project.Project
import com.github.secgin.ygphalcon.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
