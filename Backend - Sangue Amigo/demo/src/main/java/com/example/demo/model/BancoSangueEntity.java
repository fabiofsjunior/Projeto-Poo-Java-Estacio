package com.example.demo.model;

import com.example.demo.service.enumeradores.FatorSanguineo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(schema = "public", name = "banco_sangue")
public class BancoSangueEntity {

    @Id
    @Column(name = "id_banco_sangue", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBancoSangue;
    @Column(name = "fator_sanguineo", nullable = false)
    private FatorSanguineo fatorSanguineo;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "validade", nullable = false)
    private DateFormat validade;

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            targetEntity = InstituicaoEntity.class)
    private InstituicaoEntity fkBancoSangue;



}
