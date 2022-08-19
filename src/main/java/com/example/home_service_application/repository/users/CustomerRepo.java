package com.example.home_service_application.repository.users;


import com.example.home_service_application.entity.users.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    @Modifying
    @Query("update Customer c set c.firstName=:fN , c.lastName=:lN , c.username =:username ,c.password=:password ," +
            "c.address=:address ,c.email=:email  where c.id=:id")
    void updateALLInformation( String fN ,String lN , String username , String password , String address , String email , Long id);
}
