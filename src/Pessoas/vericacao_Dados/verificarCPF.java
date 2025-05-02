package Pessoas.vericacao_Dados;

public class verificarCPF {
    public static String formatarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
  
  
    // Método para validar CPF
    public static boolean validarCPF(String cpf) {
        try {
            cpf = cpf.replaceAll("[^0-9]", ""); //pra Remover caracteres não numéricos
        
            if (cpf == null || cpf.isEmpty()) {
                System.err.println("CPF não pode ser nulo ou vazio.");
                return false;
            }
      
            if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
                return false; // CPF deve ter 11 dígitos e não pode ser formado por dígitos repetidos
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
        } catch (Exception e) {
            System.err.println("Erro ao validar CPF: " + e.getMessage());
        return false; 
        }
        
    }
  
  
    public static boolean verificarExistenciaCPF(String cpf) {
        // precis implementação ainda aqui a lógica para verificar se o CPF existe na base de dados da Receita Federal
        return true; 
    }
  
  
    // public static void main(String[] args) {
    //     String cpf = "07084205080";
  
    //     String cpfFormatado = formatarCPF(cpf);
    //     System.out.println("CPF formatado:" + cpfFormatado);
  
    //       boolean cpfValido = validarCPF(cpf);
    //     System.out.println("CPF válido: " + (cpfValido ? "Sim" : "Não"));
  
    //     boolean cpfExiste = verificarExistenciaCPF(cpf);
    //     System.out.println("CPF existe: " + (cpfExiste ? "Sim" : "Não"));
    // }
}
