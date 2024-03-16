package com.example.demo.model;

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
@Table(schema = "public", name = "intituicao")
public class InstituicaoEntity {

    @Id
    @PrimaryKeyJoinColumn(name = "id_instituicao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstituicao;
    @Column(name = "numero_cnpj")
    private String cnpj;
    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = UsuarioEntity.class)
    private UsuarioEntity fkInstituicao;


}
