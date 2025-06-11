package domain.entity;

import java.util.UUID;
import java.time.LocalDate;

public class Vacina {

    private UUID id;
    private String nomeVacina;
    private LocalDate dataAplicacao;
    private String identificacao;

    public Vacina(String nomeVacina, LocalDate dataAplicacao, String identificacao) {
        this.id = UUID.randomUUID();
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = dataAplicacao;
        this.identificacao = identificacao;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "id=" + id +
                ", nomeVacina='" + nomeVacina + '\'' +
                ", dataAplicacao=" + dataAplicacao +
                ", identificacao='" + identificacao + '\'' +
                '}';
    }
}
