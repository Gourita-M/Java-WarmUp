package org.example.warmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class WarmUpApplication {

    public static void main(String[] args)
    {
        // Exercise 1:
            // int n1;
            // int n2;

            // Scanner scanner = new Scanner(System.in);

            // System.out.println("Enter Number 1");
            // n1 = scanner.nextInt();

            // System.out.println("Enter Number 2");
            // n2 = scanner.nextInt();

            // scanner.close();
            // Sum sum = new Sum(n1 , n2);

            // sum.sum();

        // Exercise 2:

            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre Your Name: ");
            String name = scanner.nextLine();
            System.out.println("Entre Your Note 1: ");
            int note1 = scanner.nextInt();

            System.out.println("Entre Your Note 2: ");
            int note2 = scanner.nextInt();

            Student student = new Student(name , note1,note2);

            student.show();
    }
}
