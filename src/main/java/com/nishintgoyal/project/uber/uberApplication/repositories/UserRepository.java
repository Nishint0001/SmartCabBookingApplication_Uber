package com.nishintgoyal.project.uber.uberApplication.repositories;

import com.nishintgoyal.project.uber.uberApplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    User findByEmail(String email);
}
