package org.example.warmup;

public class Reverse {
    private String stri;

    public Reverse(String stri)
    {
        this.stri = stri;
    }

    public String reverseString()
    {
        String newString = "";

        for(int i=0; i< stri.length(); i++){
            newString += stri.charAt(stri.length() -1 - i );
        }

        return newString;
    }
}
