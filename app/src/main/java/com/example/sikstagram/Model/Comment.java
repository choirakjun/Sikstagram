package com.example.sikstagram.Model;

public class Comment {

    private String comment;
    private String publisher;


    public Comment() {
    }
    public String getComment(){
        return comment;
    }
    public void setComment(String comment)
    {
        this.comment=comment;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
}
