package itu.etatfinance.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.etatfinance.models.PosteMere;

@Repository
public interface PosteMereRepository extends JpaRepository<PosteMere, String> {
    List<PosteMere> findByTypePoste(String idTypePoste);
}
