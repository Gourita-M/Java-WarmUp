package org.example.warmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

@SpringBootApplication
public class WarmUpApplication {

    public static void main(String[] args) throws IOException
    {

        //Practicing Arrays in Java

            //Creating an Empty Array
                //int[] numbers = new int[5];

            //int[] arr = {2,3,2,3,2,5,1,2,6,2,3,5,5};

            // List<Integer> numbers = new ArrayList<>();
            // numbers.add(10);
            // numbers.add(15);
            // numbers.add(20);
            // //numbers.remove(1);

            // System.out.println(numbers.size());
            


            // int i = 0;
            // while( i < arr.length){
            //     System.out.println(arr[i]);
            //     i++;
            // }

            // for ( int number : arr) {
            //     System.out.println(number);
            // }




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

        
        // Exercise 8-1

            // Scanner scan = new Scanner(System.in);

            // System.out.println("Enter A Number: ");

            // int num = scan.nextInt();

            // if(num <= 0){
            //     System.out.println("Invalid Number");
            // }

        // Exercise 9

            // int result = Fibonacci.fibonacci(3);
            // System.out.println(result);

        // Exercise 10

            // Palindrome pal = new Palindrome("toooot");
            // pal.isPalindrome();

        // Exercise 12

            // Reverse reverse = new Reverse("aaaao");

            // System.out.println(reverse.reverseString());

        // Exercise 13

            // Greatest great = new Greatest(5, 4);
            // great.gcd();

        // Exercise 13

            // Ex13 ex13 = new Ex13();
            // System.out.println(ex13.gcd(15554, 122));

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        

        arr2.add("Ahmaed");
        arr2.add("Sara");
        arr2.add("Youssef");
        arr2.add("Omar");
        arr2.add("Lina");

        arr.add(10);
        arr.add(25);
        arr.add(30);
        arr.add(45);
        arr.add(50);

        int count = 0;

            for(int ar : arr){
                if(ar % 2 != 0){
                    count ++;
                }
            }

            System.out.println(count);
            //System.out.println(arr2.size());
        
    }
}
