package com.userReg.registration.Repository;

import com.userReg.registration.Model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserDao, UUID> {
    UserDao findByUserName(String name);
}
