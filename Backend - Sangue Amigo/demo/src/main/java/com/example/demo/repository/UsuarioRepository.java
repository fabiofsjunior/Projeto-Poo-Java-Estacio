package com.example.demo.repository;


import com.example.demo.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/*
CAMADA DE BAIXO NÍVEL QUE INTERAGE COM O BANCO E PERSISTE OS DADOS
 */

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {


}
