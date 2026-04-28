//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Cabe a destacar que tecnicamente estoy reaalizando todos estos ejercios como practica
    //o como reeforzamiento de lo que he aprrendido mucho tiempo atras, ademas de ver las nuevas sintaxis

    System.out.println("*** Creacion de clases y objetos ***");
    Persona luis = new Persona();

    luis.nombre = "Luis";
    luis.apellido = "Orozco";
    luis.email = "lorozcolazo@gmail.com";
    // numero generico
    luis.celular = "78958212";
    luis.mostrarPersona();

    System.out.println();
    Persona juan = new Persona();

    juan.nombre = "Juan";
    juan.apellido = "Gutierrez";
    juan.email = "juan.gutierrez@gmail.com";
    juan.celular = "54821485";
    juan.mostrarPersona();

    Aritmetica aritmetica1 = new Aritmetica();

    aritmetica1.operando1 = 5;
    aritmetica1.operando2 = 7;

    aritmetica1.sumar();
    aritmetica1.restar();
}
