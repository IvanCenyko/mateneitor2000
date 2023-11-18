open class Book(val author: String, val title: String){
    var currentPage = 0
    open fun readPage(){
        currentPage += 1
    }
}
class eBook(author: String, title: String): Book(author, title){
    var wordsReaded = 0
    override fun readPage(){
        wordsReaded += 250
    }
}
fun main(){
    val book1 = Book("JK ROWLING", "Harry el sucio potter")
    val ebook1 = eBook("JK ROWLING", "Harry el sucio potter")
    book1.readPage()
    ebook1.readPage()
    println("You've read ${book1.currentPage} pages from the book and ${ebook1.wordsReaded} words from the ebook")
}