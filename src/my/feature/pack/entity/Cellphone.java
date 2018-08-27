package my.feature.pack.entity;

public class Cellphone {
    //序号
     int id;
    //名称
    String name;
    //网络格式
    String network;
    //机身颜色
    String color;
    //上市时间
    String ttm;
    //价格
    float price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTtm() {
        return ttm;
    }

    public void setTtm(String ttm) {
        this.ttm = ttm;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public Cellphone(int id, String name, String network, String color, String ttm, float price) {
        this.id = id;
        this.name = name;
        this.network = network;
        this.color = color;
        this.ttm = ttm;
        this.price = price;

    }
}
