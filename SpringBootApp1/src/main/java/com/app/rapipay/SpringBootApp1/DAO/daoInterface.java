package com.app.rapipay.SpringBootApp1.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.rapipay.SpringBootApp1.Entity.Sum;

@Repository
public interface daoInterface extends JpaRepository<Sum, Integer>{

}
