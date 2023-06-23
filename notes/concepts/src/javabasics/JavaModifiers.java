package javabasics;

public class JavaModifiers {

    protected int x;

    public void test(){
        System.out.println("X is from test javabasics."+x);
    }


    public static void main(String[] args){
        JavaModifiers obj = new JavaModifiers();
        System.out.println("X is from test javabasics."+obj.x);
    }
}

class Another{
    public void testAnother(){
        JavaModifiers obj = new JavaModifiers();
        System.out.println("X is from test javabasics."+obj.x);
    }
}
