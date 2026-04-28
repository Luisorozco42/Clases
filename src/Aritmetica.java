public class Aritmetica {
    int operando1;
    int operando2;

    //constructores
    //constructor vacio
    public Aritmetica(){}

    //sobrecarga de constructores
    public Aritmetica(int opt1, int opt2){
        System.out.println("Ejecutando constructor");

        operando1 = opt1;
        operando2 = opt2;
    }

    public void sumar() {
        System.out.println("Resultado de la suma: " + (operando1 + operando2));
    }

    public void restar() {
        System.out.println("Resultado de la resta: " + (operando1 - operando2));
    }
}
