package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import VO.UserVO;
import service.UserLoginService;

public class UserLoginController extends HttpServlet {
    UserLoginService userLoginService =new UserLoginService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------post------");
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------get------");
        String name=req.getParameter("uerName");
        String password= req.getParameter("uerPassword");
        System.out.println("账户名："+name+" "+"密码："+password);
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        UserVO userVO=userLoginService.login(name,password);
        if (userVO!=null){
            HttpSession session=req.getSession();
            session.setAttribute("userLogin",userVO);
            session.setMaxInactiveInterval(60*30);//秒

            Cookie c_name=new Cookie("name",name);
            Cookie c_password=new Cookie("password",password);
            c_name.setMaxAge(60*60);
            c_password.setMaxAge(60*60);
            c_name.setPath("/");
            c_password.setPath("/");
            resp.addCookie(c_name);
            resp.addCookie(c_password);

            resp.getWriter().println("<font color='red' size='15'>欢迎你"+name+",登陆成功</font>");
        }else {
            resp.getWriter().println("<font color='green' size='15'>登陆失败</font>");
        }
    }
}
