package com.clothing_store.Repository;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    @Query(value = "SELECT * FROM tb_funcionario WHERE nome = ?", nativeQuery = true)
    FuncionarioEntity findbyName(String nome);
}
