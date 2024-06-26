package com.example.demo.service;

import com.example.demo.controller.request.UsuarioRequest;
import com.example.demo.model.UsuarioEntity;
import com.example.demo.repository.PessoaFisicaRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.enumeradores.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*
CAMADA DE MAIS BAIXO NÍVEL QUE PROCESSA OS DADOS RECEBIDO PELO CONTROLLER
 */
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    //Metodo que mostra todos usuários cadastrados na DB.
    public List<UsuarioEntity> listarUsuarios() {
        List<UsuarioEntity> usuariosNoBanco = this.usuarioRepository.findAll();
        return usuariosNoBanco;
    }

    public UsuarioEntity addUsuario(UsuarioRequest usuarioRequest) {
        var dadosUsuario = UsuarioEntity.builder()
                .pessoaFisicaEntity(usuarioRequest.getPessoaFisicaEntity())
                .nomeCompleto(usuarioRequest.getNomeCompleto())
                .login(usuarioRequest.getLogin())
                .senha(usuarioRequest.getSenha())
                .endereco(usuarioRequest.getEndereco())
                .telefone(usuarioRequest.getTelefone())
                .tipoUsuario(TipoUsuario.valueOf(usuarioRequest.getTipoUsuario())).build();
        var usuarioCriado = this.usuarioRepository.save(dadosUsuario);
        return (UsuarioEntity) usuarioCriado;
    }

    public UsuarioEntity alterarUsuario(Long id, UsuarioRequest usuarioRequest) {
        var dadosAlteradosUsuario = usuarioRepository.save(UsuarioEntity.builder()
                .id_usuario(id)
                .nomeCompleto(usuarioRequest.getNomeCompleto())
                .login(usuarioRequest.getLogin())
                .senha(usuarioRequest.getSenha())
                .endereco(usuarioRequest.getEndereco())
                .telefone(usuarioRequest.getTelefone())
                .tipoUsuario(TipoUsuario.valueOf(usuarioRequest.getTipoUsuario()))
                .build());
        return dadosAlteradosUsuario;
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
