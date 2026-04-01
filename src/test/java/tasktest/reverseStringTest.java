package tasktest;
import org.example.reverseString;
import org.junit.Assert;
import org.junit.Test;

public class reverseStringTest {

    final String testDate = "I'm going to go to school today morning.";
    final String expectedResult = ".gninrom yadot loohcs ot og ot gniog m'I";

    @Test
    public void reversedStringWithStringBuffer(){
        String result = reverseString.reversedStringWithStringBuffer(testDate);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedStringWithStringBuilder(){
       String result = reverseString.reversedStringWithStringBuilder(testDate);
      Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedString(){
        String result = reverseString.reversedString(testDate);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedStringWithPoiners(){
        String result = reverseString.reversedStringWithPoiners(testDate);
        Assert.assertEquals(expectedResult,result);
    }
}
