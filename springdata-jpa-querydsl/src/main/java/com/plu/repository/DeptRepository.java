package com.plu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.plu.domain.Dept;

@Transactional(readOnly = true)
public interface DeptRepository extends JpaRepository<Dept, Long> {

}
