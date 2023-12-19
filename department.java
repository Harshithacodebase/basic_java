package org.example;

public class department {
    int num;
    String name;
    department(){

    }
    department (int num) {this.num = num;}
    department(int num,String name){
        this.num=num;
        this.name=name;

    }
    public static void main (String ar[]){
        department d=new department();
        System.out.println(d.toString());
        department d1 = new department (int num:7);
        System.out.println(d1.num);
        department d2 = new department(num:7;static String name:"Harshi");
        System.out.println(d2.num);
        System.out.println(d2.name);

    }