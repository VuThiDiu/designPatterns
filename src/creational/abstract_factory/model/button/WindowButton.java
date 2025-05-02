package creational.abstract_factory.model.button;

public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("Window button");
    }
}
