package com.arcsoft.studyOnline.controller;

import com.arcsoft.studyOnline.bean.Adminstrator;
import com.arcsoft.studyOnline.service.AdminstratorService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Focus on 2017/5/23.
 */
@RequestMapping("/shiro")
@Controller
public class AdminstratorController {

    @Autowired
    private AdminstratorService adminstratorService;

    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (AuthenticationException e) {
                System.out.println("登录失败:" + e.getMessage());
                return "index";
            }
        }

        model.addAttribute("username", username);
        return "home";
    }

    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
        }
        return "index";
    }

    @RequestMapping("/modifyAdminPwd")
    @ResponseBody
    public Map modifyAdminPwd(@RequestParam String username, @RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String checkNewPassword) {

        Map<String, String> map = new HashMap<>();

        if (!newPassword.equals(checkNewPassword)) {
            map.put("message", "两次新密码不同，请重新输入！");
            return map;
        }

        Boolean result = adminstratorService.checkPassword(username, oldPassword);

        if (result) {
            adminstratorService.updatePassword(username,newPassword);
            map.put("message", "修改成功！");
            return map;
        } else {
            map.put("message", "旧密码错误！");
            return map;
        }
    }

}