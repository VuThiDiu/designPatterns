package creational.abstract_factory.factory;

import creational.abstract_factory.model.button.Button;
import creational.abstract_factory.model.button.MacOSButton;
import creational.abstract_factory.model.checkbox.Checkbox;
import creational.abstract_factory.model.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
