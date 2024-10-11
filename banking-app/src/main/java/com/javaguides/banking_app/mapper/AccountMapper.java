package com.javaguides.banking_app.mapper;

import com.javaguides.banking_app.dto.AccountDto;
import com.javaguides.banking_app.entity.Account;

public class AccountMapper {
    // Method to map AccountDto to Account entity
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    // Method to map Account entity to AccountDto
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance() // Corrected this line to use account's balance
        );
        return accountDto;
    }
}
