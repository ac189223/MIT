package IntroductionToProgrammingInJava._02_MoreTypesMethodsConditionals;

public class _02_Square {

    public static void printSquare(int x) {
        System.out.println(x*x);
    }

    public static double returnSquare(double x) {
        return x*x;
    }

    public static void main(String[] args) {
        int value = 2;
        printSquare(value);
        printSquare(3);
        printSquare(value*2);
        System.out.println(returnSquare(5));
        System.out.println(returnSquare(2));
    }
}
