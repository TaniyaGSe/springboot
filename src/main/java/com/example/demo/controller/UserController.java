package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "*" )
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

    @PostMapping("/signUpUser")
    public UserDTO signUpUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }

        //     if (userRepository.existsByUsername(signUpRequest.getUsername())) {
        //            return ResponseEntity
        //                    .badRequest()
        //                    .body(new MessageResponse("Error: Username is already taken!"));
        //        }
        //        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
        //            return ResponseEntity
        //                    .badRequest()
        //                    .body(new MessageResponse("Error: Email is already in use!"));
        //        }
        //        // Create new user's account
        //        User user = new User(
        //
        //                signUpRequest.getName(),
        //                 signUpRequest.getId(),
        //                signUpRequest.getEmail(),
        //                encoder.encode(signUpRequest.getPassword()),
        //                signUpRequest.getPhoneN()
        //
        //                );
        //
        //        Employee employee = new Employee(
        //
        //
        //                signUpRequest.getName(),
        //                 signUpRequest.getId(),
        //                signUpRequest.getEmail(),
        //                encoder.encode(signUpRequest.getPassword()),
        //                signUpRequest.getPhoneN()
        //
        //                );




    @PostMapping("/loginUser")
    public UserDTO loginUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updatePass")
    public UserDTO updatePass(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }




//    @GetMapping("/getThisUserByUserId/{usersID}") //Path eka gahala / gahala id eka gahanna one meka call karanna(Path variable ekak widiyata thamai meka karanne)
//    public UserDTO getUserByUserId(@PathVariable String usersID){
//        return userService.getUserByUserId(usersID);
//    }
//
//    @GetMapping("/getThisUserByUserId/{usersID}/{address}")
//    public void getUserByUserIdAndAddress(@PathVariable String usersID,@PathVariable String address){
//        //System.out.println("user ID = "+usersID+" address = "+address);
//        System.out.println("true");
//        //return userService.getUserByUserIdAndAddress(usersID,address);
//    }
}
