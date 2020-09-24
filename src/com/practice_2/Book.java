package com.practice_2;

public class Book {
    public int numberOfPages;
    public String alias;
    public float rate;

    public Book(int numberOfPages, String Alias, float rate)
    {
        this.alias = alias;
        this.numberOfPages = numberOfPages;
        this.rate = rate;
    }

    public String toStringBook() {
        String s = "Alias: " + alias + "\n" + "Pages: " + numberOfPages + "\n" + "Rating: " + rate;
        return s;
    }



    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }

}
