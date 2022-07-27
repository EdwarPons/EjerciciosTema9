public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(42, "Edwar", "1165559963");
        cliente.setCredito((double)123456.78);
        cliente.mostrarInformacion();

        Trabajador trabajador = new Trabajador(42, "Edwar", "1165559963");
        trabajador.setSalario((double)280000.78);
        trabajador.mostrarInformacion();
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
        System.out.println("\tNombre   => " + this.nombre);
        System.out.println("\tEdad     => " + this.edad);
        System.out.println("\tTeléfono => " + this.telefono);
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito (double credito) {
        this.credito = credito;
    }

    public void mostrarInformacion () {
        System.out.println("\nDe clase Cliente obtenemos\n");
        super.mostrarInformacion();
        System.out.println("\tCrédito  => " + this.credito);
    }

    public Cliente (int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }
}

class Trabajador extends Persona {
    private double salario;

    public void setSalario (double salario) {
        this.salario = salario;
    }

    public void mostrarInformacion () {
        System.out.println("\nDe clase Trabajador obtenemos\n");
        super.mostrarInformacion();
        System.out.println("\tSalario  => " + this.salario);
    }

    public Trabajador (int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }
}