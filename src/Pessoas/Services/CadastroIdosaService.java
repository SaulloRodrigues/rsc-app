package Pessoas.Services;

import Pessoas.CadastroPessoas;
import Pessoas.Idosas;

import java.time.LocalDate;
import java.util.Scanner;
import Pessoas.vericacao_Dados.verificarCPF;

//Os logs e Scannersservem apenas para testar os métodos e devem ser excluídos ao implementar o front
public class CadastroIdosaService implements CadastroService {

    @Override
    public Idosas cadastrar() {

        String primeiroNomeIdosa;
        String ultimoNomeIdosa;
        String cpfIdosa;
        int diaNascimento;
        int mesNascimento;
        int anoNascimento;
        String nomeMae;
        String cartaoSUS;
        LocalDate dataEntrada;

        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Primeiro Nome : ");
            primeiroNomeIdosa = scan.next();

            System.out.println("Ultimo Nome : ");
            ultimoNomeIdosa = scan.next();

            while (true) {
                System.out.println("CPF : ");
                cpfIdosa = scan.next();
                try {
                    if (verificarCPF.validarCPF(cpfIdosa)) {
                        System.out.println("CPF válido 👍");
                        break; // CPF válido, sai do loop
                    }
                } catch(IllegalArgumentException e){
                    System.out.println("Erro: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            // TODO validação CPF

            System.out.println("Dia Nascimento  : ");
            diaNascimento = scan.nextInt();

            System.out.println("Mes Nascimento  : ");
            mesNascimento = scan.nextInt();

            System.out.println("Ano Nascimento  : ");
            anoNascimento = scan.nextInt();

            System.out.println("nome Mae : ");
            nomeMae = scan.next();

            System.out.println("cartao Sus : ");
            cartaoSUS = scan.next();

            return new Idosas(primeiroNomeIdosa, ultimoNomeIdosa, cpfIdosa, diaNascimento, mesNascimento, anoNascimento,
                    nomeMae, cartaoSUS);
        } catch (java.util.NoSuchElementException e) {

            System.out.println("Entrada inesperada , tente novamente");

        } catch (Exception e) {

            System.out.println("Erro : " + e.getMessage());
        }

        finally {

            if (scan != null) {
                scan.close();
            }
        }

        return null;
    }
}
