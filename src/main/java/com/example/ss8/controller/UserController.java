package com.example.ss8.controller;

import com.example.ss8.model.dto.AddressDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class UserController {

    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@Valid @RequestBody AddressDto addressDto) {

        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}