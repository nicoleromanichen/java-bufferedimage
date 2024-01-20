package testebufferedimage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

    public class Tela extends JPanel {
        
    final int originalTileSize = 16; // 16x16
    final int escala = 3;
    
    public final int telaEscalada = originalTileSize * escala; // 48x48
    public final int tamanhoMaxColuna = 16;
    public final int tamanhoMaxLinha = 12;
    public final int telaLargura = telaEscalada * tamanhoMaxColuna; // 48x16 = 768 pixels
    public final int telaAltura = telaEscalada * tamanhoMaxLinha; // 48x12 = 576 pixels
        
        public Tela() {
            this.setPreferredSize(new Dimension(telaLargura, telaAltura));
            setBackground(new Color(54,54,54));
        }
        
        Imagem img = new Imagem(this);
        
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            //Desenhar o sprite
            img.draw(g);
        }
        
}
