package amaliyot3

import java.io.File

fun main(args: Array<String>) {
    // Dialog quruvchisini yaratuvchi va Dialogni yaratuvchi funksiya
    fun dialog(init: DialogBuilder.() -> Unit): Dialog {
        return DialogBuilder(init).build()
    }

    val dialog: Dialog = dialog {
        title {
            text = "Builder Patter"
        }
        message {
            text = "Its a builder"
            color = "White"
        }

    }

    dialog.show("Builder Pattern")
}