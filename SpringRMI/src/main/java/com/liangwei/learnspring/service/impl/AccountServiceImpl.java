package com.liangwei.learnspring.service.impl;

import com.liangwei.learnspring.domain.Account;
import com.liangwei.learnspring.service.AccountService;

import java.util.List;

/**
 * Created by liangwei on 2017/4/7.
 */
public class AccountServiceImpl implements AccountService {

    public void insertAccount(Account account) {

        System.out.println("AccountService #insertAccount");
    }

    public List<Account> getAccounts(String name) {
        System.out.println("AccountService#getAccounts,and name:"+name);
        return null;
    }
}
