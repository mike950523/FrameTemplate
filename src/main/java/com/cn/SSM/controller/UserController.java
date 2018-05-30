package com.cn.SSM.controller;
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.SSM.bean.component;
import com.cn.SSM.pojo.User;
import com.cn.SSM.service.UserService;  
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        new component().run();
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  
