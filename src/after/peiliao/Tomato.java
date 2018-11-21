package after.peiliao;

import baseclasses.Noodle;
import baseclasses.Peiliao;

public class Tomato extends Peiliao {

    Noodle noodle;

    public Tomato(Noodle noodle){
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return "西红柿"+noodle.getDescription();
    }

    @Override
    public double getPrice() {
        return 1+noodle.getPrice();
    }
}
