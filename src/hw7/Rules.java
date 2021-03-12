package hw7;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame{

    private MainWindow mainWindow;

    Rules(MainWindow mainWindow){

        final int WIN_WIDTH = 350;
        final int WIN_HEIGHT = 250;

        this.mainWindow = mainWindow;
        Rectangle mainWindowBounds = mainWindow.getBounds();
        setBackground(Color.BLUE);

        int posX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int posY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posX, posY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Rules");
        setResizable(false);
        setLayout(new GridLayout(10, 1));
setGameRules();
        setVisible(false);


    }

    private void setGameRules(){
        add(new JLabel("Здесь описаны правила игры"));
    }

}
