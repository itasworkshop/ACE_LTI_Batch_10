package javabasics;

// 1. Inheritance
// 2. Abstraction
// 3. Polymorphism
// 4. Encapsulation

// 1. Inheritance

class Computer{

    int sno;
    String cname;

    Computer(int sno,String cname){
        this.sno = sno;
        this.cname = cname;
    }

    public void computerInfo(){
        System.out.println("This is from computer class "+this.cname+this.sno);
    }

}

class Laptop extends Computer{

    String touchPad;

    Laptop(int sno, String cname, String touchPad) {
        super(sno, cname);
        this.touchPad = touchPad;
    }

    public void computerInfo(){
        System.out.println("This is from laptop"+this.cname+this.sno+this.touchPad);
    }

}

public class JavaOOP1 {

    public static void main(String[] args){
        Computer cmp = new Computer(11,"Dell");
        Laptop laptop = new Laptop(22,"HP","G5");
        cmp.computerInfo();
        laptop.computerInfo();

        

    }
}
