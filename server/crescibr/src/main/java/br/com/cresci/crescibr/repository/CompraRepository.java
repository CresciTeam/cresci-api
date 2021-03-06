package br.com.cresci.crescibr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cresci.crescibr.model.CompraModel;

@Repository
public interface CompraRepository extends JpaRepository<CompraModel, Long>{

}
