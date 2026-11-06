package example.abstractFactory.light;

import example.abstractFactory.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("светлая кнопка");
    }
}
