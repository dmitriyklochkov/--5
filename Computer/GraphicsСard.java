package Computer;

public class GraphicsСard {
    private String manufacturer = "ASUS";
    private String type = "Дискретная";
    private int volume = 2;
    private String cooling = "пассивное";

    void vklGraphicsCard() {
        System.out.println("видеокарта: " + " производитель " + manufacturer + " охлаждение " + cooling + " " + type + " объем памяти " + volume + " Гб ");
    }
}
