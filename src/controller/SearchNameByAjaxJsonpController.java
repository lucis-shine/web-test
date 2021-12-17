package controller;

import service.UserManagerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/searchNameByAjaxJsonp")
public class SearchNameByAjaxJsonpController extends HttpServlet {
    UserManagerService userManagerService=new UserManagerService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello jsonp");
        String jsonp=req.getParameter("callback");
        System.out.println(jsonp);
       /* resp.setHeader( "Access-Control-Allow-Origin", "*" );
        List<String> usernameList =userManagerService.getNameBykeyWord(keyWord);
        System.out.println(usernameList);
        StringBuffer buffer=new StringBuffer();
        for (String name:usernameList){
            buffer.append(name);
            buffer.append(",");

        }*/
        resp.getWriter().write(jsonp+"({ name:\"zc\",sex:\"man\"})");
    }
}
