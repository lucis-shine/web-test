package utils.FilterUtil;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--------用户登录过滤-----");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----检查是否登录-----");
        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse resp=(HttpServletResponse)servletResponse;
        //String author =req.getParameter("author");
        //System.out.println(author);
      //  if ("zc".equals(author)){
            filterChain.doFilter(servletRequest,servletResponse);
     //  }
    }

    @Override
    public void destroy() {
        System.out.println("---------用户登录过滤完成---------");
    }
}
