//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        //Creamos 3 Objetos
        Modulo modulo1= new Modulo();
        Modulo modulo2= new Modulo();
        Modulo modulo3= new Modulo();

        //Representen Login, Inventario y Reportes
        //Login
        modulo1.nombre="Login";
        modulo1.lenguaje="Java";
        modulo1.version="1.0";
        modulo1.terminado= false;

        //Inventario
        modulo2.nombre="Inventario";
        modulo2.lenguaje="Python";
        modulo2.version="2.0";
        modulo2.terminado= false;

        //Reportes
        modulo3.nombre="Reportes";
        modulo3.lenguaje="C++";
        modulo3.version="1.5";
        modulo3.terminado= false;

        //Mostrar 3 modulos
        System.out.println("Modulo LOGIN");
        modulo1.mostrarInformacion();

        System.out.println("\nModulo INVENTARIO");
        modulo2.mostrarInformacion();

        System.out.println("\nModulo REPORTES");
        modulo3.mostrarInformacion();
    }
}
