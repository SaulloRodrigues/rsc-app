package domain.entity.Procedimentos;

import java.time.LocalDate;

public class Internacao {
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String motivo;
    private String local;

    public Internacao() {
        this.dataEntrada = null;
        this.dataSaida = null;
        this.motivo = "";
        this.local = "";
    }

    // Metódo registrarInternacao - Faz os setters de uma vez só.
    public void registrarInternacao(LocalDate dataEntradaInternacao, LocalDate dataSaidaInternacao, String motivoInternacao, String localInternacao) {
        this.dataEntrada = dataEntradaInternacao;
        this.dataSaida = dataSaidaInternacao;
        this.motivo = motivoInternacao;
        this.local = localInternacao;
    }

    // Metódo visualizarInternacao - Visualização dos dados da respectiva Internação.
    public void visualizarInternacao() {
        System.out.println("--- Internação Dados ---");
        System.out.println("Data de Entrada: " + (dataEntrada != null ? dataEntrada : "Não definida"));
        System.out.println("Data de Saída: " + (dataSaida != null ? dataSaida : "Não definida"));
        System.out.println("Motivo: " + (motivo.isEmpty() ? "Não informado" : motivo));
        System.out.println("Local: " + (local.isEmpty() ? "Não informado" : local));
    }
}
