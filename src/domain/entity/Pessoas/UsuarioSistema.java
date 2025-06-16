package domain.entity.Pessoas;

import java.util.UUID;

public class UsuarioSistema {
    public UUID id;
    private String email;
    private String senha;
    private String perfil; // enum (por enquanto String para simplificar)

    public UsuarioSistema() {}

    public UsuarioSistema(UUID id, String email, String senha, String perfil) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
