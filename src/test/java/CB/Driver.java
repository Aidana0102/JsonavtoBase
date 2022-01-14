package CB;

public class Driver {
    private int  id;
    private String  name ;
    private CARavt carName;

    public Driver() {
    }

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Driver(int id, String name, CARavt name1) {
        this.id = id;
        this.name = name;
        this.carName = name1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
public CARavt getName2(){
        return carName;
}
    public void setName(CARavt name) {
        carName = name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

