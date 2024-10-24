package cn.yiiguxing.plugin.translate

import com.intellij.ide.plugins.IdeaPluginDescriptor
import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.extensions.PluginId

object TranslationPlugin {

    const val PLUGIN_ID = "cn.yiiguxing.plugin.translate"

    val descriptor: IdeaPluginDescriptor = PluginManagerCore.getPlugin(PluginId.getId(PLUGIN_ID))!!

    val name: String by lazy { descriptor.name }

    val version: String by lazy { descriptor.version }

    /**
     * Generate an id with the specified [key].
     * The generated id is in the format of `<PLUGIN_ID>.<key>`.
     */
    fun generateId(key: String): String = "$PLUGIN_ID.$key"

}