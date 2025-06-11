package domain.entity;

import java.util.Scanner;
    public class CadastroVacina  {

        public Vacina cadastrar(){

            Scanner scan = new Scanner(System.in);

            String nomeVacina;


            try{

                System.out.println("Nome vacina: ");
                nomeVacina = scan.next();


                return new Vacina(nomeVacina, null, nomeVacina);

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






