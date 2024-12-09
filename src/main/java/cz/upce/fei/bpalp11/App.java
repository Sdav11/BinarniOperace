package cz.upce.fei.bpalp11;

public class App {

    public static void main(String[] args) {
        PlanOperaci planOperaci = new PlanOperaci();
        planOperaci.pridejOperaci(new Scitani());
        planOperaci.pridejOperaci(new Nasobeni());
//        BinarniOperace odcitani = (double prvniOperand, double druhyOperand) - takhle jde udělat anonymní třída a následně je použita lambda funkce pomocí žárovky 
//                -> prvniOperand - druhyOperand;
//        
//        planOperaci.pridejOperaci(odcitani);
        planOperaci.pridejOperaci(new Odcitani());
        planOperaci.pridejOperaci(new Deleni());
        planOperaci.pridejOperaci(new Mocnina());
        
        
        planOperaci.provedOperace(6, 3);
        planOperaci.provedOperace(10, 2);
    }

}
