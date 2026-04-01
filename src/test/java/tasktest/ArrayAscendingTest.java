package tasktest;

import org.example.ArrayAscending;
import org.junit.*;
import org.junit.Test;

public class ArrayAscendingTest {

    int [] arrayTest = {1,2,5,4,7,10};
    @Test
    public void arrayCheckIfAscendingCorrect(){
        Boolean resultTrue = ArrayAscending.checkArrayIfAscending(arrayTest.length,arrayTest);
        Assert.assertTrue("Message if this array is Ascending ",resultTrue);

    }
    @Test
    public void arrayCheckIfAscendingFalse(){
        Boolean resultFalse = ArrayAscending.checkArrayIfAscending(arrayTest.length,arrayTest);
        Assert.assertFalse("Message if this array is't Ascending",resultFalse);
    }

}
