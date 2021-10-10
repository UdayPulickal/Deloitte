package com.codetest.todolist.controller;

import com.codetest.todolist.dao.Userrepo;
import com.codetest.todolist.model.User;
import com.codetest.todolist.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    Userrepo repo;

    @Autowired
    UserserviceImpl userser;

    Optional<User> userupd;

    int count = 101;

    private String usernm;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/adduser")
    public String login(User user) {
      user.setUserid(count++);
        if (user.getUsername()!=null && user.getDescription()!=null
        && user.getTarget_date()!=null)
        {
            repo.save(user);
        }
        return "home.jsp";

    }

    @GetMapping("/showalltasks")
    public ModelAndView showalltasks() {
        ModelAndView mav = new ModelAndView("showalltasks.jsp");

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
             usernm = ((UserDetails) principal).getUsername();
        }

        List<User> UserList = userser.getalltasks();
        mav.addObject("showalltasks", UserList);
        return mav;
    }

    @GetMapping("/deletetask/{id}")
    public ModelAndView removetask(@PathVariable("id") Integer id) {
        userser.deletetask(id);
        return new ModelAndView("redirect:/showalltasks");
    }

    @RequestMapping("/updatetask/{id}")
    public ModelAndView todotask(@PathVariable("id") Integer id, Model model) {
            userupd= Optional.ofNullable(userser.getbyid(id)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid User Id:" + id)));
        return new ModelAndView("redirect:/updatejsp");
    }

    @RequestMapping("/updatejsp")
    public String updatejsp(Model model) {
        model.addAttribute("userupdate",userupd);
        return "updatetask.jsp";
    }

    @RequestMapping(value = "/saveuser")
    public String saveJsp(User user,Model model){
        user.setUserid(userupd.get().getUserid());
    model.addAttribute("user",user);
      userser.saveorupdate(user);

        return "redirect:/showalltasks";
    }
}
