package javabasics;

//2. Abstraction
//abstract class and interface

abstract class RBIBank {

    public void terms(){
        System.out.println("These are the rules!");
    }

    public int calculateEMIDefault(int rate, int prcpl){
        return rate*5;
    }

    public abstract int calculateEMI(int rate, int prcpl);
}

class HDFCBank extends RBIBank{

    public int calculateEMI(int rate, int prcpl) {
        return rate*2*prcpl;
    }
}

class ICICBank extends RBIBank{

    public int calculateEMI(int rate, int prcpl) {
        return rate*5*prcpl;
    }
}

public class JavaOOP2 {

    public static void main(String[] args){
        HDFCBank hdfcBank = new HDFCBank();
        ICICBank icicBank = new ICICBank();

        System.out.println(hdfcBank.calculateEMI(10,20));
        System.out.println(icicBank.calculateEMI(20,20));
    }

}
