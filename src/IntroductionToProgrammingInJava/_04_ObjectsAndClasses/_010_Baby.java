package IntroductionToProgrammingInJava._04_ObjectsAndClasses;

public class _010_Baby {

    public static class Baby {
        String name;
        boolean isMale;
        double weight;
        double decibels;
        int numPoops = 0;
        Baby[] siblings;
        static int numberBabiesMade = 0;

        public Baby(String name, boolean isMale, double weight, double decibels, int numPoops) {
            this.name = name;
            this.isMale = isMale;
            this.weight = weight;
            this.decibels = decibels;
            this.numPoops = numPoops;
            this.numberBabiesMade++;
        }

        void poop() {
            numPoops += 1;
            System.out.println("Dear mother, I have pooped. Ready the diaper. Your " + name);
        }

        void sayHi() {
            System.out.println("Hi, my name is " + name + "!");
        }

        void eat(double foodWeight) {
            if (foodWeight >= 0 && foodWeight < weight) {
                weight = weight + foodWeight;
                System.out.println("My weight now is " + weight + ".");
            } else {
                System.out.println("Too much for me. Cannot eat it!");
            }
        }
    }

    public static void main(String[] args) {
        Baby baby01 = new Baby("Alex", true, 4.6, 5000.5, 55);
        Baby baby02 = new Baby("Thorin", true, 5.1, 4300.0, 11);
        baby01.sayHi();
        baby02.sayHi();
        baby01.eat(1.3);
        baby01.poop();
        baby02.poop();
        baby02.eat(7.7);
        baby01.poop();
        System.out.println(baby01.name + " pooped " + baby01.numPoops + " times, and " +
                baby02.name + " only " + baby02.numPoops + " times!");
        System.out.println(("We have " + Baby.numberBabiesMade + " babies so far!"));
    }

}
