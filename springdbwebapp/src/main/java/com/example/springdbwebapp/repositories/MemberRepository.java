package com.example.springdbwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdbwebapp.entities.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByEmail(String email);

}