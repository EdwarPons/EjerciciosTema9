public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(42, "Edwar", "1165559963");
        cliente.setCredito((double)123456.78);

        cliente.mostrarInformacion();
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona (int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrarInformacion () {
        System.out.println("Nombre   => " + this.nombre);
        System.out.println("Edad     => " + this.edad);
        System.out.println("Teléfono => " + this.telefono);
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito (double credito) {
        this.credito = credito;
    }

    public void mostrarInformacion () {
        super.mostrarInformacion();
        System.out.println("Crédito  => " + this.credito);
    }

    public Cliente (int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }
}