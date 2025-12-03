package com.gemora_server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
// 👉 Automatically generates:
//    - Getters
//    - Setters
//    - toString()
//    - equals()
//    - hashCode()
// So you don’t need to write them manually.
@Builder
// 👉 Enables Builder Pattern.
//    Helps create objects step by step in a clean way.
//    Example: User.builder().name("Imasha").age(22).build();
@NoArgsConstructor
@AllArgsConstructor

public class ProfileUpdateDto {
    private String name;
    private String contactNumber;
    private MultipartFile selfieImage;

}
