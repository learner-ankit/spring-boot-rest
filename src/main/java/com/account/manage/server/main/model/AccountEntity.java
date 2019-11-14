package com.account.manage.server.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class AccountEntity {

    @Id
    @Column(name="account_number")
    private Integer accountNo;
    
    @Column(name="account_name")
    private String accountName;   
   
    
    @Column(name="account_type")
    private String accountType;
    
    @Column(name="balance_date")
    private Date balanceDate;
    
    @Column(name="currency")
    private String currency;
    
    @Column(name="opening_balance")
    private String openingBalance;    
      

    public Integer getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Date getBalanceDate() {
		return balanceDate;
	}


	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}


	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	 @Override
	    public String toString() {
	        return "AccountEntity [accountNo=" + accountNo + ", accountName=" + accountName + 
	                ", balanceDate=" + balanceDate + ", currency=" + currency   + ", openingBalance=" + openingBalance + "]";
	    }
}