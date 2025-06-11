import controller.UsuarioSistemaController;

public class RscAppApplication {
    public static void main(String[] args) {

        UsuarioSistemaController controller = new UsuarioSistemaController();

        // Criar usuário
        controller.criarUsuario("joao@example.com", "123456", "ADMIN");

        // Listar todos
        controller.listarUsuarios();

        // Simular buscar por ID (coloque um UUID válido após criar)
        // controller.buscarUsuario(UUID.fromString("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"));

        // Simular excluir por ID
        // controller.excluirUsuario(UUID.fromString("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"));

    }
}
