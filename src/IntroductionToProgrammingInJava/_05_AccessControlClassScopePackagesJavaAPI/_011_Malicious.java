package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

public class _011_Malicious {

    public static void main(String[] args) {
        maliciousMethod(new _010_CreditCard());
    }

    static void maliciousMethod(_010_CreditCard card) {
        card.expenses = 0;
        System.out.println(card.cardNumber);
    }
}
