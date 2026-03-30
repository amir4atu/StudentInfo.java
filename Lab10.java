import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Lab10 extends Applet implements ActionListener, MouseListener, Runnable {

    int task = 1;

    Button[] buttons = new Button[10];
    TextField tf;
    String text = "";
    int count = 0;
    Color color = Color.RED;

    int x = 0, y = 0; // для мыши и анимации

    public void init() {
        setLayout(new FlowLayout());

        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button("T" + (i + 1));
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        tf = new TextField(15);
        add(tf);

        addMouseListener(this);

        new Thread(this).start();
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == buttons[i]) {
                task = i + 1;
            }
        }

        // логика заданий
        if (task == 4) text = "Кнопка нажата!";
        if (task == 5) count++;
        if (task == 6) text = "Привет, " + tf.getText();
        if (task == 7) {
            if (color == Color.RED) color = Color.GREEN;
            else if (color == Color.GREEN) color = Color.BLUE;
            else color = Color.RED;
        }
        if (task == 10) {
            text = tf.getText();
            color = (color == Color.RED) ? Color.BLUE : Color.RED;
        }

        repaint();
    }

    public void paint(Graphics g) {

        switch (task) {

            case 1:
                g.drawRect(50, 50, 150, 100);
                g.drawString("Прямоугольник", 70, 45);

                g.drawOval(250, 50, 100, 100);
                g.drawString("Круг", 270, 45);

                g.drawLine(50, 200, 200, 200);
                g.drawString("Линия", 90, 195);
                break;

            case 2:
                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 100);

                g.setColor(Color.GREEN);
                g.fillOval(200, 50, 100, 100);

                g.setColor(Color.BLUE);
                g.fillRect(350, 50, 100, 100);

                g.setColor(Color.ORANGE);
                g.fillOval(500, 50, 100, 100);
                break;

            case 3:
                g.setColor(Color.MAGENTA);
                g.drawString("Hello Java Applet", 100, 100);
                break;

            case 4:
                g.drawString(text, 50, 100);
                break;

            case 5:
                g.drawString("Нажатий: " + count, 50, 100);
                break;

            case 6:
                g.drawString(text, 50, 100);
                break;

            case 7:
                g.setColor(color);
                g.fillOval(100, 100, 100, 100);
                break;

            case 8:
                g.fillOval(x, 100, 50, 50);
                break;

            case 9:
                g.fillOval(x, y, 10, 10);
                break;

            case 10:
                g.setColor(color);
                g.fillRect(100, 100, 100, 100);

                g.setColor(Color.BLACK);
                g.drawString(text, 100, 80);
                break;
        }
    }

    public void run() {
        while (true) {
            if (task == 8) {
                x += 5;
                if (x > getWidth()) x = 0;
                repaint();
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (task == 9) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}