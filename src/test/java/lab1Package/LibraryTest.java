package lab1Package;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void TestLibraryFunction(){
        Library myLib = new Library();
        Assert.assertTrue(myLib.someLibraryMethod());
    }
    @Test
    public void TestAnotherFunction(){
        Library myLib = new Library();
        Assert.assertFalse(myLib.anotherLibraryMethod());
    }
}