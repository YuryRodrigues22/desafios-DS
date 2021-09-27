package com.desafio.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
