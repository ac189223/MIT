package IntroductionToProgrammingInJava._03_LoopsAndArrays;

import java.util.ArrayList;

public class _02_Marathon {

    public static ArrayList<Integer> first(int[] times) {
        int firstScore = times[0];
        for (int time : times) {
            if (time < firstScore) {
                firstScore = time;
            }
        }
        ArrayList<Integer> firstRunners = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            if (times[i] == firstScore) {
                firstRunners.add(i);
            }
        }
        return firstRunners;
    }

    public static ArrayList<Integer> second(int[] times, int first) {
        int secondScore = 0;
        for (int time : times) {
            if (time != times[first]) {
                secondScore = time;
                break;
            }
        }
        for (int time : times) {
            if (time < secondScore && time != times[first]) {
                secondScore = time;
            }
        }
        ArrayList<Integer> secondRunners = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            if (times[i] == secondScore) {
                secondRunners.add(i);
            }
        }
        return secondRunners;
    }

    public static void main (String[] arguments) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 243, 265};
        for (int i =0; i < names.length; i++) {
            System.out.println(names[i] +": " + times[i]);
        }

        ArrayList<Integer> firstRunners = first(times);
        if (firstRunners.size() == 1) {
            System.out.println("The winner is " + names[firstRunners.get(0)] + ".");
        } else {
            System.out.print("The winners are ");
            for (int i = 0; i < firstRunners.size() - 1; i++) {
                System.out.print(names[firstRunners.get(i)] + " and ");
            }
            System.out.println(names[firstRunners.get(firstRunners.size()-1)] + ".");
        }

        ArrayList<Integer> secondRunners = second(times, firstRunners.get(0));
        if (secondRunners.size() == 0) {
            System.out.println("There is no second place, all are winners!");
        } else if (secondRunners.size() == 1) {
            System.out.println("Second place is taken by " + names[secondRunners.get(0)] + ".");
        } else {
            System.out.print("Second place is taken by ");
            for (int i = 0; i < secondRunners.size() - 1; i++) {
                System.out.print(names[secondRunners.get(i)] + " and ");
            }
            System.out.println(names[secondRunners.get(secondRunners.size()-1)] + ".");
        }
    }
}