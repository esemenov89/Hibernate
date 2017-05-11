package main.controllers;

import org.springframework.web.servlet.ModelAndView;

import main.model.entity.User;
import main.services.UserService;

@SuppressWarnings("deprecation")
public class UserController {

    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    protected ModelAndView onSubmit(Object command) throws Exception {
        User user = (User) command;
        //userService.add(user);
        return new ModelAndView("userSuccess","user",user);
    }

}
