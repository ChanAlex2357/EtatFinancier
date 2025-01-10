package itu.etatfinance.repository;

import itu.etatfinance.model.PosteMere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteMereRepository extends JpaRepository<PosteMere, String> {
}
