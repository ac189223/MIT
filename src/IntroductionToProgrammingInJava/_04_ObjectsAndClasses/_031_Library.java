package IntroductionToProgrammingInJava._04_ObjectsAndClasses;

public class _031_Library {
    String address;
    static String openingHours = "9 AM to 5 PM daily";
    _030_Book[] booksCatalogue;
    int numberOfBooks;

    public _031_Library(String address) {
        this.address = address;
        this.booksCatalogue = new _030_Book[10];
        this.numberOfBooks = 0;
    }

    private void addBook(_030_Book bookToAdd) {
        booksCatalogue[numberOfBooks] = bookToAdd;
        numberOfBooks++;
    }

    private static void printOpeningHours(){
        System.out.println(openingHours);
    }

    private void printAddress(){
        System.out.println(address);
    }

    private void borrowBook(String titleToBorrow){
        String outputMessage = "";
        for (int i = 0; i < numberOfBooks; i++) {
            if (booksCatalogue[i].title.equals(titleToBorrow)) {
                if (booksCatalogue[i].isBorrowed()){
                    outputMessage = "Sorry, this book is already borrowed.";
                } else {
                    outputMessage = "You successfully borrowed " + booksCatalogue[i].title;
                    booksCatalogue[i].rented();
                }
            }
        }
        if (outputMessage.equals("")) {
            outputMessage = "Sorry, this book is not in our catalog.";
        }
        System.out.println(outputMessage);
    }

    private void printAvailableBooks() {
        if (numberOfBooks == 0) {
            System.out.println("No book in catalog.");
        } else {
            for (int i = 0; i < numberOfBooks; i++) {
                if (!booksCatalogue[i].isBorrowed()) {
                    System.out.println(booksCatalogue[i].title);
                }
            }
        }
    }

    private void returnBook(String titleToReturn){
        String outputMessage = "";
        for (int i = 0; i < numberOfBooks; i++) {
            if (booksCatalogue[i].title.equals(titleToReturn)) {
                if (!booksCatalogue[i].isBorrowed()){
                    outputMessage = "Sorry, we cannot take it. This book was not borrowed.";
                } else {
                    outputMessage = "You successfully returned " + booksCatalogue[i].title;
                    booksCatalogue[i].returned();
                }
            }
        }
        if (outputMessage.equals("")) {
            outputMessage = "Sorry, we cannot take it. This book is not in our catalog.";
        }
        System.out.println(outputMessage);
    }

    public static void main(String[] args){
        // Create two libraries
        _031_Library firstLibrary = new _031_Library("10 Main St.");
        _031_Library secondLibrary = new _031_Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new _030_Book("The Da Vinci Code"));
        firstLibrary.addBook(new _030_Book("Le Petit Prince"));
        firstLibrary.addBook(new _030_Book("A Tale of Two Cities"));
        firstLibrary.addBook(new _030_Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
