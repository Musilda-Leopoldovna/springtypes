package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {

    private Wood3 wood;

    @Autowired
    public void setWood( Wood3 wood3) {
        this.wood = wood3;
    }

    @Override
    public String toString() {
        return "На острове дерево. " + wood.toString();
    }
}
