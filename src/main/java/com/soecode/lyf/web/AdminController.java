package com.soecode.lyf.web;


import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.entity.Record;
import com.soecode.lyf.service.AdminService;
import com.soecode.lyf.service.BookService;
import com.soecode.lyf.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("admin")

@SessionAttributes(types = {List.class},value = {"list_admin"})
public class AdminController {

    @Autowired
    BookService bookService;

    @Autowired
    AdminService adminService;

    @Autowired
    RecordService recordService;

    @RequestMapping("login")
    public ModelAndView getAdmin(Admin admin, HttpSession httpSession){
        ModelAndView mv = new ModelAndView();
        System.out.println(admin);
        if ("".equals(admin.getAdmin_account()) || "".equals(admin.getAdmin_passwd())){
            mv.addObject("message","账号或密码不能为空");
            mv.setViewName("/index.jsp");
            return mv;
        }

        List<Admin> adminList = adminService.queryAdmin(admin);
        System.out.println(adminList);
        if (adminList.size()==0){
            mv.addObject("message","账号或密码错误");
            mv.setViewName("/index.jsp");
            return mv;
        }
        httpSession.setAttribute("admin",adminList.get(0));
        mv.setViewName("/admin/index");
        return mv;
    }

    @RequestMapping("logout")
    public String logout(@ModelAttribute("admin") Admin admin, SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "index";
    }

    @RequestMapping("allRecord")
    public ModelAndView allRecord(){
        ModelAndView mv =new ModelAndView();
        List<Record> recordList = recordService.queryRecord();
        mv.addObject("list_record",recordList);
        mv.setViewName("/admin/record");
        return mv;
    }


}
