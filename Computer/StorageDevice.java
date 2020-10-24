package Computer;

public class StorageDevice {
    private String formFactor = "mATX";
    private String manufacturer = "Kingston";
    private String type = "SSD";
    private int volume = 465;

    void vklStorageDevice() {
        System.out.println("накопитель: " + " производитель " + manufacturer + " " + type + " форм фактор " + formFactor + " объем памяти " + volume + " Гб ");
    }

}
