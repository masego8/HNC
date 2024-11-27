package Lesson1.Exercise1;

public class Test {
    public int Number1 = 12;
    private int Number2 = 3;

    /* constructor should be public */
    public Test(int n1, int n2)
    {
        this.Number1 = n1;
        this.Number2 = n2;
    }
    public Test() {
        this.Number1 = 17;
    }

    public void setNumber2(int n2) {
        Number2 = n2;
    }

    public int getNumber2() {
        return Number2;

    }

    public int getSum() {
        return this.Number1 + this.Number2;
    }




}
