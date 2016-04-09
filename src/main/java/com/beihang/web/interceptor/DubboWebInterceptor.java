package com.beihang.web.interceptor;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;  
  
public class DubboWebInterceptor extends HandlerInterceptorAdapter {  
  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {  
        super.afterCompletion(request, response, handler, ex);  
    }  
      
    public void postHandler(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {  
        super.postHandle(request, response, handler, modelAndView);  
    }  
      
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  
        String url = request.getRequestURI();  
        System.out.println("ConsumerInterceptor.preHandle()" + url);  
          
        return super.preHandle(request, response, handler);  
    }  
      
}  