package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int maxNumber = first>second ? first : first==second?first:second;
        System.out.println(maxNumber);
    }
}
