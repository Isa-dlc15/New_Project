public class Bicicleta {
    public Boolean movimiento;
    public String uso;
    public String marcha;
    public String color;

    public Bicicleta(Boolean movimiento, String uso, String marcha, String color) {
        this.movimiento = movimiento;
        this.uso = uso;
        this.marcha = marcha;
        this.color = color;
    }

    public void Marcha(String Marcha,String Uso,String Color) {
        this.marcha = Marcha;
        this.uso = Uso;
        this.color = Color;
    }

    public String getMarcha() {
        return marcha;
    }
    public String getColor() {
        return color;
    }

    public String getuso() {
        return uso;
    }

    public void getmovimientoT(){
        if (movimiento == false){
            movimiento = true;
            System.out.println("La bicicleta esta en movimiento");
        }else{
            System.out.println("La bicicleta ya estaba en movimiento");
        }
    }

    public void getmovimientoF(){
        if (movimiento == true){
            movimiento = false;
            System.out.println("La bicicleta ya no esta en movimiento");
        }else{
            System.out.println("La bicicleta ya estaba sin movimiento");
        }
    }

    public void mostrarEstado() {
        System.out.println("Marcha: " + marcha);
        System.out.println("Color: " + color);
        System.out.println("Uso: " + uso);
    }

    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(false,"Enduro", "SX V5", "Rojo");
        miBicicleta.mostrarEstado();
        miBicicleta.getmovimientoT();
        miBicicleta.getmovimientoF();
        miBicicleta.getmovimientoF();
    }
}