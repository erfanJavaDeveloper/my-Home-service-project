package com.example.home_service_application.repository.users;

import com.example.home_service_application.entity.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {

    @Modifying
    @Query("update Admin a set a.fN=:fN , a.lN=:lN , a.username =:username ,a.password=:password ," +
            "a.address=:address ,a.email=:email  where a.id=:id")
    void updateALLInformation(String fN , String lN , String username , String password , String address , String email , Long id);
}
