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
import java.util.List;

@WebServlet ("/cp/all")
public class CPAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CellphoneDao cpdao=new RealizeCellphoneDao();

        List<Cellphone> cp = cpdao.AllCP();

        req.setAttribute("cp",cp);

       req.getRequestDispatcher("/jsp/CPAll.jsp").forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/jsp/CPAll.jsp").forward(req,resp);
    }
}
