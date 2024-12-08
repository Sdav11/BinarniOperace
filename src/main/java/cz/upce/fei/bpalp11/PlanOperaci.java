package cz.upce.fei.bpalp11;

public class PlanOperaci {
    private final BinarniOperace[] OPERACE = new BinarniOperace[10];
    private int pocetOperaci = 0;

    public void pridejOperaci(BinarniOperace operace) {
        if (pocetOperaci >= 10) {
            System.err.println("Nelze pridat dalsi operaci.");
            return;
        }
        this.OPERACE[pocetOperaci] = operace;
        pocetOperaci++;
    }

    public void provedOperace(double prvni, double druhy) {
        for (int i = 0; i < pocetOperaci; i++) {
            System.out.println(OPERACE[i].vypocitej(prvni, druhy));
        }
    }
}
