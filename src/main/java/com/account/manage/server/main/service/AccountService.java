package com.account.manage.server.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.manage.server.main.exception.RecordNotFoundException;
import com.account.manage.server.main.model.AccountEntity;
import com.account.manage.server.main.model.AccountHistoryEntity;
import com.account.manage.server.main.repository.AccountHistoryRepository;
import com.account.manage.server.main.repository.AccountRepository;


 
@Service
public class AccountService {
     
    @Autowired
    AccountRepository repository;
    
    @Autowired
    AccountHistoryRepository historyRepository;
     
    public List<AccountEntity> getAllAccounts()
    {
        List<AccountEntity> accountList = repository.findAll();
        
       
         
        if(accountList.size() > 0) {
            return accountList;
        } else {
            return new ArrayList<AccountEntity>();
        }
    }
     
    public List<AccountHistoryEntity> getAccountByNumber(int accountNumber) throws RecordNotFoundException
    {
        List<AccountHistoryEntity> accountHistory = historyRepository.findByaccountNo(accountNumber);
        
         
        if(accountHistory.size() > 0) {
            return accountHistory;
        } else {
            return new ArrayList<AccountHistoryEntity>();
        }
    }     
   
}