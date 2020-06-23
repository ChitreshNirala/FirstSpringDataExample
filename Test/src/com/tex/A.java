package com.tex;

class Parent
{
       int a=100;
       public void display()
       {
              System.out.println("Display in parent A: "+a);
       }
}

class Child extends Parent
{
       int b=200;

       public void display()
       {
              System.out.println("Display in parent B: "+b);
       }
}

public class A
{
       public static void main(String args[])
       {
              Child obj = (Child) new Parent();
              obj.display();
       }
}