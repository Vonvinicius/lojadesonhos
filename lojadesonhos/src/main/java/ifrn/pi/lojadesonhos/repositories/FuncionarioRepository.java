package ifrn.pi.lojadesonhos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.lojadesonhos.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	

}
