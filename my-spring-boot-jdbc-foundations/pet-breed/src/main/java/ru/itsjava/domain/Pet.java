package ru.itsjava.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pet {
    private long id;
    private final Breed breed;
}
