package com.account.manage.server.main.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class AccountId implements Serializable{

	
    private Integer accountNo;
    
    private String accountName;  
    
    private Date valueDate;  
    
	
    private String currency;
     
    
	
    private String transactionType; 
    

}
