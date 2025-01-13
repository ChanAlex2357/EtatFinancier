package itu.etatfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import itu.etatfinance.model.PosteEtat;

public interface PosteEtatRepository extends JpaRepository<PosteEtat, String> {
}
