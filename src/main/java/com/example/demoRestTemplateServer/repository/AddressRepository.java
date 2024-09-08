package com.example.demoRestTemplateServer.repository;

import com.example.demoRestTemplateServer.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address,Integer> {
}
