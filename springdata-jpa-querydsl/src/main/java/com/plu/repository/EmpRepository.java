package com.plu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

import com.plu.domain.Emp;

@Transactional(readOnly = true)
public interface EmpRepository extends JpaRepository<Emp, Long>,
		QueryDslPredicateExecutor<Emp> {

}
