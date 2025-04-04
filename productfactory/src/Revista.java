package productos;

public class Revista extends Producto {
    private String issn;
    private int edicion;
    private String periodicidad;

    public Revista(String nombre, double precio, String issn, int edicion, String periodicidad) {
        super(nombre, precio);
        this.issn = issn;
        this.edicion = edicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📖 Revista:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ISSN: " + issn);
        System.out.println("Edición: " + edicion);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Precio: $" + precio);
        System.out.println();
    }
}
