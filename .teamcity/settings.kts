import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2024.12"

project {
    buildType {
        id("Helloworld_buildconfigid")
        name = "Hello World Build"

        vcs {
            root(DslContext.settingsRoot)
        }

        steps {
            script {
                scriptContent = echo "Hello, World!"
            }
        }
    }
}
