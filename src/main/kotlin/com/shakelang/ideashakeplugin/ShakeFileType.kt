package com.shakelang.ideashakeplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import javax.swing.Icon

object ShakeFileType : LanguageFileType(ShakeLanguage) {
    @NotNull
    override fun getName(): String = "Shake file"

    @NotNull
    override fun getDescription(): String = "Shake language file"

    @NotNull
    override fun getDefaultExtension(): String = "shake"

    override fun getIcon(): Icon = ShakeLanguageSupportIcons.FILE
}
