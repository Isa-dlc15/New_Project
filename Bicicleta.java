public class Bicicleta {
    public Boolean movimiento;
    public String uso;
    public String marca;
    public String color;

    public Bicicleta(Boolean movimiento, String uso, String marca, String color) {
        this.movimiento = movimiento;
        this.uso = uso;
        this.marca = marca;
        this.color = color;
    }

    public String getMarcha() {
        return marca;
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
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Uso: " + uso);
    }

    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(movimiento:false,uso:"Enduro",marca:"SX V5",color:"Rojo");
        miBicicleta.mostrarEstado();
        miBicicleta.getmovimientoT();
        miBicicleta.getmovimientoF();
        miBicicleta.getmovimientoF();
    }
}