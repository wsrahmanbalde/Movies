package com.balde.Movie.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false,length = 200)
    @NotBlank(message = "Le titre ne doit pas etre null")
    private String Title;
    @Column(nullable = false)
    @NotBlank(message = "Le director ne doit pas etre null")
    private String Director;
    @Column(nullable = false)
    @NotBlank(message = "Le studio ne doit pas etre null")
    private String Studio;

    @ElementCollection
    @CollectionTable(name = "Movie_Cast")
    private Set<String> MovieCast;

    @Column(nullable = false)
    @NotBlank(message = "Le release year ne doit pas etre null")
    private Integer ReleaseYears;

    @Column(nullable = false)
    @NotBlank(message = "Le poster ne doit pas etre null")
    private String Poster;
}
