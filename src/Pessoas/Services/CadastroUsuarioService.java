package Pessoas.Services;

import Pessoas.CadastroPessoas;
import Pessoas.Usuario;

import java.util.Scanner;

//Os logs e Scannersservem apenas para testar os métodos e devem ser excluídos ao implementar o front

public class CadastroUsuarioService implements CadastroService{

    @Override
    public Usuario cadastrar(){

        Scanner scan = new Scanner(System.in);
        String primeiroNomeUsuario;
        String ultimoNomeUsuario;
        String cpfUsuario;
        String emailUsuario;
        String perfilUsuario;

        try{

            System.out.println("Primeiro Nome : ");
            primeiroNomeUsuario = scan.next();

            System.out.println("Ultimo Nome : ");
            ultimoNomeUsuario = scan.next();

            System.out.println("CPF : ");
            cpfUsuario = scan.next();
            //TODO validação CPF

            System.out.println("Email : ");
            emailUsuario = scan.next();
            //TODO validação email

            System.out.println("Perfil : ");
            perfilUsuario = scan.next();

            return new Usuario(primeiroNomeUsuario, ultimoNomeUsuario, cpfUsuario, emailUsuario, perfilUsuario);

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
