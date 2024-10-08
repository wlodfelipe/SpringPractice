package com.clothing_store.Repository;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    @Query(value = "SELECT * FROM tb_cliente WHERE idade BETWEEN 18 AND 35", nativeQuery = true)
    List<ClienteEntity> findBetweenAge();
    // TODO mudar 18 e 35 para parâmetros passados

    @Query(value = "SELECT * FROM tb_cliente WHERE nome = ?", nativeQuery = true)
    ClienteEntity findbyName(String nome);
}
