package domain.entity;

import java.time.LocalDate;

public class Idosas extends CadastroPessoas {

    private LocalDate dataNascimento;
    private String nomeMae;
    private String cartaoSUS;
    private LocalDate dataEntrada;
    /* TODO : private ProntuarioMedico prontuario; // */

    public Idosas(String primeiroNome, String ultimoNome,String CPF, int diaNascimento, int mesNascimento, int anoNascimento, String nomeMae, String cartaoSUS ){

        super(primeiroNome, ultimoNome, CPF);
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        this.nomeMae = nomeMae;
        this.cartaoSUS = cartaoSUS;
        this.dataEntrada = LocalDate.now();
    }
}
 