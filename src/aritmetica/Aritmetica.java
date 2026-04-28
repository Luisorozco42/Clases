package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    //constructores
    //constructor vacio
    public Aritmetica(){}

    //sobrecarga de constructores
    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");

        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public void sumar() {
        System.out.println("Resultado de la suma: " + (this.operando1 + this.operando2));
    }

    public void restar() {
        System.out.println("Resultado de la resta: " + (this.operando1 - this.operando2));
    }
}
