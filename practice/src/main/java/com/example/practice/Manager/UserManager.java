package com.example.practice.Manager;

import com.example.practice.DAO.UserDAO;
import com.example.practice.DTO.ResponseDTO;
import com.example.practice.DTO.UserDTO;
import com.example.practice.config.PasswordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    @Autowired
    UserDAO userDAO;

    public UserDTO getUserDetails(Integer id) {
        return null;
    }

    public ResponseDTO createMpin(String password, Integer userId) {
        ResponseDTO response = new ResponseDTO();
        try{
            byte[] salt = PasswordConfig.getSalt();
            String hashedPassword = PasswordConfig.createHash(password,salt);
            //userDAO.setMpin(userId,password)
            System.out.println("Salt :"+salt);
            System.out.println("hashedpassword : "+hashedPassword);
            response.setMessage("Mpin Successfully Saved");
            response.setStatus("false");
        }catch(Exception e){
            response.setMessage("Mpin setup failed");
            response.setStatus("false");
        }
        return response;
    }
}
