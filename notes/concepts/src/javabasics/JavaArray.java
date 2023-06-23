package javabasics;

public class JavaArray {
    public static void main(String[] args){
        int[] myarr = {1,2,43,5}; //array always needs size.

        for (int i =0;i<myarr.length;i++){
            System.out.println(i);
        }

        for(int i:myarr){
            //System.out.println(i);
        }

    }
}
