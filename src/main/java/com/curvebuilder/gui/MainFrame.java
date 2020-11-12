package com.curvebuilder.gui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    private static final Logger LOG = LoggerFactory.getLogger(MainFrame.class);
    private static final String TITLE = "UI";
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private static final int BORDER_WIDTH = 5;

    @PostConstruct
    public void initUI() {
        LOG.info("Initialising GUI with title {} and dimensions {}x{}", TITLE, WIDTH, HEIGHT);
        setTitle(TITLE);
        setSize(new Dimension(WIDTH, HEIGHT));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addCoords();
    }

    private void addCoords() {
        CoordinateGrid grid = new CoordinateGrid(BORDER_WIDTH, BORDER_WIDTH, WIDTH-BORDER_WIDTH,
                HEIGHT-BORDER_WIDTH);
        add(grid);
    }

}
