package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.sevice.UserService;


@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/")
    public String getHomePage(Model model) {

        model.addAttribute("message", "Hello world from LSB-163");
        model.addAttribute("title", "Home page");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/admin/user/create";
    }

    @RequestMapping(value="/admin/user/create", method=RequestMethod.POST)
    public String create(Model model, @ModelAttribute("newUser") User lsb) {
        System.out.println("run here" + lsb);
        this.userService.HandlUser(lsb);
        return "hello";
    }
}
