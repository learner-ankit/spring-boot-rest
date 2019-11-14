package com.account.manage.server.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.manage.server.main.model.AccountHistoryEntity;

@Repository
public interface AccountHistoryRepository
        extends JpaRepository<AccountHistoryEntity, Integer> {
	List<AccountHistoryEntity> findByaccountNo (Integer accountNo);
 
}
