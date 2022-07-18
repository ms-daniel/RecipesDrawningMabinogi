package desenhos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class createImagem {
	private int  width = 245, heigh = 12;
	private BufferedImage buffer;
	private Graphics g;
	
	public void saveImage(String name) throws IOException {
		ImageIO.write(buffer, "png", new File(name +".png") );
		
	}
	
	public ImageIcon getImage() {
		return new ImageIcon(buffer);
	}
	
	public void doFont(String ig1,String ig2,String ig3) {
		Font font = new Font("Times New Roman", Font.BOLD, 12);
		
		g.setColor( Color.BLUE );
		g.setFont( font );
		g.drawString("Teste 1", 0, 20); 
	}
	
	public void doLines(int p1, int p2, int p3) {
		buffer = new BufferedImage( width, heigh, BufferedImage.TYPE_INT_ARGB );
		g = buffer.createGraphics();
		
        g.setColor( Color.BLUE );
        
        // linha inicial e final
        g.drawLine(0, 0, 0, heigh);
        g.drawLine(244, 0, 244, heigh);
        //
        
        g.setColor( Color.red );
        g.drawLine(p1, 0, p1, heigh);
        
        g.drawLine(p2, 0, p2, heigh);

        if(p3 != 0)
        	g.drawLine(p3, 0, p3, heigh);
    }
}
