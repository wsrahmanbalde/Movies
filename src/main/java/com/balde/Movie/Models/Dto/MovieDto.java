package com.balde.Movie.Models.Dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class MovieDto {
    private Long Id;
    @NotBlank(message = "Le titre ne doit pas etre null")
    private String Title;
    @NotBlank(message = "Le director ne doit pas etre null")
    private String Director;
    @NotBlank(message = "Le studio ne doit pas etre null")
    private String Studio;

    private Set<String> MovieCast;

    @NotBlank(message = "Le release year ne doit pas etre null")
    private Integer ReleaseYears;

    @NotBlank(message = "Le poster ne doit pas etre null")
    private String Poster;

    @NotBlank(message = "url du poster ne doit pas etre null")
    private String PosterUrl;
}
