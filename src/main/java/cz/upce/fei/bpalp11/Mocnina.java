package cz.upce.fei.bpalp11;

public class Mocnina implements BinarniOperace {

    @Override
    public double vypocitej(double prvniOperand, double druhyOperand) {
        return Math.pow(prvniOperand, druhyOperand);
    }
    
}
