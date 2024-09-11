package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    @Autowired
    private Death8 death;

    @Override
    public String toString() {
        return "На конце иглы - смерть Кощея. " + death.toString();
    }
}
