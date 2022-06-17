package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserTable;
import com.example.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){ //Return type eka ewapu data eka jathiyema wenna one nisa UserDTO danawa
        //userRepo.save(userDTO); mehema danna ba userDTO ekak
        userRepo.save(modelMapper.map(userDTO, UserTable.class));
        return userDTO;
    }

    public List<UserDTO> getAllUsers(){
        List<UserTable>userList=userRepo.findAll(); //Find all data from the repo and save it in userList in UserTable type
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, UserTable.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, UserTable.class));
        return true;
    }

    //select * from UserTable where id = 2
//    public UserDTO getUserByUserId(String usersID){
//        UserTable userTable = userRepo.getUserByUserId(usersID);
//        return modelMapper.map(userTable,UserDTO.class);
//    }

    //select * from UserTable where id = 2 and address = "Kandy"
//    public UserDTO getUserByUserIdAndAddress(String usersID,String address){
//        UserTable userTable = userRepo.getUserByUserIdAndAddress(usersID,address);
//        return modelMapper.map(userTable,UserDTO.class);
//    }
}
