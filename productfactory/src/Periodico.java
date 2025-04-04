package productos;

public class Periodico extends Producto {
    private String id;
    private String fechaPublicacion;

    public Periodico(String nombre, double precio, String id, String fechaPublicacion) {
        super(nombre, precio);
        this.id = id;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📰 Periódico:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Precio: $" + precio);
        System.out.println();
    }
}
