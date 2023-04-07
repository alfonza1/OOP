package Assessment;

public class PC {

    private Motherboard motherboard;
    private Monitor monitor;
    private Case pcCase;

    public PC(Motherboard motherboard, Monitor monitor,Case pcCase) {
        this.motherboard = motherboard;
this.monitor = monitor;
        this.pcCase = pcCase;
    }

    private void drawLogo(){

        monitor.drawPixel(20,20,"blue");

    }
    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(monitor);
        System.out.println(pcCase);
        System.out.println(motherboard);
    }
    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Photoshop");
    }


}
