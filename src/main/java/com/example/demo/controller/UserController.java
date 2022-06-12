package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-Root";
    }

    @GetMapping("/getUsers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getThisUserByUserId/{usersID}") //Path eka gahala / gahala id eka gahanna one meka call karanna(Path variable ekak widiyata thamai meka karanne)
    public UserDTO getUserByUserId(@PathVariable String usersID){
        return userService.getUserByUserId(usersID);
    }

    @GetMapping("/getThisUserByUserId/{usersID}/{address}")
    public void getUserByUserIdAndAddress(@PathVariable String usersID,@PathVariable String address){
        //System.out.println("user ID = "+usersID+" address = "+address);
        System.out.println("true");
        //return userService.getUserByUserIdAndAddress(usersID,address);
    }
}
