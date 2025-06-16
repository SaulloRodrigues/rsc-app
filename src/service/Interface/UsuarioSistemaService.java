package service.Interface;

import domain.entity.Pessoas.UsuarioSistema;

import java.util.List;
import java.util.UUID;

public interface UsuarioSistemaService {
    void cadastrarUsuario(UsuarioSistema usuario);
    UsuarioSistema buscarUsuario(UUID id);
    List<UsuarioSistema> listarUsuarios();
    void excluirUsuario(UUID id);
}
