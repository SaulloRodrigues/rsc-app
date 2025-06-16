package service.impl;

import java.util.Scanner;

import domain.entity.Interfaces.CadastroService;
import domain.entity.Pessoas.ProfissionalSaude;

//Os logs e Scannersservem apenas para testar os métodos e devem ser excluídos ao implementar o front
public class CadastroProfissionalSaudeService implements CadastroService{

    @Override
    public ProfissionalSaude cadastrar() {

        String primeiroNomeProfissional;
        String ultimoNomeProfissional;
        String cpfProfissional;
        String especialidade;
        String registroProfissional;

        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("Primeiro Nome : ");
            primeiroNomeProfissional = scan.next();

            System.out.println("Ultimo Nome : ");
            ultimoNomeProfissional = scan.next();

            System.out.println("CPF : ");
            cpfProfissional = scan.next();
            //TODO validação CPF

            System.out.println("Especialidade : ");
            especialidade = scan.next();

            System.out.println("Registro do Profissional : ");
            registroProfissional = scan.next();

            return new ProfissionalSaude(primeiroNomeProfissional, ultimoNomeProfissional, cpfProfissional, especialidade, registroProfissional);
        }
        catch (java.util.NoSuchElementException e) {

            System.out.println("Entrada inesperada , tente novamente");

        } catch (Exception e) {

            System.out.println("Erro : " + e.getMessage());
        }

        finally {

            if (scan != null){
                scan.close();
            }
        }
        return null;
    }
}
