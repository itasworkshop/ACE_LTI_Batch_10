package javabasics;

class User{

    int sno;
    String name;
    int salary =40000;

    User(int sno,String name){
        this.sno = sno;
        this.name = name;
    }

    public void myInfo(int salary){
        int bonus = salary *2;
        System.out.println("This is "+this.name+" and my ssn is "+this.sno+ " and i earn "+ salary+" and bonus is "+bonus);
    }

    public int myBonusInfo(int salary){
        int bonus = salary *2;
        return bonus;
    }
}

public class JavaMethods {

    public static void main(String[] args){
        User user = new User(111,"Rajesh");
        //user.myInfo(25000);
        System.out.println("Bonus is "+user.myBonusInfo(30000));
    }
}
