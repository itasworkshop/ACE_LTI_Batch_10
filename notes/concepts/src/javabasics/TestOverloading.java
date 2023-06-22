package javabasics;

//overloading vs overriding

class Calculator{

    public int add(int a,int b){
        int c = a+b;
        System.out.println("Addition is "+c);
        return c;
    }

    public void add(int a,int b,int d){ //nothing to do with retun type
        int c = a+b+d;
        System.out.println("Addition is "+c);
    }
}

public class TestOverloading {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(10,30,40);

    }
}
