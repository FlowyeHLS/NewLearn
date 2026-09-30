package org.example.New30_09_26.First;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args)
    {
        Book book = new Book
        (
                "The Witcher",
                "Kniga ognya i plamenu",
                1993,
                599.99
        );

        Gson gson = new Gson();
        String jsonCompact = gson.toJson(book);
        System.out.println(jsonCompact);
        System.out.println();

        Gson gsonPretty = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonPretty = gsonPretty.toJson(book);
        System.out.println(jsonPretty);
    }
}