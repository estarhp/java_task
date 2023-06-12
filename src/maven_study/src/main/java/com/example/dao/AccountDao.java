package com.example.dao;

import com.example.model.Account;

import java.util.List;

public interface AccountDao {
   List<Account> findAll();
   int deleteByPrimaryKey(String Id);

   int insertAccount(Account record);

   Account selectByPrimaryKey(String ID);

   int updateByPrimaryKey(Account record);

}
