package org.example;

public interface AccountService {
    Account findAccountByOwnerId(long id);
    abstract long countAccountsWithBalanceGreaterThan(long balance);

}
