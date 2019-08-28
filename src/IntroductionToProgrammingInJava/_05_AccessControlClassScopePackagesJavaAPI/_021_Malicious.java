package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

public class _021_Malicious {

    public static void main(String[] args) {
        maliciousMethod(new _020_CreditCard());
    }

    static void maliciousMethod(_020_CreditCard card) {
        card.setExpenses(0);
        System.out.println(card.getCardNumber("SECRET!3*!"));
        card.setCardNumber("3225455745");
        System.out.println(card.getCardNumber("RET!3*!"));
        System.out.println(card.getCardNumber("SECRET!3*!"));
    }
}
