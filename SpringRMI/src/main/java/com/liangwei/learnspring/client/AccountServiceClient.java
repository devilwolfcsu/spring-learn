package com.liangwei.learnspring.client;

import com.liangwei.learnspring.domain.Account;
import com.liangwei.learnspring.service.AccountService;

import java.util.List;

/**
 * Created by liangwei on 2017/4/7.
 */
public class AccountServiceClient {

    private AccountService accountService;


    public void insertAccount(Account account){
        System.out.println("in simpleObject insertAccount!");
        accountService.insertAccount(account);
    }

    public List<Account> getAccounts(String name){
        System.out.println("name:"+name);
        accountService.getAccounts(name);
        return null;
    }

    public void setSimpleAccountService(AccountService simpleAccountService) {
        this.accountService = simpleAccountService;
    }


}
