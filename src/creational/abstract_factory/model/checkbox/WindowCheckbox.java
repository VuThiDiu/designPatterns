package creational.abstract_factory.model.checkbox;

public class WindowCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Window check box ");
    }
}
