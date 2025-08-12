package org.example.domain.item.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("book")
public class Book extends Item{
    private String author;
    private String isbn;
}
