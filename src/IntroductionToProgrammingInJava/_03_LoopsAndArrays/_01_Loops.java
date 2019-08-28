package IntroductionToProgrammingInJava._03_LoopsAndArrays;

public class _01_Loops {

    public static void main(String[] args) {

        int i= 0;
        while(i < 3) {
            System.out.println("Rule #" + i);
            i = i + 1;
        }

        for (i = 0; i <3; i=i+1) {
            System.out.println("Rule #" + i);
        }

        for (i = 0; i <5; i=i+1) {
            if (i == 2) break;
            System.out.println("Rule #" + i);
        }

        for (i = 0; i <5; i=i+1) {
            if (i == 2) continue;
            System.out.println("Rule #" + i);
        }

        for (i = 0; i < 3; i++) {
            for (int j = 2; j < 4; j++) {
                System.out.println (i + " " + j);
            }
        }

        int[] values = new int[5];
        for (i = 0; i < values.length; i++) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
        }

        int[] valuesWhile = new int[5];
        i = 0;
        while (i < valuesWhile.length) {
            valuesWhile[i] = i;
            int y = valuesWhile[i] * valuesWhile[i];
            System.out.println(y);
            i++;
        }
    }
}
