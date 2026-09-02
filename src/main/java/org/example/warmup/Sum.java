package org.example.warmup;

public class Sum {
    public int n1;
    public int n2;

    public Sum(int n1 , int n2){
       this.n1 = n1;
       this.n2 = n2;
    }

    public void sum(){
        int sum = this.n1 + this.n2;
        System.out.println(sum); 
    }
}
