INSERT INTO 
	ACCOUNTS (account_number, account_name, account_type,balance_date,currency,opening_balance) 
VALUES
  	(585309209, 'SGSavings726', 'Savings',to_date('08/11/2018','dd/mm/yyyy'),'SGD','84327.51'),
  	(791066619, 'AUSavings933', 'Savings',to_date('08/11/2018','dd/mm/yyyy'),'AUD','88005.93'),
  	(321143408, 'AUCurrent433', 'Current',to_date('08/11/2018','dd/mm/yyyy'),'AUD','38010.62'),
  	(347786244, 'SGCurrent166', 'Current',to_date('08/11/2018','dd/mm/yyyy'),'SGD','50664.65'),
  	(680168913, 'AUCurrent374', 'Current',to_date('08/11/2018','dd/mm/yyyy'),'AUD','41327.28');
	
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (585309209, 'Current Account',to_date('12/01/2012','dd/mm/yyyy'),'SGD','777','84327.51','credit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (585309209, 'Current Account',to_date('12/01/2014','dd/mm/yyyy'),'SGD','777','8427.51','debit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (791066619, 'Current Account',to_date('12/01/2012','dd/mm/yyyy'),'SGD','777','84327.51','credit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (791066619, 'Current Account',to_date('12/01/2014','dd/mm/yyyy'),'SGD','777','8427.51','debit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (321143408, 'Current Account',to_date('12/01/2012','dd/mm/yyyy'),'SGD','777','84327.51','credit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (321143408, 'Current Account',to_date('12/01/2014','dd/mm/yyyy'),'SGD','777','8427.51','debit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (347786244, 'Current Account',to_date('12/01/2012','dd/mm/yyyy'),'SGD','777','84327.51','credit','transaction');
	INSERT INTO ACCOUNT_HISTORY (account_number, account_name,value_date,currency,debit_amount,credit_amount,transaction_type,transaction_narrative) VALUES (347786244, 'Current Account',to_date('12/01/2014','dd/mm/yyyy'),'SGD','777','8427.51','debit','transaction');
	