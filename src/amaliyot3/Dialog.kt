package amaliyot3

class Dialog {

    fun showTitle() = println("showing title")

    fun setTitle(text: String) = println("Text: $text")

    fun setTitleColor(color: String) = println("Text Color: $color")

    fun showMessage() = println("Show Text:")

    fun setMessage(text: String) = println("message $text")

    fun setMessageColor(color: String) = println("message color $color")


    fun show(name:String) = println("showing dialog $name")
}