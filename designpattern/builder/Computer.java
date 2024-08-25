package designpattern.builder;

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    private Computer() {
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }
    public static class Builder {
        private Computer computer;

        public Builder() {
            computer = new Computer();
        }

        public Builder setCPU(String cpu) {
            computer.CPU = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            computer.RAM = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            computer.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            computer.GPU = gpu;
            return this;
        }

        public Computer build() {
            return computer;
        }
    }
}
