
public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia;

    private String idioma;
    private int volumen;
    private boolean modoOscuro;

    private ConfiguracionGlobal() {
        idioma = "Español";
        volumen = 50;
        modoOscuro = false;
    }

    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public void mostrarConfiguracion() {
        System.out.println("Idioma: " + idioma);
        System.out.println("Volumen: " + volumen);
        System.out.println("Modo Oscuro: " + (modoOscuro ? "Activado" : "Desactivado"));
    }
}
