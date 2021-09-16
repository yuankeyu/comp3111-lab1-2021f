package lab1Package;

public class SomeNewLib {
    private static int countLib = 0;
    private int count;
    public SomeNewLib(){count = ++countLib;}
    public void execute(){
        System.out.printf("NewLib %d executes", count);
    }
}