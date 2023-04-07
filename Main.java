package Assessment;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(200, 200, 100);
        Case pcCase = new Case("NZXT H510", "NZXT", "550 volts", dimensions);
        Resolution resolution = new Resolution(50, 50);
        Monitor monitor = new Monitor(resolution, "SCEPTRE27in", "SCEPTRE");
        Motherboard motherboard = new Motherboard("MSI-PRO-VDH-MAX", "MSI", 4, 4, "MSI-BIOS");


        PC pc = new PC(motherboard, monitor, pcCase);
        pc.description();
        pc.powerUp();

    }
    }




