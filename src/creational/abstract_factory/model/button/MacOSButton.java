package creational.abstract_factory.model.button;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("MacOS button");
    }
}
