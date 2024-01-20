package testebufferedimage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

    public class Imagem {
        
        Tela tela;
        public BufferedImage imagemTeste;
        public BufferedImage imagemTeste2;
        public BufferedImage imagemTeste3;
        public BufferedImage imagemTeste4;
        public TesteBufferedImage tbf;
        
        public Imagem(Tela tela) {
            tela = tela;
            carregarImagem();
        }
        
        public void carregarImagem() {
            
            try {
                imagemTeste = ImageIO.read(getClass().getResource("/capa1.jpg"));
                imagemTeste2 = ImageIO.read(getClass().getResource("/capa2.jpg"));
                imagemTeste3 = ImageIO.read(getClass().getResource("/capa3.jpg"));
                imagemTeste4 = ImageIO.read(getClass().getResource("/sprite1.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        
        public void draw(Graphics g) {
            g.drawImage(imagemTeste, 0, 0, 175, 250, null);
            g.drawImage(imagemTeste2, 0, 255, 175, 250, null);
            g.drawImage(imagemTeste3, 0, 510, 175, 250, null);
            g.drawImage(imagemTeste4, 500, 300, 175, 250, null);
            
        }
        
}
