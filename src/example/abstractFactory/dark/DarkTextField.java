package example.abstractFactory.dark;

import example.abstractFactory.TextField;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("темное текстовое поле");
    }
}
