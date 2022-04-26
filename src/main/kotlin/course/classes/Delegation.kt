package course.classes

interface IPrinter {
    fun print()
}

interface IScanner {
    fun scan()
}

class Printer: IPrinter {
    override fun print() {
        println("Printing a document")
    }
}

class Scanner: IScanner {
    override fun scan() {
        println("Scanning a document")
    }
}

class MultifunctionDevice(printer: IPrinter = Printer(), scanner: IScanner = Scanner()): IPrinter by printer, IScanner by scanner{

}

fun main(args: Array<String>) {
    val mfd = MultifunctionDevice()
    mfd.print()
    mfd.scan()
}