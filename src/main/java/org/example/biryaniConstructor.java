package org.example;

public class biryaniConstructor {
}
public class biryani {

    public int num1;

    public String name;


    public String type;

// empty constructor

 biryani(){

    }

// constructor with parameters

    public biryani(int num1, String name, String type){

        this.num1 = num1;

        this.name = name;

        this.type = type;
        public static void main(String ar[]){
        }
        org.example.biryani b = new org.example.biryani();

        System.out.println(b.toString());