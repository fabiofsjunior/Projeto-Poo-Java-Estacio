package com.example.demo.repository;

import com.example.demo.model.PessoaFisicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisicaEntity,Long> {
}
