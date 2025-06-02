package Vacina;

import java.util.UUID;


public class Vacina {

        private String nomeVacina;
        private UUID id;
        //Data de validade seria útil ?
        // Quantidade em estoque seria necessário ?


        public Vacina(String nomeVacina) {

            this.nomeVacina = nomeVacina;
            this.id = UUID.randomUUID();

        }

}

