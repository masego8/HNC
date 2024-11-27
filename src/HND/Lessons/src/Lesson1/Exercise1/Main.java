package Lesson1.Exercise1;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("T1");
        Test t1=new Test(15, 1);

        System.out.println(t1.Number1);
        t1.Number1=24;
        System.out.println("This is number 1 " + t1.Number1);
        System.out.println("This is number 2 " + t1.getNumber2());
        t1.setNumber2(78);
        System.out.println("Number 2 is " + t1.getNumber2());

        System.out.println(" \n ---------------------------------------- \n");

        System.out.println("T1");
        Test t2=new Test(18, 69);

        System.out.println("This is number 1 " + t2.Number1);
        System.out.println("This is number 2 " + t2.getNumber2());
        t2.setNumber2(15);
        System.out.println("Number 2 is " + t2.getNumber2());
        System.out.println("sum is " + t2.getSum());





    }
}
