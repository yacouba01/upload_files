package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.DatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {

}