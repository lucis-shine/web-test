package controller;

import VO.UserVO;
import com.alibaba.fastjson.JSON;
import service.UserManagerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/user/queryAllByAjax")
public class UserQueryAllByAjaxController extends HttpServlet {
    UserManagerService userManagerService=new UserManagerService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------ajax所有用户------");
        List<UserVO> list= userManagerService.queryUserList();
        String uerlist_json=JSON.toJSONString(list);
        System.out.println(uerlist_json);
        resp.getWriter().write(uerlist_json);
    /*    req.setAttribute("userlist",list);*/
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
