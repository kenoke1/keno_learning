package com.kenan.app.rest.Repo;
import com.kenan.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends  JpaRepository<User, Long>{
}
