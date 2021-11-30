package controller;

import service.UserManagerService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserRegisterController extends HttpServlet {
    UserManagerService userManagerService =new UserManagerService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------用户注册----------");
        req.setCharacterEncoding("UTF-8");
        String  username=  req.getParameter("username");
        String  password=  req.getParameter("password");
        String  sex=  req.getParameter("sex");
        String  age=  req.getParameter("age");
        String[]  hobby=  req.getParameterValues("hobby");
        String  remark=  req.getParameter("remark");
        System.out.println(username+password+sex+age+remark);
        for (String h:hobby){
            System.out.println(h);
        }
        Boolean b=userManagerService.register(username,password,sex,age,hobby,remark);
        resp.setContentType("text/html;charset=UTF-8");
        if (b){
            resp.getWriter().println("<font color='red' size='15'>欢迎你"+",注册成功</font>");
        }
        else {
            resp.getWriter().println("<font color='green' size='15'>注册失败</font>");
        }
    }
}
