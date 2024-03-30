package com.example.demo.repository;

import com.example.demo.model.InstituicaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoRepository extends JpaRepository<InstituicaoEntity,Long> {
}
