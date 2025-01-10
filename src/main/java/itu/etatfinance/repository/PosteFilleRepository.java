package itu.etatfinance.repository;
    

import itu.etatfinance.model.PosteFille;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteFilleRepository extends JpaRepository<PosteFille, String> {
    List<PosteFille> findByIdPosteMere(String idPosteMere);
}