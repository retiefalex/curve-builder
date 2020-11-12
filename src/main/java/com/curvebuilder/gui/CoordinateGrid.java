package com.curvebuilder.gui;

import javax.swing.*;
import java.awt.*;

public class CoordinateGrid extends JPanel {

    private final int xCoord;
    private final int yCoord;
    private final int width;
    private final int height;

    public CoordinateGrid(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(xCoord, yCoord, width, height);
    }

}
