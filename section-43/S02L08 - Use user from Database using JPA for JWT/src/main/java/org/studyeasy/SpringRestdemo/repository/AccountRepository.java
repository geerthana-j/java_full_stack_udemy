package org.studyeasy.SpringRestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studyeasy.SpringRestdemo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
