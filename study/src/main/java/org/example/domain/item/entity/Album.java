package org.example.domain.item.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("album")
public class Album extends Item{
    private String artist;
    private String etc;
}
