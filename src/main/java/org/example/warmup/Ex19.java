package org.example.warmup;

import java.util.ArrayList;

public class Ex19 {

    public void insertElement()
    {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");   
        languages.add("Python");

        languages.add(0, "Pascal");

        System.out.println(languages);
    }
    
}
