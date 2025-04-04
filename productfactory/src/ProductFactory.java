package productos;

public class ProductFactory {

    public static Producto crearProducto(TipoProducto tipo, Object... datos) {
        switch (tipo) {
            case LIBRO:
                return new Libro(
                        (String) datos[0], // nombre
                        (double) datos[1], // precio
                        (String) datos[2], // isbn
                        (String) datos[3], // reseña
                        (String) datos[4], // autor
                        (int) datos[5]     // páginas
                );
            case REVISTA:
                return new Revista(
                        (String) datos[0], // nombre
                        (double) datos[1], // precio
                        (String) datos[2], // issn
                        (int) datos[3],    // edición
                        (String) datos[4]  // periodicidad
                );
            case PERIODICO:
                return new Periodico(
                        (String) datos[0], // nombre
                        (double) datos[1], // precio
                        (String) datos[2], // id
                        (String) datos[3]  // fecha
                );
            default:
                throw new IllegalArgumentException("Tipo de producto no válido");
        }
    }
}
