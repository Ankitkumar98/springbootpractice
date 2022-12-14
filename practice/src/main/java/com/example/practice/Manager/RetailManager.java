package com.example.practice.Manager;

import com.example.practice.DTO.RetailDTO;
import org.springframework.stereotype.Component;

@Component
public class RetailManager {

    public RetailDTO getRetailByUser(Integer userId){
        RetailDTO retailDTO = new RetailDTO();
        return retailDTO;
    }

}
