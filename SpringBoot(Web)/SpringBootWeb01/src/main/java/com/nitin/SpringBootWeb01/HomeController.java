package com.nitin.SpringBootWeb01;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    //servlet way
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int res = num1 + num2;
//
//        session.setAttribute("result", res);
//        return "result.jsp";
//    }


    //spring way
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int res = num1 + num2;

        mv.addObject("result", res);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){
        return "result";
    }
}
