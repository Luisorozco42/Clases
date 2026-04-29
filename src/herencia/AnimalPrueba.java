package herencia;

public class AnimalPrueba {
    static void main() {
//        System.out.println("*** Ejemplo de herencia ***");
//        System.out.println("Clase padre, soy un animal");
//        var animal1 = new Animal();
//        animal1.comer();// Bueno esto es un ejemplo de que si este se encuentra dentro del mismo paquete
//        //se puede acceder a las funciones de este, la otra forma es que herede directamente de la clase Animal
//        animal1.dormir();
//
//        System.out.println("Clase hija, soy un perro");
//        var perro = new Perro();
//
//        perro.comer();// estos 2 son parte de perro porque heredan de la superclase Animal
//        perro.dormir();
//        perro.hacerSonido();//este es parte de su propia funcionalidad no lo hereda

        var animal = new Animal();
        imprimirSonido(animal);

        //momento polimorfismo
        var perro = new Perro();
        imprimirSonido(perro);
        //polimorfismo de nuevo
        var gato = new Gato();
        imprimirSonido(gato);
    }

    //metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
}
