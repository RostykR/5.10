package com.company;

public class Task4 {
    public static void main(String[] args) {
        int a=10,x=1,i=1;
        for(;i<=a; i++) x*=i ;
        System.out.println(x+" f");

        x=1;
        i=1;
        while(i<=a){
            x*=i;
            i++;
        }
        System.out.println(x+" w");
    }
}
