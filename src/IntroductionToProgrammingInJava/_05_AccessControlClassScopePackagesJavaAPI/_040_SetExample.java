package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

import java.util.TreeSet;

public class _040_SetExample {

    public static void main(String[] arguments){
        TreeSet<String> strings = new TreeSet<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");

        System.out.println(strings.size());
        System.out.println(strings.first());
        System.out.println(strings.last());
        strings.remove("Eugene");

        for (String s : strings){
            System.out.println(s);
        }
    }
}
