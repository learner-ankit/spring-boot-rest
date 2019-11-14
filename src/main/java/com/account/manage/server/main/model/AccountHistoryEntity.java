package com.account.manage.server.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(AccountId.class)
@Table(name="ACCOUNT_HISTORY")
public class AccountHistoryEntity {
    
	@Id
    @Column(name="account_number")
    private Integer accountNo;
    
	@Id
    @Column(name="account_name")
    private String accountName;  
    
	@Id
    @Column(name="value_date")
    private Date valueDate;  
    
	@Id
    @Column(name="currency")
    private String currency;
    
	
    @Column(name="debit_amount")
    private String debitAmount; 
    
	
    @Column(name="credit_amount")
    private String creditAmount; 
    
	@Id
    @Column(name="transaction_type")
    private String transactionType; 
    
	
    @Column(name="transaction_narrative")
    private String transactionNarrative;    
    
    

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


	public Date getValueDate() {
		return valueDate;
	}


	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

	@Override
	    public String toString() {
	        return "AccountHistoryEntity [accountNo=" + accountNo + ", accountName=" + accountName + 
	                ", valueDate=" + valueDate + ", currency=" + currency   + ", debitAmount=" + debitAmount + ", creditAmount=" + creditAmount + " , transactionType=" + transactionType + " , transactionNarrative=" + transactionNarrative + " ]";
	    }
}