package io.github.grassmc.template.plugin

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class TemplatePlugin : JavaPlugin() {

    override fun onEnable() {
        slF4JLogger.info("Hello world!")
    }

    override fun onDisable() {
        slF4JLogger.info("Goodbye world!")
    }
}
