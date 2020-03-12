//package dispatch.demo.interceptor;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
////过滤器
//@Configuration
//public class webconfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new loginInterceptor())
//                .addPathPatterns("/admin/**")
//                .excludePathPatterns("/admin")
//                .excludePathPatterns("/admin/login");
//    }
//}
