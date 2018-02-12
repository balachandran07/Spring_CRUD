package com.kgisl.springeg.example1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<book, Integer> {

}