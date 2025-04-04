public class Lobby {
    public void mostrarLobby() {
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();

        config.setModoOscuro(true);

        System.out.println("Configuración en Lobby:");
        config.mostrarConfiguracion();
    }
}
