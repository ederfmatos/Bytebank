package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.model.Book

fun bookTest() {
    val book1 = Book(title = "Livro 01", author = "Autor 1", yearPublish = 2020, publishCompany = "Editora 1")
    val book2 = Book(title = "Livro 02", author = "Autor 2", yearPublish = 2004, publishCompany = "Editora 2")
    val book3 = Book(title = "Livro 03", author = "Autor 1", yearPublish = 2018)
    val book4 = Book(title = "Livro 04", author = "Autor 3", yearPublish = 2009, publishCompany = "Editora 1")

    val books: MutableList<Book> = mutableListOf(book1, book2, book3, book4)
    books.add(Book(title = "Livro 05", author = "Autor 4", yearPublish = 2015, publishCompany = "Editora 3"))

//    books.sortedByDescending { it.yearPublish }.printFormat()
//    books.filter { it.yearPublish > 2010 }.printFormat()
//    books.filterNot { it.yearPublish > 2010 }.printFormat()
}

fun List<Book>.printFormat() {
    val formattedBook = this.joinToString(separator = "\n") {
        """
        (            
            title: ${it.title},
            author: ${it.author},
            yearPublish: ${it.yearPublish},
            publishCompany: ${it.publishCompany},
        )
    """.trimIndent()

    }

    println(formattedBook)
}
