package controller;

import VO.UserVO;
import service.UserManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserGetInfoController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserManagerService userManagerService=new UserManagerService();
        String id=req.getParameter("id");
        UserVO userVO=userManagerService.getUserInfoById(id);
        req.setAttribute("userVO",userVO);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }
}
