package service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import domain.entity.Internacao;

public class CadastroInternacaoService {
    public void cadastrar() {

         Internacao internacao = new Internacao();
         LocalDate dataEntradaInternacao;
         LocalDate dataSaidaInternacao;
         String motivoInternacao;
         String localInternacao;

         Scanner scan = new Scanner(System.in);

         try {
             // Solicitando os dados para a ficha de internação.
             System.out.println("Digite a data de entrada (AAAA-MM-DD): ");
             dataEntradaInternacao = LocalDate.parse(scan.nextLine());

             System.out.println("Digite a data de saída (AAAA-MM-DD): ");
             dataSaidaInternacao = LocalDate.parse((scan.nextLine()));

             System.out.println("Digite o motivo da internação: ");
             motivoInternacao = scan.nextLine();

             System.out.println("Digite o local de internação: ");
             localInternacao = scan.nextLine();

             // Cadastro da internação com o metódo "cadastrarInternacao" da classe Internacao
             internacao.registrarInternacao(dataEntradaInternacao,dataSaidaInternacao,motivoInternacao,localInternacao);

             System.out.println("Internação cadastrada com sucesso!");

         } catch (DateTimeParseException e) {
             System.out.println("Data inválida. Por favor, utilize o formato AAAA-MM-DD.");
         } catch (Exception e) {
             System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
         } finally {
             scan.close();
         }
    }
}
