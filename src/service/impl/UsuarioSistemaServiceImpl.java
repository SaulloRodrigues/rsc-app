package service.impl;

import domain.entity.Pessoas.UsuarioSistema;
import repository.Interfaces.UsuarioSistemaRepository;
import service.Interface.UsuarioSistemaService;

import java.util.List;
import java.util.UUID;

public class UsuarioSistemaServiceImpl implements UsuarioSistemaService {

    private final UsuarioSistemaRepository usuarioSistemaRepository;

    public UsuarioSistemaServiceImpl(UsuarioSistemaRepository usuarioSistemaRepository) {
        this.usuarioSistemaRepository = usuarioSistemaRepository;
    }

    @Override
    public void cadastrarUsuario(UsuarioSistema usuario) {
        usuarioSistemaRepository.save(usuario);
    }

    @Override
    public UsuarioSistema buscarUsuario(UUID id) {
        return usuarioSistemaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    @Override
    public List<UsuarioSistema> listarUsuarios() {
        return usuarioSistemaRepository.findAll();
    }

    @Override
    public void excluirUsuario(UUID id) {
        usuarioSistemaRepository.delete(id);
    }
}
