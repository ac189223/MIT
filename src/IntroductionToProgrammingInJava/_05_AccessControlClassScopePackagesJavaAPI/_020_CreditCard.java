package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

public class _020_CreditCard {
    private String cardNumber;
    private double expenses;

    private void charge(double amount) {
        expenses = expenses + amount;
    }

    public String getCardNumber(String password) {
        if (password.equals("SECRET!3*!")) {
            return cardNumber;
        } else {
            return "jerjface";
        }
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getExpenses() {
        return expenses;
    }
}
