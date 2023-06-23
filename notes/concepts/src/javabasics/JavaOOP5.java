package javabasics;

class Computer1{

    int sno;
    String cname;

    Computer1(int sno,String cname){
        this.sno = sno;
        this.cname = cname;
    }

    public void computerInfo(){
        System.out.println("This is from computer class "+this.cname+this.sno);
    }

}

class Laptop1 extends Computer1{

    String touchPad;

    Laptop1(int sno, String cname, String touchPad) {
        super(sno, cname);
        this.touchPad = touchPad;
    }

    public void computerInfo(){
        System.out.println("This is from laptop"+this.cname+this.sno+this.touchPad);
    }

}

public class JavaOOP5 {

    public static void main(String[] args){
        //Computer1 cmp = new Computer1(11,"Dell");
        Computer1 cmp = new Laptop1(22,"HP","G5");

        cmp.computerInfo();
        //laptop.computerInfo();


    }
}
