package com.michaelbahreini.inheritoop;

public class Mystery extends Book{

    public Mystery(String name, String author, int publicationYear, int noOfPages, String coverType) {
        super(name, author, publicationYear, noOfPages, coverType);
    }

    @Override
    public void genre() {
        System.out.println("The book genre type is: Mystery");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
