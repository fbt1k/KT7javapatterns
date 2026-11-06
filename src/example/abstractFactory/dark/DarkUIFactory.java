package example.abstractFactory.dark;

import example.abstractFactory.Button;
import example.abstractFactory.TextField;
import example.abstractFactory.UIFactory;

public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
