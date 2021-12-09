package controller;

import service.UserManagerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckNameController")
public class CheckNameController extends HttpServlet {
    UserManagerService userManagerService =new UserManagerService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        Boolean c=userManagerService.check(username);
        if (c){
            resp.getWriter().write("true");
        }
        else {
            resp.getWriter().write("false");

        }
    }
}
