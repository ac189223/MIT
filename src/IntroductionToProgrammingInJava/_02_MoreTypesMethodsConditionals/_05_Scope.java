package IntroductionToProgrammingInJava._02_MoreTypesMethodsConditionals;

public class _05_Scope {

    public static void main(String[] arguments) {
        int x = 5;
        if (x == 5){
            x = 6;
            int y = 72;
            System.out.println("x = " + x + " y = " + y);
        }
//        System.out.println("x = " + x + " y = " + y);
        int y = 72;
        System.out.println("x = " + x + " y = " + y);
    }
}
