package example.abstractFactory.light;

import example.abstractFactory.TextField;

public class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("светлое текстовое поле");
    }
}
