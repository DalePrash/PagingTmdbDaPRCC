package com.example.pagingtmdbdapr.viewmodel;

import androidx.databinding.BaseObservable;

public class User extends BaseObservable{
    String name;
    String language;
 //   public   User user= new User("Aakash","Hindi");

    public User(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

  /*  @Override
    public String setT(User user) {
String n = user.getLanguage();
return n;
    }

   */
}
