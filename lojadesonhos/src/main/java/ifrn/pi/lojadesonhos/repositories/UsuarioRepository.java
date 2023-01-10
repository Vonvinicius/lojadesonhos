package ifrn.pi.lojadesonhos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.lojadesonhos.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
