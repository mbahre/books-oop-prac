package com.michaelbahreini.inheritoop;

public class Main {

    public static void main(String[] args) {

        Fantasy[] fantasyCollection = new Fantasy[4];
        Mystery[] mysteryCollection = new Mystery[4];
        Horror[] horrorCollection = new Horror[4];

        System.out.println("\n ****Fantasy Books****");
        fantasyCollection[0] = new Fantasy("The Hobbit", "J. R. R. Tolkien", 1937, 300, "Paperback");
        fantasyCollection[1] = new Fantasy("The Lord of The Rings", "J. R. R. Tolkien", 1954, 1178, "Paperback");
        fantasyCollection[2] = new Fantasy("Harry Potter and The Sorcerer's Stone", "J. K Rowling", 1997, 309, "Hardcover");
        fantasyCollection[3] = new Fantasy("The Titan's Curse", "Rick Riordan", 2007, 128, "Paperback");

        for(Fantasy i : fantasyCollection){
            System.out.println(i);
        }

        System.out.println("\n ****Mystery Books****");
        mysteryCollection[0] = new Mystery("The Searcher", "Tana French", 2020, 466, "Paperback");
        mysteryCollection[1] = new Mystery("Sandrine's Case", "Thomas H. Cook", 2013, 354, "Paperback");
        mysteryCollection[2] = new Mystery("Long Way Home", "Eva Dolan", 2014, 404, "Hardcover");
        mysteryCollection[3] = new Mystery("The Missing American", "Kwei Quartey", 2020, 433, "Hardcover");

        for(Mystery i : mysteryCollection){
            System.out.println(i);
        }

        System.out.println("\n ****Horror Books****");
        horrorCollection[0] = new Horror("Pet Sematary", "Stephen King", 2002, 416, "Paperback");
        horrorCollection[1] = new Horror("American Psycho", "Bret Easton Ellis", 1991, 399, "Paperback");
        horrorCollection[2] = new Horror("Baby Teeth", "Zoje Stage", 2001, 320, "Paperback");
        horrorCollection[3] = new Horror("Invisible Man", "Ralph Ellison", 1995, 581, "Paperback");

        for(Horror i : horrorCollection){
            System.out.println(i);
        }
    }
}
