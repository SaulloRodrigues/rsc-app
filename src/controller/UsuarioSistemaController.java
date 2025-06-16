package controller;

import domain.entity.Pessoas.UsuarioSistema;
import repository.impl.UsuarioSistemaRepositoryImpl;
import service.Interface.UsuarioSistemaService;
import service.impl.UsuarioSistemaServiceImpl;

import java.util.List;
import java.util.UUID;

public class UsuarioSistemaController {

    private final UsuarioSistemaService usuarioSistemaService;

    public UsuarioSistemaController() {
        // Injeção simples manual
        this.usuarioSistemaService = new UsuarioSistemaServiceImpl(new UsuarioSistemaRepositoryImpl());
    }

    public void criarUsuario(String email, String senha, String perfil) {
        UsuarioSistema usuario = new UsuarioSistema(UUID.randomUUID(), email, senha, perfil);
        usuarioSistemaService.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getId());
    }

    public void listarUsuarios() {
        List<UsuarioSistema> usuarios = usuarioSistemaService.listarUsuarios();
        usuarios.forEach(usuario -> System.out.println(
                usuario.getId() + " | " + usuario.getEmail() + " | " + usuario.getPerfil()
        ));
    }

    public void buscarUsuario(UUID id) {
        UsuarioSistema usuario = usuarioSistemaService.buscarUsuario(id);
        System.out.println("Usuário encontrado: " + usuario.getEmail());
    }

    public void excluirUsuario(UUID id) {
        usuarioSistemaService.excluirUsuario(id);
        System.out.println("Usuário excluído com sucesso: " + id);
    }
}
