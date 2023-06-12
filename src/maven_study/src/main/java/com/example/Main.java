package com.example;

import com.example.model.Account;
import com.example.service.AccountService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        AccountService service;
        try {
            service = new AccountService();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Account newAccount = new Account();
//创建一行数据
        newAccount.setId("dsaas2ewq");
        newAccount.setMoney(13123);
        Date createtime = new Date();
        newAccount.setCreateTime(createtime);
        newAccount.setName("dasdahjjkdeqw");



        Account updatedAccount = new Account();
        updatedAccount.setId("dasdas");
        updatedAccount.setName("NewName");
        updatedAccount.setMoney(500);
        Date updatetime = new Date();
        updatedAccount.setUpdateTime(updatetime);
        service.updateByPrimaryKey(updatedAccount);

       service.insert(newAccount);

        List<Account> accountList = service.Find();

        for (Account account: accountList
             ) {
            System.out.println(account);
        }


          service.deleteByPrimaryKey("dasdas");


       Account selectAccount =  service.selectByPrimaryKey("dsaas2ewq");

        System.out.println(selectAccount);



        service.destroy();


    }




}