public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Lobby lobby = new Lobby();

        juego.iniciarJuego();
        System.out.println();
        lobby.mostrarLobby();

        System.out.println("\nConfiguración final desde Main:");
        ConfiguracionGlobal.getInstancia().mostrarConfiguracion();
    }
}
