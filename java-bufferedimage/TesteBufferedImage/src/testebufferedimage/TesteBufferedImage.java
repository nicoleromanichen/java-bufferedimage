package testebufferedimage;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteBufferedImage { //Classe que está criando o Jframe

    public static void main(String[] args) {        
        JFrame janela = new  JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Imagem Teste");
        
        Tela tela = new Tela();
        janela.add(tela);      //Linha que vai colocar as dimensões do construtor da classe tela para JFrame criado aqui
        janela.pack();
        janela.setLocationRelativeTo(null);
        
        janela.setVisible(true);
    }
    
}
