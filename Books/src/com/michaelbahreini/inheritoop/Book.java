package com.michaelbahreini.inheritoop;

public class Book {

    private String name;
    private String author;
    private int publicationYear;
    private int noOfPages;
    private String coverType;

    public Book(String name, String author, int publicationYear, int noOfPages, String coverType) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfPages = noOfPages;
        this.coverType = coverType;
    }

    public void genre(){
        System.out.println("The book genre type.");
    }

    public String toString(){
        return "\n Name: " + this.name + "\n Author: " + this.author + "\n Published Date: " + this.publicationYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String getCoverType() {
        return coverType;
    }
}
