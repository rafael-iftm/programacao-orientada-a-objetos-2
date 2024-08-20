package com.example.avioes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.avioes.domain.Aviao;

public interface AviaoRepository extends JpaRepository<Aviao, Integer> {
    // Aqui você pode adicionar métodos de consulta personalizados se necessário
}
