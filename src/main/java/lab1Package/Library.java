package lab1Package;

public class Library {
    public static void main(String arg[]){
        Library newLib = new Library();
        SomeNewLib aNewLib = new SomeNewLib();
        if(newLib.someLibraryMethod()) {
            System.out.println("Hello World!");
        }
        aNewLib.execute();
    }
    public boolean someLibraryMethod(){
        System.out.println("Function Executed");
        return true;
    }
    public boolean anotherLibraryMethod(){
        return false;
    }
}
