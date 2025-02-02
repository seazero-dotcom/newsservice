package com.news.domain.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Query("SELECT c FROM Company c ORDER BY c.id DESC")
    List<Company> findAllDesc();

    List<Company> findByNameContaining(String keyword);
}
