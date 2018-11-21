package after.peiliao;

import baseclasses.Noodle;
import baseclasses.Peiliao;

public class Egg extends Peiliao {

    Noodle noodle;

    public Egg(Noodle noodle){
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return "鸡蛋"+noodle.getDescription();
    }

    @Override
    public double getPrice() {
        return 1+noodle.getPrice();
    }
}
