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

@WebServlet(value = "/cp/sel")
public class CPSearch extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("进入了p");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String condition = req.getParameter("condition");
        CellphoneDao cpDao=new RealizeCellphoneDao();

        List<Cellphone> cps = cpDao.getCPName(condition);
        req.setAttribute("cp", cps);

        req.getRequestDispatcher("/cp/all").forward(req, resp);
    }
}
