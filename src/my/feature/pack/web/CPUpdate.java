package my.feature.pack.web;

import com.google.gson.Gson;
import my.feature.pack.dao.CellphoneDao;
import my.feature.pack.dao.RealizeCellphoneDao;
import my.feature.pack.entity.Cellphone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/cp/update")
public class CPUpdate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        CellphoneDao cpDao=new RealizeCellphoneDao();
        Cellphone CP = cpDao.getCP(Integer.parseInt(req.getParameter("id")));
        Gson gson=new Gson();
        String s=gson.toJson(CP);
        resp.getWriter().print(s);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  System.out.println("jingrule");
        req.setCharacterEncoding("utf-8");
        //序号
        int id= Integer.parseInt(req.getParameter("id"));;
        //名称
        String name=req.getParameter("name");
        //网络格式
        String network=req.getParameter("network");
        //机身颜色
        String color=req.getParameter("color");
        //上市时间
        String ttm=req.getParameter("ttm");
        //价格
        float price= Float.parseFloat(req.getParameter("price"));

        CellphoneDao cpdao=new RealizeCellphoneDao();
        if (cpdao.updataCP(new Cellphone(id,name,network,color,ttm,price))) {
            resp.sendRedirect("/cp/all");
        }

    }
}
