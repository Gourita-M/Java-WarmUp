package org.example.warmup;

import java.util.ArrayList;
import java.util.Collections;

public class Ex23 {
    
    public void reverseNumbers()
    {

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);


    for(int i=0; i<numbers.size() / 2;i++){

        // if(i == numbers.size() - 1 - i){
        //     break;
        // }

        Collections.swap(numbers, i, numbers.size() - i - 1);
    }
        
        System.out.println(numbers);
    }
}
