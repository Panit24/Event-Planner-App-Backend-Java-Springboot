//This provides built-in CRUD operations without needing to write SQL queries!
//Use Spring Data JPA to create a repository for the Event entity

package com.tuksom.event_planner_app_backend_java_springboot.repository;

import com.tuksom.event_planner_app_backend_java_springboot.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}