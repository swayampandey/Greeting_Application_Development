package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
