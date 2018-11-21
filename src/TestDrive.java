import Before.BeefLamian;
import Before.ChickenLamian;
import Before.ThreeInOneLamian;
import Before.TomatoAndEggLamian;
import after.Lamian;
import after.peiliao.Beef;
import after.peiliao.Chicken;
import after.peiliao.Egg;
import after.peiliao.Tomato;
import baseclasses.Noodle;

import java.util.PrimitiveIterator;

public class TestDrive {

    public static void main(String[]  args){

        //未使用装饰者模式
        BeefLamian beefLamian = new BeefLamian();
        printNoodleInfo(beefLamian);

        TomatoAndEggLamian tomatoAndEggLamian = new TomatoAndEggLamian();
        printNoodleInfo(tomatoAndEggLamian);

        ThreeInOneLamian threeInOneLamian = new ThreeInOneLamian();
        printNoodleInfo(threeInOneLamian);

        ChickenLamian chickenLamian = new ChickenLamian();
        printNoodleInfo(chickenLamian);

        //使用装饰者模式
        Noodle lamian = new Lamian();
        lamian = new Beef(lamian);
        lamian = new Chicken(lamian);
        lamian = new Egg(lamian);
        lamian = new Tomato(lamian);
        printNoodleInfo(lamian);

    }

    private static void printNoodleInfo(Noodle noodle){

        System.out.println(noodle.getDescription()+"的价格是："+noodle.getPrice()+"元");

    }

}
