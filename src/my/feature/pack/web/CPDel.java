package my.feature.pack.web;

import my.feature.pack.dao.CellphoneDao;
import my.feature.pack.dao.RealizeCellphoneDao;
import my.feature.pack.entity.Cellphone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/cp/del")
public class CPDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CellphoneDao cpdao=new RealizeCellphoneDao();
        String msg = null;

        if(cpdao.deleteCP(id)) {
            msg = "delete success.";
        } else {
            msg = "delete failure.";
        }
        req.getSession().setAttribute("msg", msg);

        resp.sendRedirect("/cp/all");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids = req.getParameterValues("id");
        CellphoneDao cpDao=new RealizeCellphoneDao();
        for (String id : ids) {
            cpDao.deleteCP(Integer.parseInt(id));
        }
        resp.sendRedirect("/cp/all");
    }
}
