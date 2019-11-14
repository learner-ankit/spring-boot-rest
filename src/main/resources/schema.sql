DROP TABLE IF EXISTS ACCOUNTS;
DROP TABLE IF EXISTS ACCOUNT_HISTORY;
 
CREATE TABLE ACCOUNTS (
  account_number INT PRIMARY KEY,
  account_name VARCHAR(250) NOT NULL,
  account_type VARCHAR(250) NOT NULL,
  balance_date DATE,
  currency VARCHAR(20),
  opening_balance VARCHAR(250) DEFAULT NULL
);

CREATE TABLE ACCOUNT_HISTORY (
  account_number INT,
  account_name VARCHAR(250) NOT NULL,
  value_date DATE,
  currency VARCHAR(20),
  debit_amount VARCHAR(250) DEFAULT NULL,
  credit_amount VARCHAR(250) DEFAULT NULL,
  transaction_type VARCHAR(250),
  transaction_narrative VARCHAR(250) DEFAULT NULL
);