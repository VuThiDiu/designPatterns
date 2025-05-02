package creational.builder;

public class Computer {
    private String name;
    private String CPU;
    private String Ram;
    private String storage;
    private String gpu;

    public Computer(String name, String CPU, String Ram, String storage,
                    String gpu){
        this.name = name;
        this.CPU = CPU;
        this.Ram = Ram;
        this.storage = storage;
        this.gpu = gpu;
    }


    public void printInformation(){
        String formater = "Name: %s - CPU: %s - RAM :%s - Storage : %s - GPU : %s";
        System.out.println(String.format(formater, this.name, this.CPU, this.Ram, this.storage, this.gpu));
    }

    public static class Builder{
        private String name;
        private String CPU;
        private String Ram;
        private String storage;
        private String gpu;

        public Builder(String name){this.name = name; }
        public Builder setCPU(String cpu){this.CPU = cpu; return this; }
        public Builder setRam(String ram){this.Ram = ram; return this; }

        public Builder setStorage(String storage){this.storage = storage; return this; }
        public Builder setGpu(String gpu){this.gpu = gpu; return this; }

        public Computer builder(){
            return new Computer(this.name,
                    this.CPU,
                    this.Ram, this.storage, this.gpu);
        }

    }





}
