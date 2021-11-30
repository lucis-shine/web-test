package controller;

import service.UserManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserUpdateController extends HttpServlet {
    UserManagerService userManagerService =new UserManagerService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------用户修改--------");
        req.setCharacterEncoding("UTF-8");
        String  id=  req.getParameter("id");
        String  username=  req.getParameter("username");
        String  password=  req.getParameter("password");
        String  sex=  req.getParameter("sex");
        String  age=  req.getParameter("age");
        String[]  hobby=  req.getParameterValues("hobby");
        String  remark=  req.getParameter("remark");
        System.out.println(id+username+password+sex+age+remark);
        for (String h:hobby){
            System.out.println(h);
        }
        Boolean b=userManagerService.update(id,username,password,sex,age,hobby,remark);
        if (b){
            req.getRequestDispatcher("/user/queryAll").forward(req,resp);
        }

    }
}
