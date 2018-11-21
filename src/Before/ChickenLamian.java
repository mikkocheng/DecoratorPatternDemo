package Before;

import baseclasses.Noodle;

public class ChickenLamian extends Noodle {

    public ChickenLamian(){
        description = "大盘鸡拌面";
    }
    @Override
    public double getPrice() {
        return 14;
    }
}