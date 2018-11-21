package after.peiliao;

import baseclasses.Noodle;
import baseclasses.Peiliao;

public class Chicken extends Peiliao {

    Noodle noodle;

    public Chicken(Noodle noodle){
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return "鸡肉"+noodle.getDescription();
    }

    @Override
    public double getPrice() {
        return 2+noodle.getPrice();
    }
}
