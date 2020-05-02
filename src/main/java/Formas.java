// importamos la libreria proncipal
import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 640; // ancho en pixels
    int viewport_h = 360; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores
        background(92, 242, 222);

        //valla_1
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(65, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(75, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(85, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(95, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(105, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(115, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(125, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(135, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(145, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(65, 307, 80, 5);
        //valla_2
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(350, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(360, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(370, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(380, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(390, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(400, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(410, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(420, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(430, 300, 5, 25);
        stroke(185, 164, 116);
        fill(185, 164, 116);
        rect(350, 307, 80, 5);
        //paseo
        stroke(27, 153, 44);
        fill(27, 153, 44);
        rect(0, 320, 1000, 200);
        //casa
        stroke(0, 0, 0);
        fill(255, 255, 255);
        rect(150, 220, 200, 100);
        stroke(0, 0, 0);
        fill(111, 90, 5);
        rect(245, 290, 20, 30);
        stroke(0, 0, 0);
        fill(190, 154, 7);
        rect(180, 290, 15, 15);
        stroke(0, 0, 0);
        fill(190, 154, 7);
        rect(310, 290, 15, 15);
        stroke(0, 0, 0);
        fill(190, 154, 7);
        rect(180, 240, 15, 15);
        stroke(0, 0, 0);
        fill(190, 154, 7);
        rect(245, 240, 15, 15);
        stroke(0, 0, 0);
        fill(190, 154, 7);
        rect(310, 240, 15, 15);
        stroke(0, 0, 0);
        fill(151, 44, 44);
        rect(145, 205, 210, 15);
        stroke(0, 0, 0);
        fill(167, 161, 161);
        rect(300, 174, 15, 30);
        //paisaje
        stroke(142, 113, 17);
        fill(142, 113, 17);
        rect(480, 290, 7, 30);
        stroke(58, 173, 30);
        fill(58, 173, 30);
        ellipse(483, 290, 20, 20);
        ellipse(475, 295, 20, 20);
        ellipse(489, 295, 20, 20);
        stroke(142, 113, 17);
        fill(142, 113, 17);
        rect(578, 290, 7, 30);
        stroke(58, 173, 30);
        fill(58, 173, 30);
        ellipse(583, 250, 20, 40);
        ellipse(575, 256, 20, 25);
        ellipse(589, 256, 20, 25);
        ellipse(583, 280, 50, 35);
        stroke(239, 239, 40);
        fill(245, 245, 57);
        ellipse(500, 70, 100, 100);
        stroke(165, 165, 159);
        fill(165, 165, 159);
        ellipse(140, 50, 90, 30);
        ellipse(160, 50, 90, 40);
        ellipse(200, 50, 90, 50);
        ellipse(230, 50, 90, 40);
        ellipse(250, 50, 90, 30);
        ellipse(440, 70, 90, 30);
        ellipse(460, 70, 90, 40);
        ellipse(500, 70, 90, 50);
        ellipse(530, 70, 90, 40);
        ellipse(550, 70, 90, 30);
        ellipse(430, 90, 90, 30);
        ellipse(450, 90, 90, 40);
        ellipse(530, 90, 90, 50);
        ellipse(570, 90, 90, 40);
        ellipse(590, 90, 90, 30);

        //proyecto perro
        stroke(222,214,50);
        fill(237,229,64);
        ellipse(530, 310, 20, 10);
        stroke(222,214,50);
        fill(237,229,64);
        ellipse(517, 307, 15, 10);
        stroke(222,214,50);
        fill(237,229,64);
        rect(535, 315, 1, 4);
        rect(525, 315, 1, 4);
        stroke(222,214,50);
        fill(237,229,64);
        rect(540, 307, 4, 2);
        stroke(0,0,0);
        fill(0,0,0);
        ellipse(513,306,1,1);
        ellipse(519,306,1,1);
        rect(515, 310, 1, 1);
    }
}