package domain.entity.Pessoas;

import domain.entity.Cadastros.CadastroPessoas;

import java.util.UUID;

/*
Acredito que essa Classe será a "MAIN" , Haja vista que ela irá iniciar os processos .

 */


public class Usuario extends CadastroPessoas {

    private UUID id;
    private String email;
    /*TODO : implementar SENHA*/
    private String perfil;
    //TODO : Implementar formas de identificar cada perfil e atribuir suas funcionalidades.

    public Usuario(String primeiroNome, String ultimoNome, String CPF, String email, String perfil){

        super(primeiroNome, ultimoNome, CPF);
        this.id = UUID.randomUUID();
        this.email = email;
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }
}