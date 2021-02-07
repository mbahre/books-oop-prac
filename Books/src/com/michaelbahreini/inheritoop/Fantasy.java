package com.michaelbahreini.inheritoop;

public class Fantasy extends Book{

    public Fantasy(String name, String author, int publicationYear, int noOfPages, String coverType) {
        super(name, author, publicationYear, noOfPages, coverType);
    }

    @Override
    public void genre() {
        System.out.println("The book genre type is: Fantasy");
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public String details(){
//        return "\n Book: " + this.getName() + "\n Author: " + this.getAuthor() + "\n Publication Date: " + this.getPublicationYear();
//    }
}
