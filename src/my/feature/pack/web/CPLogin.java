package my.feature.pack.web;

import my.feature.pack.dao.AccountDao;
import my.feature.pack.dao.RealizeAccountDao;
import my.feature.pack.entity.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet ("/cp/login")
public class CPLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/layout/cp_login_principal.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("UserName");
        String pwd = req.getParameter("pwd");
        AccountDao aDao=new RealizeAccountDao();
        List<Admin> admins = aDao.AllAdmin();
        String msg="";
        int num=0;
        for (Admin admin : admins) {
            if (admin.getName().equals(userName)&&admin.getPwd().equals(pwd)) {
                msg=userName+",欢迎你";
                //req.getSession().setAttribute("msg",msg);
              num=1;
            }else{
                msg="账号或密码输出有误";
                //req.getSession().setAttribute("msg",msg);
               // resp.sendRedirect("/layout/cp_login_principal.jsp");
            }
        }

        if (num==1) {
            resp.sendRedirect("/cp/all");

        }else{
            System.out.println(num);
            req.getRequestDispatcher("/layout/cp_login_principal.jsp").forward(req,resp);
        }

    }
}
