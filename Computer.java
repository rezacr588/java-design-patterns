public class Computer {
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public String getRAM() {
        return this.RAM;
    }

    public String getHDD() {
        return this.HDD;
    }

    public boolean isGraphicsCardEnabled(){
        return this.isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return this.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "HDD: " + HDD + "\n" +
               "RAM: " + RAM + "\n" +
               "Graphics Card Enabled: " + isGraphicsCardEnabled + "\n" +
               "Bluetooth Enabled: " + isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("512GB", "16GB")
            .setIsBluetoothEnabled(true)
            .setIsGraphicsCardEnabled(true)
            .build();

        System.out.println(computer);
    }
}