package com.devsuperior.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.challenge.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
