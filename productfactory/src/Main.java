package productos;

public class Main {
    public static void main(String[] args) {
        Producto libro = ProductFactory.crearProducto(
                TipoProducto.LIBRO,
                "Java Básico", 150.0, "978-1234567890", "Guía para principiantes", "Juan Pérez", 300
        );

        Producto revista = ProductFactory.crearProducto(
                TipoProducto.REVISTA,
                "TechToday", 35.0, "ISSN-0012", 45, "Mensual"
        );

        Producto periodico = ProductFactory.crearProducto(
                TipoProducto.PERIODICO,
                "Noticias Hoy", 10.0, "PER-009", "2025-04-03"
        );

        libro.mostrarDetalles();
        revista.mostrarDetalles();
        periodico.mostrarDetalles();
    }
}
