package Pessoas;

public class ProfissionalSaude extends Pessoas {

    private String especialidade;
    private String registroProfissional;


    public ProfissionalSaude(String primeiroNome, String ultimoNome,String CPF,String especialidade, String registroProfissional){

        super(primeiroNome, ultimoNome, CPF);

        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
