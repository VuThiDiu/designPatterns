package creational.abstract_factory;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.WindowFactory;
import creational.abstract_factory.model.button.Button;
import creational.abstract_factory.model.checkbox.Checkbox;

public class Client {

    public static void main(String[] args) {
        GUIFactory guiFactory = new WindowFactory();
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
