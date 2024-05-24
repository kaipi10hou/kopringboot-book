package com.myapp.kopringboot.controller

import com.myapp.kopringboot.model.Book
import com.myapp.kopringboot.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/books")
class BookController(private val bookService: BookService) {

    @GetMapping
    fun getAllBooks(): List<Book> = bookService.getAllBooks()

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Long): ResponseEntity<Book> {
        val book = bookService.getBookById(id)
        return if (book != null) {
            ResponseEntity.ok(book)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createBook(@RequestBody book: Book): ResponseEntity<Book> {
        val newBook = bookService.createBook(book)
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook)
    }

    @PutMapping("/{id}")
    fun updateBook(@PathVariable id: Long, @RequestBody updatedBook: Book): ResponseEntity<Book> {
        val book = bookService.updateBook(id, updatedBook)
        return if (book != null) {
            ResponseEntity.ok(book)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Long): ResponseEntity<Void> {
        bookService.deleteBook(id)
        return ResponseEntity.noContent().build()
    }
}