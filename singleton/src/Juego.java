public class Juego {
    public void iniciarJuego() {
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();
        config.setIdioma("Inglés");
        config.setVolumen(80);
        System.out.println("Configuración en Juego:");
        config.mostrarConfiguracion();
    }
}


