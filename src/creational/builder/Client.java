package creational.builder;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Dell")
                .setCPU("Intel i9")
                .setRam("32GB")
                .setStorage("1T SSD")
                .setGpu("NVIDIA")
                .builder();

        computer.printInformation();
    }
}
