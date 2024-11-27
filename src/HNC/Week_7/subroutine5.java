package Week_7;

public class subroutine5 {
    public static void printMessage(String message, int x){
        for (int i=0; i<x;i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        printMessage("Hello World", 6);
    }

}
