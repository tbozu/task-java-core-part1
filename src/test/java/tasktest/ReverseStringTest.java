package tasktest;
import org.example.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    final String testDate = "I'm going to go to school today morning.";
    final String expectedResult = ".gninrom yadot loohcs ot og ot gniog m'I";

    @Test
    public void reversedStringWithStringBuffer(){
        String result = ReverseString.reversedStringWithStringBuffer(testDate);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedStringWithStringBuilder(){
       String result = ReverseString.reversedStringWithStringBuilder(testDate);
      Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedString(){
        String result = ReverseString.reversedString(testDate);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void reversedStringWithPoiners(){
        String result = ReverseString.reversedStringWithPoiners(testDate);
        Assert.assertEquals(expectedResult,result);
    }
}
