package javabasics;

//2. Abstraction
//abstract class and interface

interface RBIBankInterface {

    //int a;

    int calculateEMI(int rate, int prcpl);
}

class HDFCBank1 implements RBIBankInterface{

    public int calculateEMI(int rate, int prcpl) {
        //a++;
        //System.out.println(a);
        return rate*2*prcpl;
    }
}

class ICICBank1 implements RBIBankInterface{

    public int calculateEMI(int rate, int prcpl) {
        return rate*5*prcpl;
    }
}

public class JavaOOP3 {

    public static void main(String[] args){
        HDFCBank1 hdfcBank = new HDFCBank1();
        ICICBank1 icicBank = new ICICBank1();

        System.out.println(hdfcBank.calculateEMI(10,20));
        System.out.println(icicBank.calculateEMI(20,20));
    }

}

