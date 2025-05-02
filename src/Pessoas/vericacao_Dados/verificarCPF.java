package Pessoas.vericacao_Dados;

public class verificarCPF {
    public static String formatarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    // Método para validar CPF
    public static boolean validarCPF(String cpf) {
        try {
            if (cpf == null || cpf.isEmpty()) {
                throw new IllegalArgumentException("CPF não pode ser vazio ou nulo");
            }
            cpf = cpf.replaceAll("[^0-9]", ""); // pra Remover caracteres não numéricos//

            if (cpf.length() != 11) {
                throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos numéricos.");
            }

            if (cpf.matches("(\\d)\\1{10}")) {
                throw new IllegalArgumentException("CPF não pode conter todos os dígitos iguais.");
            }

            if (verificarCPF.verificarExistenciaCPF(cpf) == false) {
                throw new IllegalArgumentException("esse cpf não existe");
            }

            // Cálculo do dígito verificador
            int[] digits = new int[11];
            for (int i = 0; i < 11; i++) {
                digits[i] = cpf.charAt(i) - '0';
            }
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += digits[i] * (10 - i);
            }
            int remainder = sum % 11;
            int digit1 = (remainder < 2) ? 0 : (11 - remainder);

            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += digits[i] * (11 - i);
            }
            remainder = sum % 11;
            int digit2 = (remainder < 2) ? 0 : (11 - remainder);

            return (digit1 == digits[9] && digit2 == digits[10]);
        } catch (NumberFormatException e) {
            System.err.println("Erro: CPF contém caracteres não numéricos.");
            return false;
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Erro: CPF com tamanho incorreto.");
            return false;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    protected static boolean verificarExistenciaCPF(String cpf) {
        // precisa implementação ainda aqui a lógica para verificar se o CPF existe na
        // base de dados da Receita Federal
        return true;
    }

    public static void main(String[] args) {
        String cpf = "10148026010";

        String cpfFormatado = formatarCPF(cpf);
        System.out.println("CPF formatado:" + cpfFormatado);

        boolean cpfValido = validarCPF(cpf);
        System.out.println("CPF válido: " + (cpfValido ? "Sim" : "Não"));

        boolean cpfExiste = verificarExistenciaCPF(cpf);
        System.out.println("CPF existe: " + (cpfExiste ? "Sim" : "Não"));
    }
}
