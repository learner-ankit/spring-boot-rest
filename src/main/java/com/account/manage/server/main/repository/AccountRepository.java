package com.account.manage.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.manage.server.main.model.AccountEntity;
 
@Repository
public interface AccountRepository
        extends JpaRepository<AccountEntity, Integer> {
 
}
