package domain.entity;

import java.util.UUID;

public class Medicamento {

    private UUID id;
    private String nome;
    private String dosagem;
    private String frequencia;
    private int duracaoDias;

    public Medicamento(String nome, String dosagem, String frequencia, int duracaoDias) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.duracaoDias = duracaoDias;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dosagem='" + dosagem + '\'' +
                ", frequencia='" + frequencia + '\'' +
                ", duracaoDias=" + duracaoDias +
        '}';
    }
}
