package my.feature.pack.dao;

import my.feature.pack.entity.Admin;

import java.util.ArrayList;
import java.util.List;

public class RealizeAccountDao implements AccountDao {
    private static List<Admin> admins=new ArrayList<>();
    static {
        Admin admin1=new Admin("admin","admin");
        Admin admin2=new Admin("张三","666");
        Admin admin3=new Admin("李四","admin");

        admins.add(admin1);
        admins.add(admin2);
        admins.add(admin3);
    }

    @Override
    public List<Admin> AllAdmin() {
        return admins;
    }
}
