package Figuras_Geometricas;

public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(double valor1){
        super(valor1);
    }
    @Override
    public double getArea(){
        double lado = super.getValor1();
        return Math.pow(lado,2);
    }
}