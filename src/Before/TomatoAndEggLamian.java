package Before;

import baseclasses.Noodle;

public class TomatoAndEggLamian extends Noodle {

    public TomatoAndEggLamian(){
        description = "西红柿鸡蛋面";
    }

    @Override
    public double getPrice() {
        return 12;
    }
}
