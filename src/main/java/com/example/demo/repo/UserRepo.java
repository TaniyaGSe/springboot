package com.example.demo.repo;


import com.example.demo.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserTable,Integer> {

//    @Query(value = "select * from UserTable where id = ?1", nativeQuery = true)
//    UserTable getUserByUserId(String usersID);

//    @Query(value = "select * from UserTable where id = ?1 and address=?2", nativeQuery = true)
//    UserTable getUserByUserIdAndAddress(String usersID,String address);

}
