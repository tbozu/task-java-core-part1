package tasktest;
import org.example.MakingChanges;
import org.example.Person;
import org.junit.Assert;
import org.junit.Test;

public class MakingChangeTest {
    public static transient String testData = "Nick50Tudor20";
    @Test
    public void checkChangeIdentities(){
        Person person1 = new Person("Tudor",20);
        Person person2 = new Person("Nick",50);
        String personTest = MakingChanges.changeIdentities(person1,person2);
        Assert.assertEquals(testData,personTest);

    }
}
