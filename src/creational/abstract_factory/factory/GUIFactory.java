package creational.abstract_factory.factory;

import creational.abstract_factory.model.button.Button;
import creational.abstract_factory.model.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
