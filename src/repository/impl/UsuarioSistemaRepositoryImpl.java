package repository.impl;

import config.ConnectionFactory;
import domain.entity.Pessoas.UsuarioSistema;
import repository.Interfaces.UsuarioSistemaRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UsuarioSistemaRepositoryImpl implements UsuarioSistemaRepository {

    @Override
    public void save(UsuarioSistema usuario) {
        String sql = "INSERT INTO usuarios_sistema (id, email, senha, perfil) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getId().toString());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getPerfil());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<UsuarioSistema> findById(UUID id) {
        String sql = "SELECT * FROM usuarios_sistema WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id.toString());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                UsuarioSistema usuario = new UsuarioSistema(
                        UUID.fromString(rs.getString("id")),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("perfil")
                );
                return Optional.of(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<UsuarioSistema> findAll() {
        List<UsuarioSistema> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios_sistema";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                UsuarioSistema usuario = new UsuarioSistema(
                        UUID.fromString(rs.getString("id")),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("perfil")
                );
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    @Override
    public void delete(UUID id) {
        String sql = "DELETE FROM usuarios_sistema WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id.toString());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
