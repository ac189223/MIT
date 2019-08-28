package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

public class _010_CreditCard {

    String cardNumber;
    double expenses;

    void charge(double amount) {
        expenses = expenses + amount;
    }

    String getCardNumber(String password) {
        if (password.equals("SECRET!3*!")) {
            return cardNumber;
        } else {
            return "jerjface";
        }
    }
}
