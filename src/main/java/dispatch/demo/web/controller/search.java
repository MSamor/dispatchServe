//package dispatch.demo.web.controller;
//
//import dispatch.demo.mapper.contentMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class search {
//    @Autowired
//    contentMapper contentMapper;
//    @GetMapping("admin/order{orderId}")
//    public String getContentById(@PathVariable String orderId,
//                                 Model model){
//        model.addAttribute("data",contentMapper.getContent(orderId));
//        return "";
//    }
//}
