package org.example.Staroe;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<User> users = Arrays.asList
                (
                        new User("Alex",25,true),
                        new User("Tanya",55,true),
                        new User("Jeka",23,true)
                );


        Gson gson = new Gson();
        String json = gson.toJson(users);
        System.out.println(json);


    }
}