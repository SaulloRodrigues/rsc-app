package Medicamento;

import java.util.UUID;

public class Medicamento {

    private String nome;
    private UUID id;
    private String dosagem;
    //Data de validade seria útil ?
    // Quantidade em estoque seria necessário ?

    public Medicamento(String nome, String dosagem) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.id = UUID.randomUUID();
}
}

