package com.example.home_service_application.repository.users;

import com.example.home_service_application.entity.users.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,Long> {
//    @Query("SELECT u from User u where u.id=:id and u.username=:username")
//    User findByIdAndName(Long id, String username);
//
//    User findByUsername(String username);
//
//    @Modifying
//    @Query("UPDATE User u SET u.name=:name WHERE u.id=:id")
//    void updateById(String name, Long id);


    @Modifying
    @Query("update Worker c set c.fN=:fN , c.lN=:lN , c.username =:username ,c.password=:password ," +
            "c.address=:address ,c.email=:email  where c.id=:id")
    void updateALLInformation( String fN ,String lN , String username , String password , String address , String email , Long id);
}
