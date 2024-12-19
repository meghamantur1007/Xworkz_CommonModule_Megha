package com.xworkz.commonModule.controller;

import com.xworkz.commonModule.dto.UserDto;
import com.xworkz.commonModule.entity.UserEntity;
import com.xworkz.commonModule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    UserController() {
        System.out.println("created UserController");
    }

    @PostMapping("/save")
    public String onSave(UserDto dto, Model model) {
        System.out.println("data in controller==" + dto);
        boolean saved = userService.validateAndSave(dto);
        if (saved) {
            model.addAttribute("message", "User registration successful!");
            return "Success.jsp";
        } else {
            return "SignUp.jsp";
        }
    }
    @PostMapping("/find")
    public String onLogin(@RequestParam String email,@RequestParam String password,Model model)
    {
        System.out.println(email + " "+password);
        List<UserEntity> list=userService.getAll(email,password);
        if(list!=null){
            model.addAttribute("list",list);
            return "Success.jsp";
        }
        else
            return "SignIn.jsp";
    }
}
