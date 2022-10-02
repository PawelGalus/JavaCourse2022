package org.pawelgalus.javacourse2022;

public class AudioBook extends Book {

    private int runTime;

    public AudioBook(String title, String author, int runTime) {
        super(title, author, 0);

        this.runTime = runTime;
    }

}