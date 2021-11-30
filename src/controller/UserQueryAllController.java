package controller;

import VO.UserVO;
import service.UserManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserQueryAllController extends HttpServlet {
    UserManagerService userManagerService=new UserManagerService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------所有用户------");
        List<UserVO> list= userManagerService.queryUserList();
        req.setAttribute("userlist",list);
        req.getRequestDispatcher("/userlist.jsp").forward(req,resp);
        /*  resp.sendRedirect("../userlist.jsp");
*/
      /*  System.out.println(list);
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out=res.getWriter();
        out.write("<table>");
        out.write("<tr>");
        out.write("<th>名字</th>");
        out.write("<th>密码</th>");
        out.write("<th>年龄</th>");
        out.write("<th>性别</th>");
        out.write("<th>爱好</th>");
        out.write("<th>备注</th>");
        out.write("</tr>");

        for (UserVO vo:list){
            out.write("<tr>");
            out.write("<td>"+vo.getID()+"</td>");
            out.write("<td>"+vo.getUSERNAME()+"</td>");
            out.write("<td>"+vo.getPASSWORD()+"</td>");
            out.write("<td>"+vo.getAGE()+"</td>");
            out.write(" <td"+vo.getHOBBY()+"</td");
            out.write(" <td>"+vo.getREMARK()+"</td>");
            out.write("</tr>");
        }
        out.write("</table>");*/
    }
}
