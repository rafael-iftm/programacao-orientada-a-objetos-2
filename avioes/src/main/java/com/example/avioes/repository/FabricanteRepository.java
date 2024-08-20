package com.example.avioes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.avioes.domain.Fabricante;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    List<Fabricante> findByNomeContainingIgnoreCase(String nome);
}
