package IntroductionToProgrammingInJava._02_MoreTypesMethodsConditionals;

public class _06_Test {

    public static void testUno(int x){
        if (x > 5){
            System.out.println(x + " is > 5");
        }
    }

    public static void testDos(int x){
        if (x > 5){
            System.out.println(x + " is > 5");
        } else {
            System.out.println(x + " is not > 5");
        }
    }

    public static void testTres(int x){
        if (x > 5){
            System.out.println(x + " is > 5");
        } else if (x == 5){
            System.out.println(x + " equals 5");
        } else {
            System.out.println(x + " is < 5");
        }
    }

    public static void main(String[] arguments){
        testUno(6);
        testUno(5);
        testUno(4);
        testDos(6);
        testDos(5);
        testDos(4);
        testTres(6);
        testTres(5);
        testTres(4);
    }
}
