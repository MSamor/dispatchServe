//package dispatch.demo.interceptor;
//
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
////过滤器
//public class loginInterceptor extends HandlerInterceptorAdapter {
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler
//    ) throws Exception {
//        if(request.getSession().getAttribute("loginUserId") == null){
//            response.sendRedirect("/admin");
//            return false;
//        }
//        return true;
//    }
//}
