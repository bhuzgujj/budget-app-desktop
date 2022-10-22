import tornadofx.*

class DesktopAppView : View() {
    override val root = vbox {
        button("A wonderful button")
        label("Waiting")
    }
}