package com.scuffeddev.OrderNew.book;

public record BookEntity(Long id,
                         String title,
                         String author,
                         Double price,
                         Integer stock) {
}
