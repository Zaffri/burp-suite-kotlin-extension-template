package dev.zaffri.extensiontemplate

import burp.api.montoya.BurpExtension
import burp.api.montoya.MontoyaApi
import javax.swing.JLabel
import javax.swing.JPanel

const val EXTENSION_NAME = "My extension"

class Main: BurpExtension {
    override fun initialize(api: MontoyaApi) {
        val mainPanel = JPanel()
        mainPanel.add(JLabel("My first tab"))

        api.userInterface().registerSuiteTab(EXTENSION_NAME, mainPanel)
    }
}