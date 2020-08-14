package com.example.springdbwebapp.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdbwebapp.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
