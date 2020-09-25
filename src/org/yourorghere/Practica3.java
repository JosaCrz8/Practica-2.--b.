package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



/**
 * 
 * @EQUIPO 6 
 * ISC
 * PRACTICA 2.b
 * Realiza la siguiente gráfica haciendo USO SOLO DE LÍNEAS, NO POLIGONOS, NO FIGURAS, en
pantalla completa. El tamaño debe ser proporcional. Los colores son opcionales. 
 */
public class Practica3 extends JFrame{

    static GL gl;
    static GLU glu;
    
    public Practica3 (){
        setTitle("USO SOLO DE LÍNEAS");
       setSize(1600, 900);
      // setSize(500, 500);
                      //Instanciamos la clase Graphic
        GraphicListener listener = new GraphicListener();
        //Creamos el canvas
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
    } 
    
    public static void main (String args[]){
        Practica3 frame = new Practica3();
        frame.setVisible(true);
     
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public class GraphicListener implements GLEventListener{

        public void display(GLAutoDrawable arg0) {
           // Indicamos el tamaño en pixeles del grosor de la linea
           gl.glLineWidth(2);
           //Indicamos que vamos a iniciar a crear lineas
           gl.glBegin(GL.GL_LINES);
           
                  gl.glColor3f(0,0,1);// el clolor de la linea horizontal de la posiciones en la coordenada x positivo
                  //gl.glColor3b(0, 0, 0);
                  //gl.glColor3d(12,13,12);
                  /////////////////////////////////////////////////////
                    //LINEA 1 HORIZONTAL
                     //indicamos las posiciones para la lineas
                  gl.glVertex2d(-900,900);
                  gl.glVertex2d(800,900);
                   //LINEA 2 HORIZONTAL
                   gl.glVertex2d(-800,800);
                  gl.glVertex2d(700,800);
                   
                  //LINEA 3 HORIZONTAL
                  gl.glVertex2d(-700,700);
                  gl.glVertex2d(600,700);
                  //LINEA 4 HORIZONTAL
                  gl.glVertex2d(-600,600);
                  gl.glVertex2d(500,600);
                  //LINEA 5 HORIZONTAL
                  gl.glVertex2d(-500,500);
                  gl.glVertex2d(400,500);
                  
                  //LINEA 6 HORIZONTAL
                  gl.glVertex2d(-400,400);
                  gl.glVertex2d(300,400);
                  //LINEA 7 HORIZONTAL
                  gl.glVertex2d(-300,300);
                  gl.glVertex2d(200,300);
                  //LINEA 8 HORIZONTAL
                  
                  gl.glVertex2d(-200,200);
                  gl.glVertex2d(100,200);
                  //LINEA 9 HORIZONTAL
                  gl.glVertex2d(-150,100);
                  gl.glVertex2d(50,100);
                  
                  
///////////////////////////////////////////////////////////////////
                  //LINEA -1 VERTICAL
                  
                  gl.glColor3f(1,1,0);// el clolor de la linea  de la posiciones en la coordenada de y negativo
                   //indicamos las posiciones para la lineas
                  gl.glVertex2d(-900,-900);
                  gl.glVertex2d(-900,900);
                  
                  //LINEA -2 VERTICAL
                    
                  gl.glVertex2d(-800,-800);
                  gl.glVertex2d(-800,800);
                   
                  //LINEA -3 VERTICAL
                   gl.glVertex2d(-700,-700);
                  gl.glVertex2d(-700,700);
                    
                  //LINEA -4 VERTICAL
                   gl.glVertex2d(-600,-600);
                  gl.glVertex2d(-600,600);
                  
                  //LINEA -5 VERTICAL
                   gl.glVertex2d(-500,-500);
                  gl.glVertex2d(-500,500);
                  
                  //LINEA -6 VERTICAL
                   gl.glVertex2d(-400,-400);
                  gl.glVertex2d(-400,400);
                  
                  //LINEA -7 VERTICAL
                   gl.glVertex2d(-300,-300);
                  gl.glVertex2d(-300,300);
                  
                  //LINEA -8 VERTICAL
                   gl.glVertex2d(-200,-200);
                  gl.glVertex2d(-200,200);
                  
                  //LINEA -9 VERTICAL
                   gl.glVertex2d(-150,-100);
                  gl.glVertex2d(-150,100);
                  
                        
                  
///////////////////////////////////////////////////////////////////
                  //LINEA -9 HORIZONTAL 

                  gl.glColor3f(1,0,0);// el clolor de la linea horizontal de la posiciones en la coordenada x negativo
                  //indicamos las posiciones para la lineas
                  gl.glVertex2d(800,-900);
                  gl.glVertex2d(-900,-900);
                  
                  //LINEA -8 HORIZONTAL
                  gl.glVertex2d(700,-800);
                  gl.glVertex2d(-800,-800);
                  
                  //LINEA -7 HORIZONTAL
                  gl.glVertex2d(600,-700);
                  gl.glVertex2d(-700,-700);
                  
                  //LINEA -6 HORIZONTAL
                  gl.glVertex2d(500,-600);
                  gl.glVertex2d(-600,-600);
                  
                  //LINEA -5 HORIZONTAL
                  gl.glVertex2d(400,-500);
                  gl.glVertex2d(-500,-500);
                  
                  //LINEA -4 HORIZONTAL
                    gl.glVertex2d(300,-400);
                  gl.glVertex2d(-400,-400);
                  
                  //LINEA -3 HORIZONTAL
                  gl.glVertex2d(200,-300);
                  gl.glVertex2d(-300,-300);
                  
                  //LINEA -2 HORIZONTAL
                  gl.glVertex2d(100,-200);
                  gl.glVertex2d(-200,-200);
                  
                  //LINEA -1 HORIZONTAL
                  gl.glVertex2d(50,-100);
                  gl.glVertex2d(-150,-100);
                  
                  

                  
 /////////////////////////////////////////////////////////////////
                  //LINEA 1 VERTICAL
                 gl.glColor3f(0,1,0);// el clolor de la linea vertical de la posiciones en la coordenada y positivo
                 //indicamos las posiciones para la lineas
                  gl.glVertex2d(800,-900);
                  gl.glVertex2d(800,900);
                  
                  //LINEA 2 VERTICAL
                  gl.glVertex2d(700,-800);
                  gl.glVertex2d(700,800);
                   
                  //LINEA 3 VERTICAL
                  gl.glVertex2d(600,-700);
                  gl.glVertex2d(600,700);
                    
                  //LINEA 4 VERTICAL
                  gl.glVertex2d(500,-600);
                  gl.glVertex2d(500,600);
                  
                  //LINEA 5 VERTICAL
                  gl.glVertex2d(400,-500);
                  gl.glVertex2d(400,500);
                  
                  //LINEA 6 VERTICAL
                  gl.glVertex2d(300,-400);
                  gl.glVertex2d(300,400);
                  
                  //LINEA 7 VERTICAL
                  gl.glVertex2d(200,-300);
                  gl.glVertex2d(200,300);
                  
                  //LINEA 8 VERTICAL
                  gl.glVertex2d(100,-200);
                  gl.glVertex2d(100,200);
                  
                  //LINEA 9 VERTICAL
                  gl.glVertex2d(50,-100);
                  gl.glVertex2d(50,100);
                  
            //Deshabilitamos la creacion de lineas (de la maquina de estados )
           gl.glEnd();

           gl.glFlush();

        }


        public void init(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            
            gl.glClearColor(0, 0, 0, 0);// color de fondo
            //Establecer los parametros para la proyeccio
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(-1000, 900, -1000, 1000);
        }

        
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        }

        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {

        }

    }
}

 
