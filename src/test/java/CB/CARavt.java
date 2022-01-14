package CB;

import java.util.List;
import java.util.Random;

public class CARavt {
private int id;
private String name;
private Driver driver;
private Base state;


    public CARavt() {
    }
    public CARavt(int Id, String Name ,  Driver  driver, Base state) {
         this.id=Id;
         this.name=Name;
         this.driver=driver;
         this.state=state;

    }
    public String changeDriver(List<Driver> drivers){
        if(this.state.getBaSe().equals("On base")) {
            if (drivers.size() == 0) {
                return "Нет свободных водителей";
            }else{
                if (this.driver == null) {
                    this.driver = drivers.get(0);

                } else {
                    drivers.add(this.driver);
                    this.driver = drivers.get(0);
                    drivers.remove(0);
                }
            }}
            if (state.getBaSe().equals("В пути")) {
                return "Грузовик в пути, невозможно сменить водителя";
            } else {
                return " Нельзя сменить водителя";
            }
        }


    public  String startDriving(List<Base> bases){
        Random random = new Random();
        if(state.getBaSe()=="On base"){
        if (this.driver!=null){
            this.state=new Base("В пути ");
            return "успешно вышел на маршрут";
        }else{return "у грузовика нет водителя"; }
        }
        if(state.getBaSe()=="В пути") {
            return "Грузовик уже в пути";
        }
        else {
            this.state=bases.get(random.nextInt(2));
        }
        return "false";
    }

  public String startRapair(List<Base>bases){
      if(state.getBaSe()=="On base"){
          this.state=new Base("На ремонте");
      }
      if( state.getBaSe()=="В пути"){
          this.state=new Base("На ремонте");
          return "На ремонте ";

      }
       else { return "    Уже в ремонте";
  }
    }

    public int getId(int id){
        return id;
    }

    public String getName(String name){
        return  name;
    }

    public Driver getDriver() {
        return driver;
    }

    public Base getState() {
        return state;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void setState(Base state) {
        state = state;
    }


    public String getName() {
        return name;
    }
}
