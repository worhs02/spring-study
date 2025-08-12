package org.example.domain.item.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("item")
public class Movie extends Item{
    private String director;
    private String actor;
}
