package com.example.etatfinancier.repositories;
    

import com.example.etatfinancier.models.PosteFille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteFilleRepository extends JpaRepository<PosteFille, String> {
}

}
