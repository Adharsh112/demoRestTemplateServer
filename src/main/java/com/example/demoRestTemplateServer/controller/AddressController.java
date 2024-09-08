package com.example.demoRestTemplateServer.controller;

import com.example.demoRestTemplateServer.models.Address;
import com.example.demoRestTemplateServer.repository.AddressRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    private ResponseEntity<String> createAddress(@RequestBody Address address){
        Address savedAddress = addressRepository.save(address);
        return new ResponseEntity<>("the address is created with addressId : " + savedAddress.getAddressId(), HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Address>> getAllAddress(){
        List<Address> addressList = addressRepository.findAll();
        return new ResponseEntity<>(addressList,HttpStatus.CREATED);
    }
}
