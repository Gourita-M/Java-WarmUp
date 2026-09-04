package org.example.warmup;

import java.util.ArrayList;

public class Ex18 {
    
    public void arryLoop()
    {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");   
        languages.add("Python");
        
        for( String language : languages){
            System.out.println(language);
        }
    }
}
