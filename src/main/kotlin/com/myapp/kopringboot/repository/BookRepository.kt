package com.myapp.kopringboot.repository

import com.myapp.kopringboot.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, Long>