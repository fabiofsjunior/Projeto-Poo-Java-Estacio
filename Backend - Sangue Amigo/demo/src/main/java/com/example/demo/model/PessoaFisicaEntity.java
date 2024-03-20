package com.example.demo.model;

import com.example.demo.service.enumeradores.DoadorMedula;
import com.example.demo.service.enumeradores.FatorSanguineo;
import com.example.demo.service.enumeradores.GrauPrioridade;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(schema = "public", name = "pessoa_fisica")
public class PessoaFisicaEntity {

    @Id
    @Column(name = "id_pessoa_fisica", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoaFisica;

    @Column(name = "cpf_pessoa_fisica", nullable = false)
    private String cpf;
    @Column(name = "data_nascimento", nullable = false)

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String dataNascimento;
    @Column(name = "fator_sanguineo", nullable = false)
    private FatorSanguineo fatorSanguineo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "data_ultima_doacao", nullable = false)
    private String dataUltimaDoacao;
    @Column(name = "doador_medula", nullable = false)
    private DoadorMedula doadorMedula;
    @Column(name = "restricao", nullable = false)
    private boolean restricao;
    @Column(name = "grau_prioridade", nullable = false)
    private GrauPrioridade grauPrioridade;

    //@OneToOne(targetEntity = UsuarioEntity.class)
    // @JoinColumn(name = "fk_id_usuario")
    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = UsuarioEntity.class)
    private UsuarioEntity fkPessoaFisica;


}
