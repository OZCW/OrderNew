package com.scuffeddev.OrderNew.bookClient;

public record BookEntity(Long id,
                         String title,
                         String author,
                         Double price,
                         Integer stock) {
}
