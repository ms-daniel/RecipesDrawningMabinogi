package desenhos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class createImagem {
	private int  width = 245, heigh = 12;
	private BufferedImage buffer;
	
	public void saveImage(String name) throws IOException {
		ImageIO.write(buffer, "png", new File(name +".png") );
		
	}
	
	public ImageIcon getImage() {
		return new ImageIcon(buffer);
	}
	
	public void makeLines(int p1, int p2, int p3) {
		buffer = new BufferedImage( width, heigh, BufferedImage.TYPE_INT_ARGB );
        Graphics g = buffer.createGraphics();
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
