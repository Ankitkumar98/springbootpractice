package com.example.practice.Controller;

import com.example.practice.DTO.RetailDTO;
import com.example.practice.Manager.RetailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retail")
public class RetailController {

    @Autowired
    RetailManager retailManager;

    public RetailDTO getRetailByUser(@RequestBody Integer userId){
        return retailManager.getRetailByUser(userId);
    }

}
