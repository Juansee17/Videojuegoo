public class Main {
    public static void main(String[] args) {
        // Creación de tres videojuegos para comprobar independencia de objetos
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "Minecraft";
        juego1.genero = "Sandbox";
        juego1.version = "1.20";
        juego1.activo = false;

        Videojuego juego2 = new Videojuego();
        juego2.nombre = "FIFA 24";
        juego2.genero = "Deportes";
        juego2.version = "1.0";
        juego2.activo = false;

        Videojuego juego3 = new Videojuego();
        juego3.nombre = "Cyberpunk 2077";
        juego3.genero = "RPG";
        juego3.version = "2.1";
        juego3.activo = false;

        // Probando métodos en el primer juego
        System.out.println("--- Información inicial de Juego 1 ---");
        juego1.mostrarInformacion();

        System.out.println("\n--- Iniciando Juego 1 ---");
        juego1.iniciar();
        juego1.mostrarInformacion();
    }
}