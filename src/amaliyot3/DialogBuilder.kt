package amaliyot3

import java.io.File

class DialogBuilder() {
    /**Builder Design Pattern bir xil tartibda yoki ma'lum bir algoritm yordamida yaratilishi kerak bo'lgan tarkibiy qismlarga ega murakkab ob'ektlarni yaratish uchun ishlatiladi. Tashqi sinf qurilish algoritmini boshqaradi.
     */
    constructor(init: DialogBuilder.() -> Unit) : this() {
        init()
    }

    private var titleHolder: TextView? = null
    private var messageHolder: TextView? = null

    fun title(init: TextView.() -> Unit) {
        titleHolder = TextView().apply { init() }
    }

    fun message(init: TextView.() -> Unit) {
        messageHolder = TextView().apply { init() }
    }


    fun build(): Dialog {
        val dialog = Dialog()

        titleHolder?.apply {
            dialog.setTitle(text)
            dialog.setTitleColor(color)
            dialog.showTitle()
        }

        messageHolder?.apply {
            dialog.setMessage(text)
            dialog.setMessageColor(color)
            dialog.showMessage()
        }



        return dialog
    } //Build Dialog yani Yaratish demakdir

    class TextView {
        var text: String = ""
        var color: String = ""
    }
}