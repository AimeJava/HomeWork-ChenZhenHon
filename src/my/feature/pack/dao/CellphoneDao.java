package my.feature.pack.dao;

import my.feature.pack.entity.Cellphone;

import java.util.List;

public interface CellphoneDao {
    //增
        Boolean AddCp(Cellphone cellphone);
    //删
        boolean deleteCP(int id);
    //改
        Boolean updataCP(Cellphone cellphone);
     //查询全部
        List<Cellphone> AllCP();
    //根据id查
        Cellphone getCP(int id);
    //模糊查询
    List<Cellphone> getCPName(String name);
}
