package Figuras_Geometricas;

public class Circulo extends FiguraGeometrica{
    public Circulo(double valor1){
        super(valor1);
    }
    @Override
    public double getArea(){
        double radio = super.getValor1();
        return Math.PI * Math.pow(radio, 2);
    }
}
