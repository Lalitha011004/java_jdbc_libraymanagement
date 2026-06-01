package com.bookshop;

public class Book
{
    private int bookId;
    private String title, writer;
    private float cost;

    public Book()
    {
    }

    public Book(int bookId, String title, String writer, float cost)
    {
        this.bookId = bookId;
        this.title = title;
        this.writer = writer;
        this.cost = cost;
    }

    public Book(String title, String writer, float cost)
    {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
    }

    public int getBookId()
    {
        return bookId;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getWriter()
    {
        return writer;
    }

    public void setWriter(String writer)
    {
        this.writer = writer;
    }

    public float getCost()
    {
        return cost;
    }

    public void setCost(float cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "Book [bookId=" + bookId +
               ", title=" + title +
               ", writer=" + writer +
               ", cost=" + cost + "]";
    }
}
