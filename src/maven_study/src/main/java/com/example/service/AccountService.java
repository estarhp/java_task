package com.example.service;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.example.model.Account;
import com.example.dao.AccountDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountService  {

    private InputStream inputStream;
    private SqlSession sqlSession;

    private  AccountDao accountDao;

    //初始化

    public AccountService() throws IOException {
        try{
             inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");


            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            sqlSession  = factory.openSession();

             accountDao = sqlSession.getMapper(AccountDao.class);
        }catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void destroy() throws IOException {

        try {
            sqlSession.commit();
            sqlSession.close();
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Account> Find(){
        return accountDao.findAll();
    }

    public void deleteByPrimaryKey(String ID){
         int p =  accountDao.deleteByPrimaryKey(ID);
         System.out.println(p);
    }

    public void insert(Account record ){
        int p =  accountDao.insertAccount(record);
        System.out.println(p);
    }


    public Account selectByPrimaryKey(String ID) {

        return accountDao.selectByPrimaryKey(ID);
    }

    public void updateByPrimaryKey(Account record){
     int p = accountDao.updateByPrimaryKey(record);
     System.out.println(p);
    }

    public void transfer(String remitterID,String remitteeID,int money){

    }







}
