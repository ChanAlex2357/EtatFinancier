package itu.etatfinance.repository;
    

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.etatfinance.model.PosteFille;

@Repository
public interface PosteFilleRepository extends JpaRepository<PosteFille, String> {
    List<PosteFille> findByIdPosteMere(String idPosteMere);
}