package org.example.warmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

@SpringBootApplication
public class WarmUpApplication {

    public static void main(String[] args) throws IOException
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

            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Entre Your Name: ");
            // String name = scanner.nextLine();
            // System.out.println("Entre Your Note 1: ");
            // int note1 = scanner.nextInt();

            // System.out.println("Entre Your Note 2: ");
            // int note2 = scanner.nextInt();

            // Student student = new Student(name , note1,note2);

            // student.show();

        // Exercise 4: 

            // int[] numbers = {1, 2, 9, 4};
            // int largest = numbers[0];
            // for ( int i = 0 ; i < numbers.length ; i++ ){
            //     if(numbers[i] > largest){
            //         largest = numbers[i];
            //     }
            // }
            // System.out.println(largest);

        // Exercise 5: 

            // System.out.println((int) 'A');

        // Exercise 6;

            // Path path = Paths.get("src/main/java/org/example/warmup/Student.java");
            // long size = Files.size(path);
            // System.out.println(size);

        // Exercise 7;

            // Scanner scanner = new Scanner(System.in);

            // System.out.println("Enter X: ");

            // int x = scanner.nextInt();

            // System.out.println("Enter Y: ");

            // int y = scanner.nextInt();

            // scanner.close();

            // int gcd = 1;

            // for (int i = 1 ; i <= x && i <= y ; i++){
            //     if(x % i == 0 && y % i == 0){
            //         gcd = 1;
            //     }
            // }

            // System.out.println("The GCD of " + x + " and " + y + " is: " + gcd);
            
            // int[] numbers = {1, 2, 9, 4};
        // Exercise 8:

            // boolean isPrime = true;

            // Scanner scanner = new Scanner(System.in);

            // System.out.println("Enter Number, Check if a Prime Number: ");

            // int number = scanner.nextInt();

            // if(number <= 1){
            //     isPrime = false;
            // }else{
            //     for (int i = 2; i < number; i++){
            //         if(number % 1 == 0) {
            //             isPrime = false;
            //             break;
            //         }
            //     }
            // }
            // if(isPrime) {
            //     System.out.println(number + " is Prime");
            // }else {
            //     System.out.println(number + " is Not Prime");
            // }

            // scanner.close();

        //Practicing Arrays in Java

    }
}
