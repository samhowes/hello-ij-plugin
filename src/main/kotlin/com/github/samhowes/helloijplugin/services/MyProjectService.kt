package com.github.samhowes.helloijplugin.services

import com.github.samhowes.helloijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
