package example.abstractFactory.light;

import example.abstractFactory.Button;
import example.abstractFactory.TextField;
import example.abstractFactory.UIFactory;

public class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
