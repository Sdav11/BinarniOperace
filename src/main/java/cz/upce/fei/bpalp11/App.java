package cz.upce.fei.bpalp11;

public class App {

    public static void main(String[] args) {
        PlanOperaci planOperaci = new PlanOperaci();
        planOperaci.pridejOperaci(new Scitani());

        planOperaci.provedOperace(5, 3);
    }

}
