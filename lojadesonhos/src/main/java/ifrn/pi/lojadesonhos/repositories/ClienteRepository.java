package ifrn.pi.lojadesonhos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.lojadesonhos.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

