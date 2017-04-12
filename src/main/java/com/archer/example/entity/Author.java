package com.archer.example.entity;

/**
 * Created by archerlj on 2017/4/11.
 */
public class Author {
    private int id;
    private String username;
    private String nickname;

    public Author() {
        super();
    }

    public Author(String username, String nickname) {
        this.username = username;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
