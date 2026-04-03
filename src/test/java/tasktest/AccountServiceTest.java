package tasktest;
import org.example.Account;
import org.example.AccountService;
import org.example.AccountServiceImpl;
import org.example.User;
import org.junit.Assert;
import org.junit.Test;

public class AccountServiceTest {

    Account[] accounts = {
            new Account(1,200033L,new User(1,"Tudor","Furry")),
            new Account(2,200033L,new User(2,"Nick","Willams"))
    };

    @Test
    public void checkIfUserIdIsFind(){
        AccountService service = new AccountServiceImpl(accounts);
        Assert.assertNotNull(service.findAccountByOwnerId(1L));

    }
    @Test
    public void checkIfUserIdIsNotFind(){
        AccountService service = new AccountServiceImpl(accounts);
        Assert.assertNull(service.findAccountByOwnerId(3L));
    }
    @Test
    public void checkIfAccoutWithBalnceIsSame(){
        AccountService service = new AccountServiceImpl(accounts);
        long resultActualBalance = service.countAccountsWithBalanceGreaterThan(200033L);
        Assert.assertEquals(2,resultActualBalance);
    }

    @Test
    public void checkIfAccoutWithBalnceIsDifferent(){
        AccountService service = new AccountServiceImpl(accounts);
        long resultActualBalanceDifferent = service.countAccountsWithBalanceGreaterThan(200033L);
        Assert.assertNotEquals(1,resultActualBalanceDifferent);
    }



}
