package com.example.demo.repository;

import com.example.demo.model.BancoSangueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoSangueRepository extends JpaRepository<BancoSangueEntity, Long> {
}
