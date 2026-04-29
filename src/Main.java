import aritmetica.Aritmetica;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import herencia.Animal;
import persona.Persona;


void main(String[] args) {
    //Cabe a destacar que técnicamente estoy realizando todos estos ejercicios como práctica
    //o como reforzamiento de lo que he aprendido mucho tiempo atrás, además de ver las nuevas sintaxis

    //Por cierto el curso en este momento está apenas mostrando los constructores para poder acceder
    //desde otras clases asi que ese cambio no se mirara en este repositorio

    /*
    System.out.println("*** Creación de clases y objetos ***");
    Persona luis = new Persona();

    luis.setNombre("Luis");
    luis.setApellido("Orozco");
    luis.setEmail("lorozcolazo@gmail.com");
    // número genérico
    luis.setCelular("78958212");
    luis.mostrarPersona();

    System.out.println();
    Persona juan = new Persona();

    juan.setNombre("Juan");
    juan.setApellido("Gutierrez");
    juan.setEmail("juan.gutierrez@gmail.com");
    juan.setCelular("54821485"); //también número genérico
    juan.mostrarPersona();
    System.out.println();

    Aritmetica aritmetica1 = new Aritmetica();//al crear esto se ejecuta el constructor

    aritmetica1.setOperando1(5);
    aritmetica1.setOperando2(7);
    aritmetica1.sumar();
    aritmetica1.restar();

    */

    //Animal animal1 = new Animal();
    //animal1.dormir(); no se puede acceder por la palabra reservada protected
    System.out.println("Variable estatica: " + Persona.getContadorPersona());//recordemos que para poder usarlos fuera del paquete es necesario tenerlo en public
    var objeto1 = new Persona("Luis", "Orozco", "lorozcolazo@gmail.com", "51544156");
    System.out.println(objeto1);//comportamiento por default es el toString()
    System.out.println("Variable estatica: " + Persona.getContadorPersona());
    //segundo objeto
    var objeto2 = new Persona("Ian", "Gomez","ian.gomez@gmail.com","56178528");
    System.out.println(objeto2);
    System.out.println("Variable estatica: " + Persona.getContadorPersona());// Es posble acceder desde objeeto.contadorPersona pero la buena practica es acceder desde la clase en si
}
