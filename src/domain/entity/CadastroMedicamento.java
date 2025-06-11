package domain.entity;

import java.util.Scanner;

public class CadastroMedicamento  {


    public Medicamento cadastrar(){

        Scanner scan = new Scanner(System.in);
        String nome;
        String dosagem;


        try{

            System.out.println("Nome medicamento: ");
            nome = scan.next();

            System.out.println("Dosagem medicamento: ");
            dosagem = scan.next();

            return new Medicamento(nome, dosagem, dosagem, 0);

        }
        catch (java.util.NoSuchElementException e) {

            System.out.println("Entrada inesperada, tente novamente");

        } catch (Exception e) {

        System.out.println("Erro : " + e.getMessage());
    }

        finally {

            scan.close();
        }

        return null;
    }
}


