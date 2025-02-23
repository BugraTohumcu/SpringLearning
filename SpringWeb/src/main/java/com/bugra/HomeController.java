package com.bugra;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
   @RequestMapping("/")
    public String home(){
        return "index";
    }

    @ModelAttribute("Sname")
    public String getSname(){
       return "Boobies";
    }


    //Tomcat way
//    @RequestMapping("/add")
//    public String add(HttpServletRequest request, HttpSession session){
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1+num2;
//       session.setAttribute("result", result);
//       return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int firstNum, @RequestParam("num2") int secondNum, Model model){
//       int result = firstNum +secondNum;
//       model.addAttribute("result", result);
//       return "result";
//    }

//        @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView model){
//
//       Alien alien = new Alien();
//       alien.setAid(aid);
//       alien.setAname(aname);
//       model.addObject("alien", alien);
//       model.setViewName("result");//jsp name
//       return model;
//    }

    //Short way
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
       return "result";
    }

}
