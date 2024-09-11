package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private Rabbit4 rabbit;

    @Autowired
    public void setRabbit(Rabbit4 rabbit4) {
        this.rabbit = rabbit4;
    }

    @Override
    public String toString() {
        return "На дереве заяц за уши подвешен. " + rabbit.toString();
    }
}
