package service;

import domain.entity.UsuarioSistema;

import java.util.List;
import java.util.UUID;

public interface UsuarioSistemaService {
    void cadastrarUsuario(UsuarioSistema usuario);
    UsuarioSistema buscarUsuario(UUID id);
    List<UsuarioSistema> listarUsuarios();
    void excluirUsuario(UUID id);
}
