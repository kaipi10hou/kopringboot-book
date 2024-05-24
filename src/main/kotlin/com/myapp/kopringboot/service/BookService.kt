package com.myapp.kopringboot.service

import com.myapp.kopringboot.model.Book
import com.myapp.kopringboot.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

    fun getAllBooks(): List<Book> = bookRepository.findAll()

    fun getBookById(id: Long): Book? = bookRepository.findById(id).orElse(null)

    fun createBook(book: Book): Book = bookRepository.save(book)

    fun updateBook(id: Long, updatedBook: Book): Book? {
        val book = bookRepository.findById(id).orElse(null)
        book?.let {
            it.title = updatedBook.title
            it.author = updatedBook.author
            return bookRepository.save(it)
        }
        return null
    }

    fun deleteBook(id: Long) {
        bookRepository.deleteById(id)
    }
}