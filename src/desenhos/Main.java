package desenhos;
 import javax.imageio.ImageIO;
import javax.swing.*;
 import java.awt.*;
 import java.awt.image.*;
import java.io.File;
import java.io.IOException;
 
 public class Main {
	
	 
    public static void main(String[] args) {
    	BufferedImage imagem /*= criarImagem()*/;
    	createMenu menu = new createMenu();
    	
    	JFrame frame = menu.createWindow();
    	menu.addComponents();
    	
    	frame.setVisible(true);
    }
 } 
