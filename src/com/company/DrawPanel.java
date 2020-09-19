package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(new Color(255, 153, 51));
//        gr.drawLine(50, 50, 100, 100);
//        gr.drawRect(100, 100, 350, 250);
//        gr.fillRect(150, 150, 250, 150);

        drawSun(gr, new Color(255, 153, 51), 400, 300, 100, 60, 90);
    }

    private void drawSun(Graphics gr, Color color, int x, int y, int l, int r1, int r2) {
        gr.setColor(color);
        gr.fillOval(x - r1, y - r1, 2 * r1, 2 * r1);
        double rad = 2 * Math.PI / l;
        for (int i = 0; i < l; i++) {
            double dx1 = r1 * Math.sin(rad * i);
            double dy1 = r1 * Math.cos(rad * i);
            double dx2 = r2 * Math.sin(rad * i);
            double dy2 = r2 * Math.cos(rad * i);
            gr.drawLine((int) dx1 + x, (int) dy1 + y, (int) dx2 + x, (int) dy2 + y);
        }
    }
}
