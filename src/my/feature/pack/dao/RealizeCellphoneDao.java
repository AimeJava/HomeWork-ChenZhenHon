package my.feature.pack.dao;


import my.feature.pack.entity.Cellphone;

import java.util.ArrayList;
import java.util.List;


public class RealizeCellphoneDao implements CellphoneDao {

    private  static List<Cellphone> CPBD=new ArrayList<>();

    int count;
    static {
        Cellphone b1 = new Cellphone(1,"魅族15","4G","白色","2018年9月18日",1999F);
        Cellphone b2 = new Cellphone(2,"小米23","4G","红色","2018年8月10日",3299);
        Cellphone b3 = new Cellphone(3,"三星plus","4G","蓝色","2018年9月18日",2999F);
        Cellphone b4 = new Cellphone(4,"魅蓝10","4G","绿色","2018年8月18日",999F);
        Cellphone b5 = new Cellphone(5,"锤子plus","4G","黄色","2018年9月18日",5999F);
        Cellphone b6 = new Cellphone(6,"荣耀8","4G","青色","2018年4月18日",3999F);
        Cellphone b7 = new Cellphone(7,"红米12","4G","灰色","2018年3月18日",2999F);


        CPBD.add(b1);
        CPBD.add(b2);
        CPBD.add(b3);
        CPBD.add(b4);
        CPBD.add(b5);
        CPBD.add(b6);
        CPBD.add(b7);

    }

    @Override
    public Boolean AddCp(Cellphone cellphone) {
       if (CPBD.add(cellphone)){
           return true;
       }
        return false;
    }


    @Override
    public boolean deleteCP(int id) {

        for (Cellphone cp : CPBD) {
            if (cp.getId()==id){
                CPBD.remove(cp);
                return true;
            }
        }

        return false;
    }

    @Override
    public Boolean updataCP(Cellphone cellphone) {
        for (Cellphone cp : CPBD) {
            if (cp.getId()== cellphone.getId()) {
                cp.setId(cellphone.getId());
                cp.setColor(cellphone.getColor());
                cp.setName(cellphone.getName());
                cp.setNetwork(cellphone.getNetwork());
                cp.setTtm(cellphone.getTtm());
                cp.setPrice(cellphone.getPrice());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Cellphone> AllCP() {
        return CPBD;
    }

    @Override
    public Cellphone getCP(int id) {
        for (Cellphone cp : CPBD) {
            if (cp.getId()==id){
                return cp;
            }
        }
        return null;
    }

    @Override
    public List<Cellphone> getCPName(String name) {
        List<Cellphone> Db=new ArrayList<>();
        String names=name.toLowerCase();
        for (Cellphone cp : CPBD) {
            if (cp.getName().toLowerCase().contains(names)) {
              Db.add(cp);
            }
        }
        return Db;
    }
}
