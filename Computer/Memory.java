package Computer;

public class Memory {
    private int volume = 8;
    private String type = "DDR3";
    private int frequency = 1333;
    private String manufacturer = "Kingston";

    void vklMemory() {
        System.out.println("оперативная память: " + " производитель " + manufacturer + " частота " + frequency + " Гц " + type + " " + volume + " Гб ");
    }
}
