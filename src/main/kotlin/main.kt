import java.io.File
import java.io.FileNotFoundException

fun main() {
    print("Enter name of file with expressions: ")
    val fileName = readLine()
    check(!fileName.isNullOrEmpty() && File(fileName).isFile && File(fileName).exists()) {
        throw FileNotFoundException("File not found.")
    }
    print(parseAndCalculateExpressionsFromFile(fileName))
}