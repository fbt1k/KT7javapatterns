package example.abstractFactory.dark;

import example.abstractFactory.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("темная кнопка");
    }
}
