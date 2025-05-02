package creational.abstract_factory.factory;

import creational.abstract_factory.model.button.Button;
import creational.abstract_factory.model.button.WindowButton;
import creational.abstract_factory.model.checkbox.Checkbox;
import creational.abstract_factory.model.checkbox.WindowCheckbox;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
