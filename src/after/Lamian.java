package after;

import baseclasses.Noodle;

public class Lamian extends Noodle {


    public Lamian(){
        description = "拉面";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
