package domain.entity;

import java.util.UUID;

public class ProfissionalSaude extends CadastroPessoas {

    private UUID id;
    private String especialidade;
    private String registroProfissional;


    public ProfissionalSaude(String primeiroNome, String ultimoNome,String CPF,String especialidade, String registroProfissional){

        super(primeiroNome, ultimoNome, CPF);
        this.id = UUID.randomUUID();
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
    }

}
