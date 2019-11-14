package com.account.manage.server.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.manage.server.main.exception.RecordNotFoundException;
import com.account.manage.server.main.model.AccountEntity;
import com.account.manage.server.main.model.AccountHistoryEntity;
import com.account.manage.server.main.service.AccountService;


 
@RestController
@RequestMapping("/accounts")
public class AccountController
{
    @Autowired
    AccountService service;
 
    @GetMapping
    public ResponseEntity<List<AccountEntity>> getAllAccounts() {
        List<AccountEntity> list = service.getAllAccounts();
 
        return new ResponseEntity<List<AccountEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<List<AccountHistoryEntity>> getAccountById(@PathVariable("id") int id)
                                                    throws RecordNotFoundException {
    	List<AccountHistoryEntity> list = service.getAccountByNumber(id);
 
        return new ResponseEntity<List<AccountHistoryEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
     
}