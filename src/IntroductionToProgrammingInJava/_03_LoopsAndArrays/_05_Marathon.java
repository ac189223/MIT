package IntroductionToProgrammingInJava._03_LoopsAndArrays;

public class _05_Marathon {

    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i=0; i<values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx= getMinIndex(values);

        for(int i=0; i<values.length; i++) {
            if (i == minIdx) continue;
            if (secondIdx == -1 || values[i] < values[secondIdx]) secondIdx = i;
        }
        return secondIdx;
    }

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 243, 265};

        System.out.println("The winner is " + names[getMinIndex(times)] + ".");
        System.out.println("The second one is " + names[getSecondMinIndex(times)] + ".");
    }
}
