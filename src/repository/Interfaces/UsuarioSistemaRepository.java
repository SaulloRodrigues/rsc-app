package repository.Interfaces;

import domain.entity.Pessoas.UsuarioSistema;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioSistemaRepository {
    void save(UsuarioSistema usuario);
    Optional<UsuarioSistema> findById(UUID id);
    List<UsuarioSistema> findAll();
    void delete(UUID id);
}
