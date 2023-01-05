public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 46;
        cliente.nombre ="Marta";
        cliente.telefono = 147852369;
        cliente.credito = 100.0;

        System.out.println("La cliente "+ cliente.nombre+
                            " con "+ cliente.edad + " años y número telefónico "+
                            cliente.telefono + " tiene un crédito de: "+ cliente.credito + "$");
        

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 38;
        trabajador.nombre ="Laura";
        trabajador.telefono = 658423971;
        trabajador.salario = 9870.0;

        System.out.println("La trabajadora "+ trabajador.nombre+
                            " con "+ trabajador.edad + " años y número telefónico "+
                            trabajador.telefono + " tiene un salario de: "+ trabajador.salario + "$");


    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}