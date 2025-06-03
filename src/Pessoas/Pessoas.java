package Pessoas;

import java.util.UUID;

public class Pessoas {

    private String primeiroNome;
    private String ultimoNome;
    private String CPF;
    private UUID id;

    public Pessoas(String primeiroNome, String ultimoNome, String CPF) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.CPF = CPF;
        this.id = UUID.randomUUID();
    }

    public String getNome(){

        String nomeCompleto = (primeiroNome + " " + ultimoNome);

        return nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public UUID getId() {
        return id;
    }
}