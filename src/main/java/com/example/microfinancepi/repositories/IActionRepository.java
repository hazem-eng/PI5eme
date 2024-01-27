package com.example.microfinancepi.repositories;
import com.example.microfinancepi.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActionRepository extends  JpaRepository<Action,Integer> {
}
