package productos;

public class Libro extends Producto {
    private String isbn;
    private String reseña;
    private String autor;
    private int paginas;

    public Libro(String nombre, double precio, String isbn, String reseña, String autor, int paginas) {
        super(nombre, precio);
        this.isbn = isbn;
        this.reseña = reseña;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📚 Libro:");
        System.out.println("Título: " + nombre);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Precio: $" + precio);
        System.out.println("Reseña: " + reseña);
        System.out.println();
    }
}
