package com.liangwei.learnspring.service;

import com.liangwei.learnspring.domain.Account;

import java.util.List;

/**
 * Created by liangwei on 2017/4/7.
 */
public interface AccountService {
    void insertAccount(Account account);

    List<Account> getAccounts(String name);
}
