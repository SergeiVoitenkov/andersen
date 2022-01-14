package task03.akhmetkhanov.structural.facade;

import task03.akhmetkhanov.structural.facade.computerparts.*;

public class Computer {
    private Processor processor = new Processor();
    private Bios bios = new Bios();
    private Ram ram = new Ram();
    private VideoAdapter videoAdapter = new VideoAdapter();
    private IODevice ioDevice = new IODevice();
    private Port port = new Port();
    private IDEDevice ideDevice = new IDEDevice();

    public void start() {
        processor.test();
        bios.copyBios();
        ram.checkRam();
        videoAdapter.setVideoAdapter();
        ram.fullTest();
        ioDevice.test();
        port.init();
        ideDevice.init();
        System.out.println("The system is running!");
    }
}
