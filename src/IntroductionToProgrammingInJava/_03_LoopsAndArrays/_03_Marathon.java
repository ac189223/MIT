package IntroductionToProgrammingInJava._03_LoopsAndArrays;

public class _03_Marathon {

    static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    static int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 243, 265};

    public static void sort() {
        int time;
        String name;
        for (int i = 1; i < times.length; i++) {
            int place = checkPlace(i);
            if (place < i) {
                time = times[i];
                name = names[i];
                for (int dataToUpdate = i; dataToUpdate >place; dataToUpdate--) {
                    times[dataToUpdate] = times[dataToUpdate - 1];
                    names[dataToUpdate] = names[dataToUpdate - 1];
                }
                times[place] = time;
                names[place] = name;
            }
        }
    }

    public static int checkPlace(int i){
        int place = i;
        for (int j = 0; j < i; j++) {
            if (times[i] <= times[j]) {
                place = j;
                break;
            }
        }
        return place;
    }

    public static void printPlaces() {
        int[] places = createPlaces();
        System.out.print("Place  " + places[0] + " goes to " + names[0]);
        for (int i = 1; i < times.length; i++) {
            if (times[i-1] == times[i]) {
                System.out.print(" and " + names[i]);
            } else {
                System.out.println(".");
                if (places[i] < 10) {
                    System.out.print("Place  " + places[i] + " goes to " + names[i]);
                } else {
                    System.out.print("Place " + places[i] + " goes to " + names[i]);
                }
            }
        }
        System.out.println(".");
    }

    public static int[] createPlaces() {
        int[] places = new int[times.length];
        int place = 1;
        places[0] = place;
        for (int i = 1; i < places.length; i++) {
            if (times[i] == times[i-1]) {
                places[i] = place;
            } else {
                place++;
                places[i] = place;
            }
        }
        return places;
    }

    public static void printPlace(int place){
        int[] places = createPlaces();
        int i;
        for (i = 0; i < places.length; i++) {
            if (places[i] == place){
                System.out.print("Place " + places[i] + " goes to " + names[i]);
                break;
            }
        }
        for (int j = i+1; j < times.length; j++) {
            if (times[j-1] == times[j]) {
                System.out.print(" and " + names[j]);
            } else {
                System.out.println(".");
                break;
            }
        }
    }

    public static void main (String[] arguments) {
        sort();
        for (int i =0; i < names.length; i++) {
            System.out.println(names[i] +": " + times[i]);
        }
        printPlaces();
        printPlace(10);
    }
}