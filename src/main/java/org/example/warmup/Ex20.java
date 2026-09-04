package org.example.warmup;

import java.util.ArrayList;

public class Ex20 {
    
    public void thirdElement()
    {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println(languages.get(2));
    }
}
