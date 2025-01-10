package com.example.etatfinancier.repositories;

import com.example.etatfinancier.models.TypePoste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePosteRepository extends JpaRepository<TypePoste, String> {
}
