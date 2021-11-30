package controller;

import service.UserManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserDeleteController extends HttpServlet {
    UserManagerService userManagerService =new UserManagerService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String id= req.getParameter("id");
        Boolean b=userManagerService.delete(id);
        if (b){
            req.getRequestDispatcher("/user/queryAll").forward(req,resp);
        }
    }
}
