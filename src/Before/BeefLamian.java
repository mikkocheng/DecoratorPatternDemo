package Before;

import baseclasses.Noodle;

public class BeefLamian extends Noodle {

    public BeefLamian(){
        description = "牛肉拉面";
    }
    @Override
    public double getPrice() {
        return 10;
    }
}
