//package dispatch.demo.web.controller;
//
//import dispatch.demo.domain.bgData;
//import dispatch.demo.server.bgdataServe;
//import dispatch.demo.server.contentServe;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class login {
//    @Autowired
//    bgdataServe bgdataServe;
//
//    @Autowired
//    contentServe contentServe;
//    //登录页
//    @GetMapping("/admin")
//    public String loginPage() {
//        return "/login/login";
//    }
//
//    //主页
//    @GetMapping("/admin/index")
//    public String indexPage(Model model) {
//        bgData bgdata = new bgData();
//        bgdata = bgdataServe.getBgData();
//        float rat = ((float)bgdata.getNoReadNum()/bgdata.getPersonNum())*100;
//        float rat2 = ((float)bgdata.getReadNum()/bgdata.getPersonNum())*100;
//        model.addAttribute("data",bgdata);
//        model.addAttribute("noReadRat",(int)rat);
//        model.addAttribute("readRat",(int)rat2);
//
//        model.addAttribute("contents",contentServe.getAllContent());
//        System.out.println(contentServe.getAllContent());
//        return "/main";
//    }
//
//    //登陆接口
//    @PostMapping("admin/login")
//    public String login(
//            @RequestParam Integer loginUserId,//user的名字就是html属性中的name
//            @RequestParam Integer loginPassword,
//            HttpSession session,
//            Model model
//            ){
//        if(loginUserId == 111 && loginPassword == 111){
//            session.setAttribute("loginUserId",loginUserId);
//            session.setAttribute("loginPassword",loginPassword);
//            session.setAttribute("loginUserName","魏鹏");
//            //这个跳转的是文件路径
//            return "redirect:/admin/index";
////            return "/admin/main";
//        }else {
//            //这个跳转的是网址
//            model.addAttribute("msg","账号或密码错误");
//            return "/login/login";
//        }
//    }
//}
