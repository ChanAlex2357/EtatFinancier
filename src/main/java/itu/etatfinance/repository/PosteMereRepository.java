package com.example.etatfinancier.repositories;

import com.example.etatfinancier.models.PosteMere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteMereRepository extends JpaRepository<PosteMere, String> {
}
