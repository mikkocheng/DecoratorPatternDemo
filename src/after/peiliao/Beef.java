package after.peiliao;

import baseclasses.Noodle;
import baseclasses.Peiliao;

public class Beef extends Peiliao {

    Noodle noodle;

    public Beef(Noodle noodle){
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return "牛肉"+noodle.getDescription();
    }

    @Override
    public double getPrice() {
        return 4+noodle.getPrice();
    }
}
