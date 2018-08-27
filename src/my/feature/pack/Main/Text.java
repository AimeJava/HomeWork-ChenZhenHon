package my.feature.pack.Main;

import my.feature.pack.dao.AccountDao;
import my.feature.pack.dao.CellphoneDao;
import my.feature.pack.dao.RealizeAccountDao;
import my.feature.pack.dao.RealizeCellphoneDao;
import my.feature.pack.entity.Admin;
import my.feature.pack.entity.Cellphone;

import java.util.List;

public class Text {
    public static void main(String[] args) {
        CellphoneDao cpDao=new RealizeCellphoneDao();

        //测试查看所有的
        List<Cellphone> cps = cpDao.AllCP();
        for (Cellphone cp : cps) {
            System.out.println("编号: "+cp.getId()+"  手机名: "+cp.getName()+"  价格:  "+cp.getPrice());
        }


        System.out.println("-----测试增加的-----");
        cpDao.AddCp(new Cellphone(11,"小米21","5G","白色","2018年9月18日",1999F));
        for (Cellphone cp : cps) {
            System.out.println("编号: "+cp.getId()+"  手机名: "+cp.getName()+"  价格:  "+cp.getPrice());
        }


        System.out.println("-----测试删除的-----");
        cpDao.deleteCP(6);
        for (Cellphone cp : cps) {
            System.out.println("编号: "+cp.getId()+"  手机名: "+cp.getName()+"  价格:  "+cp.getPrice());
        }

        System.out.println("-----测试修改8的-----");
      //  Cellphone updataCp=cpDao.updataCp(new Cellphone(11,"小米21","5G","白色","2018年9月18日",1999F,50));
        cpDao.updataCP(new Cellphone(8,"小米23","6G","蓝色","2018年8月20日",3099F));
        for (Cellphone cp : cps) {
            System.out.println("编号: "+cp.getId()+"  手机名: "+cp.getName()+"  价格:  "+cp.getPrice());
        }
        System.out.println("-----测试模糊查询-----");
        List<Cellphone> cpName = cpDao.getCPName("小");
        for (Cellphone cp : cpName) {
            System.out.println("编号: "+cp.getId()+"  手机名: "+cp.getName()+"  价格:  "+cp.getPrice());
        }
        System.out.println("-----测试根据id查询-----");
        Cellphone cop = cpDao.getCP(5);

            System.out.println("编号: " + cop.getId() + "  手机名: " + cop.getName() + "  价格:  " + cop.getPrice());
        System.out.println("-----测试根据id查询-----");
        AccountDao aDao=new RealizeAccountDao();
        List<Admin> admins = aDao.AllAdmin();
        for (Admin admin : admins) {
            System.out.println("名称: "+admin.getName()+"  密码名: "+admin.getPwd());
        }
    }
}
