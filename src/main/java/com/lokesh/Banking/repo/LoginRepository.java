package com.lokesh.Banking.repo;
import com.lokesh.Banking.model.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository  extends JpaRepository<Login, Long>{

}
