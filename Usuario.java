public class Usuario
{
public static void main(String[] args)
{
Vehiculo vehiculo1 = new Vehiculo("Volkswagen", 2, 1400.0);
Vehiculo vehiculo2 = new Vehiculo("Toyota", 4, 2200.0);
Vehiculo vehiculo3 = new Vehiculo("Mazda", 6, 3560.0);
Catalogo catalogo = new Catalogo();
catalogo.agrega(vehiculo1);
catalogo.agrega(vehiculo2);
catalogo.agrega(vehiculo3);
System.out.println("Visualizacion inicial del catalogo");
catalogo.visualiza();
System.out.println();
SolicitudRebaja solicitudRebaja = new SolicitudRebaja
(10, 5, 0.1);
catalogo.ejecutaSolicitudRebaja(solicitudRebaja);
System.out.println("Visualizacion del catalogo tras " +
"ejecutar la primera solicitud");
catalogo.visualiza();
System.out.println();
SolicitudRebaja solicitudRebaja2 = new SolicitudRebaja
(10, 5, 0.5);
catalogo.ejecutaSolicitudRebaja(solicitudRebaja2);
System.out.println("Visualizacion del catalogo tras " +
"ejecutar la segunda solicitud");
catalogo.visualiza();
System.out.println();
catalogo.anulaSolicitudRebaja(1);
System.out.println("Visualizacion del catalogo tras " +
"anular la primera solicitud");
catalogo.visualiza();
System.out.println();
catalogo.restableceSolicitudRebaja(1);
System.out.println("Visualizacion del catalogo tras " +
"restablecer la primera solicitud");
catalogo.visualiza();
System.out.println();
}
}