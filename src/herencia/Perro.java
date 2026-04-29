package herencia;

public class Perro extends Animal{

    public Perro() {}

    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }

    //en mis tiempos había que poner un @override
    //apesar de todo recomiendan ponerlo
    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo de la clase padre");
        super.dormir();
    }
    //bueno ahora quiere demostrar que se puede acceder al metodo dormir original

}
