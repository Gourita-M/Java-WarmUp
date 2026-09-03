package org.example.warmup;

public class Palindrome {
    private String aString;

    public Palindrome(String givin)
    {
        this.aString = givin;
    }

    public void isPalindrome()
    {
        boolean isPalindrom = true;

        for(int i = 0; i < aString.length() -1 ; i++){
            if(aString.charAt(i) != aString.charAt(aString.length() - 1 - i)){
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom){
            System.out.println( aString + " is  a Palandrome");
        }else{
            System.out.println( aString + " is not a Palandrome");
        }
    }
}
