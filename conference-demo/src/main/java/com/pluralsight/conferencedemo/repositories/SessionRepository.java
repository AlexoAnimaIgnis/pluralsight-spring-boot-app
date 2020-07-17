package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository provides jdbc operations
public interface SessionRepository extends JpaRepository<Session, Long> {

}
