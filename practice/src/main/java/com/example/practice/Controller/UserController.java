package com.example.practice.Controller;

import com.example.practice.DTO.ResponseDTO;
import com.example.practice.DTO.UserDTO;
import com.example.practice.Manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserManager userManager;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getUsersDetails(@RequestBody Integer id) {
        return userManager.getUserDetails(id);
    }

    @PostMapping(value="/createMpin/{id}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO createMpin(@PathVariable("id") Integer userId,@RequestBody String password){
        return userManager.createMpin(password,userId);
    }

}
