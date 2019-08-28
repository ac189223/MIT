package IntroductionToProgrammingInJava._03_LoopsAndArrays;

public class _04_Sort {

    static int[] numbers = {1, 3, 7, 2, 4, 5, 6, 8};

    public static void sort() {
        int time;
        for (int i = 1; i < numbers.length; i++) {
            int place = checkPlace(i);
//            System.out.println(i + ", " + place);
            if (place < i) {
                time = numbers[i];
                for (int dataToUpdate = i; dataToUpdate >place; dataToUpdate--) {
//                    System.out.print(numbers[dataToUpdate-1] + ", " + numbers[dataToUpdate] + "  -->  ");
                    numbers[dataToUpdate] = numbers[dataToUpdate - 1];
//                    System.out.println(numbers[dataToUpdate-1] + ", " + numbers[dataToUpdate]);
                }
                numbers[place] = time;
            }
        }
    }

    public static int checkPlace(int i){
        int place = i;
        for (int j = 0; j < i; j++) {
            if (numbers[i] <= numbers[j]) {
                place = j;
                break;
            }
        }
        return place;
    }

    public static void main (String[] arguments) {
        sort();
        for (int i = 0; i < numbers.length; i++) {
            if (i < 9) {
                System.out.println(" " + (i + 1) + ": " + numbers[i]);
            } else {
                System.out.println((i + 1) + ": " + numbers[i]);
            }
        }
    }
}