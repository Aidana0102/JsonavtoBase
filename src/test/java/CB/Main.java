package CB;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.gerdiproject.json.GsonUtils;

public class Main {

    private static int i;

    public static void main(String[] args) {
        final GsonBuilder BUILDER = new GsonBuilder();
        final Gson GSON = BUILDER.setPrettyPrinting().create();
        Driver dr1 = new Driver(1, "GGG");
        Driver dr2 = new Driver(2, "KKK");
        Driver dr3 = new Driver(3, "LLL");
        Driver dr4 = new Driver(4, "VVV");

        List<Driver> driversOnTheroute = new ArrayList<>();
        driversOnTheroute.add(dr1);
        driversOnTheroute.add(dr2);
        driversOnTheroute.add(dr3);
        driversOnTheroute.add(dr4);

        Base b1 = new Base("On base");
        Base b2 = new Base("На ремонте");
        Base b3 = new Base("В пути");
        Base[] bases2 = {b1, b2, b3};

        List<Base> bases = new ArrayList<>();
        bases.add(b1);
        bases.add(b2);
        bases.add(b3);


        CARavt car1 = new CARavt(1, "Carname1", dr1, b1);
        CARavt car2 = new CARavt(2, "Carname2", dr2, b2);
        CARavt car3 = new CARavt(3, "Carname3", dr3, b2);
        CARavt car4 = new CARavt(4, "Carname4", dr4, b3);
        CARavt[] avtBase = {car1, car2, car3, car4};
        List<CARavt> caRavts = new ArrayList<>();
        caRavts.add(car1);
        caRavts.add(car2);
        caRavts.add(car3);
        caRavts.add(car4);
        caRavts.get(0).getName();

        Driver drw1 = new Driver(1, "WWW", car1);
        Driver drw2 = new Driver(2, "BBB", car1);
        Driver drw3 = new Driver(3, "CCC", car1);
        Driver drw4 = new Driver(4, "UUU", car1);
        Driver[] drivers2 = {drw1, drw2, drw3, drw4};
        List<Driver> drivers = new ArrayList<Driver>();
        drivers.add(drw1);
        drivers.add(drw2);
        drivers.add(drw3);
        drivers.add(drw4);
        System.out.println(car1.changeDriver(drivers));

        System.out.println("_-------------------------Первый этап:--------------------------------------_");
        String res1 = GSON.toJson(caRavts);
        String res2 = GSON.toJson(drivers);

        System.out.println(res1);
        System.out.println("_------------------------Второй этап:--------------------------------------_");
        System.out.println(res2);
        System.out.println("'" + "Drivers " + "'    " + "BUS" + "'" + "\n");

        for (int i = 0; i < 4; i++)


            System.out.println("'" + drivers.get(i).getName() + "    '    " + caRavts.get(i).getName() + "'");
          System.out.println("_-------------------------Третий  этап:--------------------------------------_");

        System.out.println("Do");
        for (int i = 0; i < avtBase.length; i++)
             System.out.println(caRavts.get(i).getName() + "    " + caRavts.get(i).getState().getBaSe() + "    " + caRavts.get(i).getDriver().getName()+ "     "+caRavts.get(i).getState().getBaSe());

        for (int i = 0; i < avtBase.length; i++) {
        System.out.println(caRavts.get(i).getName() + "    " + caRavts.get(i).getState().getBaSe() + "    " + caRavts.get(i).getDriver().getName()+ "     "+caRavts.get(i).getState().getBaSe());
//            System.out.println(car1.startDriving(bases));
//            System.out.println( car1.startRapair(bases));
//            System.out.println( car1.changeDriver(drivers));


        }

        System.out.println(caRavts.get(i).getName() + "    " + caRavts.get(i).getState().getBaSe() + "    " + caRavts.get(i).getDriver().getName()+ "     "+caRavts.get(i).getState().getBaSe());
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println(drivers.get(i).getName()+ car1.startDriving(bases));
        System.out.println( car1.startRapair(bases));
        System.out.println( car1.changeDriver(drivers));

        System.out.println( car2.startDriving(bases));
        System.out.println( car2.startRapair(bases));
        System.out.println( car2.changeDriver(drivers));

        System.out.println( car3.startDriving(bases));
        System.out.println( car3.startRapair(bases));
        System.out.println( car3.changeDriver(drivers));

        System.out.println( car4.startDriving(bases));
        System.out.println( car4.startRapair(bases));
        System.out.println( car4.changeDriver(drivers));

        System.out.println(" ");



//
//
////        Driver drw8=new Driver();
////
////
////        CARavt v=new CARavt();
//
////
//
//
////        public void SecondEtap(Driver  drivers){
////
////
////            if(drivers.getClass()==Driver.class) {
////
////                System.out.printf("%d %d",((Driver) drivers).name+"   "+ ((Em ployee) employee).Salary );
////
////            }
//
//        System.out.println("_-------------------------Первый этап:--------------------------------------_");
//        String res1 = GSON.toJson(avtBase);
//        String res2 = GSON.toJson(drivers);
//
//        System.out.println(res1);
//        System.out.println("_------------------------Второй этап:--------------------------------------_");
//
//        System.out.println(res2);
//
//        System.out.println("'" + "Drivers " + "'    " + "BUS" + "'" + "\n");
//
//        for (int i = 0; i < 4; i++)
//
//
//            System.out.println("'" + drivers[i].getName() + "    '    " + avtBase[i].getName() + "'");
//        System.out.println("_-------------------------Третий  этап:--------------------------------------_");
//        System.out.println("состояние В ПУТИ ");
//        System.out.println("Do");
//        for (int i = 0; i < avtBase.length; i++)
//            System.out.println(avtBase[i].getName() + "    " + avtBase[i].getState().getBaSe());
//        System.out.println("Posle");
//        for (int i = 0; i < avtBase.length; i++) {
//            if (avtBase[i].getState() == bases[2]) {
//                System.out.println("Грузовик в пути, невозможно сменить водителя");
//                avtBase[i].setState(b1);
//
//
//
//            }
//
//            System.out.println(avtBase[i].getName() + "    " + avtBase[i].getState().getBaSe());
//
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        System.out.println("состояние На базе ");
//        System.out.println("Do");
//        for ( i = 0; i < 4; i++)
//
//            System.out.println(avtBase[i].getName() + "    " + avtBase[i].getState().getBaSe() + "    " + avtBase[i].getDriver().getName()+ "     "+avtBase[i].getState().getBaSe());
//        System.out.println("Posle");
//        System.out.println("успешно вышли на маршрут");
//
//        int y = random.nextInt(4);
//        for ( i = 0; i < 4; i++) {
//
//            if (avtBase[i].getState() == bases[0]) {
//                avtBase[i].setState(bases[1]);
//                if (avtBase[i].getDriver() == null  &&  avtBase[i].getDriver()!=(drivers[y]) ){
//
//                    if(drivers[y].getName2()==null)
//                 {
//
//                    avtBase[i].setDriver(drivers[y]);
//                }
//                    else {
//                        System.out.println("Нет свободных водителей");
//                    }}
//                else if(avtBase[i].getDriver() != null ){
//                    if(drivers[y].getName2()==null)
//                    {
//                        avtBase[i].setDriver(drivers[y]);}
//                else {
//                        System.out.println(" Нет свободных водителей");
//                    }}
//
//                    }
//                }
//        for ( i = 0; i < 4; i++) {
//                System.out.println(avtBase[i].getName() + "    " + avtBase[i].getState().getBaSe() + "    " + avtBase[i].getDriver().getName()+ "        "+avtBase[i].getState().getBaSe());
//
//            }
//
//
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        System.out.println("состояние На ремонте  ");
//        System.out.println("Do");
//        for ( i = 0; i < 4; i++)
//
//            System.out.println(avtBase[i].getName() + "    " + avtBase[i].getState().getBaSe() + "    " + avtBase[i].getDriver().getName());
//        System.out.println("Posle");
//        for ( i = 0; i < 4; i++) {
//
//
//
//
//        }
}}

