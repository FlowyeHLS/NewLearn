package org.example.New30_09_26.Second;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String json = """
            [{"name":"Jeka","age":19,"grade":4.5},
             {"name":"Dimas","age":21,"grade":3.8},
             {"name":"Lexa","age":20,"grade":4.9}]
            """;

        Type listType = new TypeToken<List<Student>>() {}.getType();
        List<Student> students = new Gson().fromJson(json, listType);

        System.out.println("Stud s ocenka > 4.0:");
        for (Student s : students)
            if (s.getGrade() > 4)
                System.out.println("- " + s.getName() + " (" + s.getGrade() + ")");

        double sum = 0;
        for (Student s : students) sum += s.getGrade();
        System.out.println("\nSred ball: " + (sum / students.size()));
    }
}