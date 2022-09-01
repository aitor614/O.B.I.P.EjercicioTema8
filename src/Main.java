public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Tetsuo");
        persona.setTelefonoPersona(555555555);

        System.out.println("PERSONA \n");
        System.out.println("Tiene: " + persona.getEdad() + " años");
        System.out.println("Su nombre es: " + persona.getNombre());
        System.out.println("Su numero de telefono es: " + persona.getTelefonoPersona());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefonoPersona;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
    public int getTelefonoPersona() {
        return this.telefonoPersona = telefonoPersona;
    }
}