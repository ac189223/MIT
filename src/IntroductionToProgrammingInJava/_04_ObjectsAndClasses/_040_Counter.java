package IntroductionToProgrammingInJava._04_ObjectsAndClasses;

public class _040_Counter {
    int myCount = 0;
    static int ourCount = 0;

    void increment(){
        myCount++;
        ourCount++;
    }

    public static void main(String[] args) {
        _040_Counter counter1 = new _040_Counter();
        _040_Counter counter2 = new _040_Counter();
        counter1.increment();
        counter1.increment();
        counter2.increment();
        System.out.println("Counter1: " + counter1.myCount + " " + counter1.ourCount);
        System.out.println("Counter2: " + counter2.myCount + " " + counter2.ourCount);
    }
}
