package IntroductionToProgrammingInJava._04_ObjectsAndClasses;

public class _020_Baby {
    static int numBabiesMade = 0;

    public static void main(String[] args) {
        _020_Baby.numBabiesMade = 100;
        _020_Baby b1 = new _020_Baby();
        _020_Baby b2 = new _020_Baby();
        _020_Baby.numBabiesMade = 20;
        System.out.println(b1.numBabiesMade);
        System.out.println(b2.numBabiesMade);
        System.out.println(_020_Baby.numBabiesMade);
        b1.numBabiesMade = 30;
        System.out.println(b1.numBabiesMade);
        System.out.println(b2.numBabiesMade);
        System.out.println(_020_Baby.numBabiesMade);
    }
}
