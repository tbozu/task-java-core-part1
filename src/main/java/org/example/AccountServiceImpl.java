package org.example;

public class AccountServiceImpl implements AccountService {

    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {

        for (Account account : accounts) {
            if (account.getUser().getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long balance) {

        long countNumberOfAccount = 0;

        for (Account account : accounts) {
            if (account.getBalance() >= balance) {
                countNumberOfAccount++;
            }
        }
        return countNumberOfAccount;
    }


}
