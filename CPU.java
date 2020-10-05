public class CPU {
    private int frequency = 2400;
    private int core = 2;
    private int cash = 1;
    private String manufacturer = "icore";
    private String name = "Intel";

    void vklCPU() {
        System.out.println("процессор: " + name + "производитель " + manufacturer + "" + frequency + " Гц тактовая частота " + core + " ядра " + cash + " Гб кеш память");
    }
}

