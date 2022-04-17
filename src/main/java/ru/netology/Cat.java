package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvote;

    //Аннотации @JsonProperty в классе Cat.java
// нужны чтобы конструктор понимаю какие поля в json соотносятся с полями в java классе.
    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvote) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvote = upvote;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvote() {
        return upvote;
    }

    @Override
    public String toString() {
        return "Cat { " + '\n' +
                "id= " + id + '\n' +
                "text= " + text + '\n' +
                "type= " + type + '\n' +
                "user= " + user + '\n' +
                "upvotes= " + upvote + " }" + '\n';
    }
}
