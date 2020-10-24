package Computer;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private GraphicsСard graphicsСard;
    private StorageDevice storageDevice;
    private Monitor monitor;

    ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.graphicsСard = new GraphicsСard();
        this.storageDevice = new StorageDevice();
        this.monitor = new Monitor();
    }

    void vkl() {
        cpu.vklCPU();
        memory.vklMemory();
        graphicsСard.vklGraphicsCard();
        storageDevice.vklStorageDevice();
        monitor.vklMonitor();
    }
}
