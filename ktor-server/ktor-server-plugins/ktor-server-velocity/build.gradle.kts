/*
 * Copyright 2014-2025 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("ktorbuild.project.server-plugin")
}

kotlin {
    sourceSets {
        jvmMain.dependencies {
            api(libs.velocity)
            api(libs.velocity.tools)
        }
        jvmTest.dependencies {
            api(project(":ktor-server:ktor-server-plugins:ktor-server-conditional-headers"))
            api(project(":ktor-server:ktor-server-plugins:ktor-server-compression"))
            implementation(project(":ktor-server:ktor-server-plugins:ktor-server-content-negotiation"))
        }
    }
}
