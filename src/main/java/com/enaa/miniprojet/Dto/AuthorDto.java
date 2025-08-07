package com.enaa.miniprojet.Dto;



public class AuthorDto {
    private String name;
    private String biography;

    public AuthorDto() {
    }

    public AuthorDto(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
