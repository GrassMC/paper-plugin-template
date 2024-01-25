import io.github.tozydev.fastmodule.dsl.fastModule
import io.github.tozydev.fastmodule.dsl.rootModule
import io.github.tozydev.fastmodule.modules.ModuleType
import io.github.tozydev.fastmodule.modules.settings.PaperSettings

plugins {
    id("io.github.tozydev.fast-module") version "0.5.1"
}

rootProject.name = "paper-plugin-template"

fastModule {
    rootModule(ModuleType.PAPER_PLUGIN) {
        settings {
            paper {
                version = PaperSettings.DEFAULT_VERSION
            }
            runPaper {
                acceptEula = true
            }
        }
    }
}
