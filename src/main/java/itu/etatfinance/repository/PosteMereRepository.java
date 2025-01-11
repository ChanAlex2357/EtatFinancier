package itu.etatfinance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.etatfinance.model.PosteMere;

@Repository
public interface PosteMereRepository extends JpaRepository<PosteMere, String> {
}
