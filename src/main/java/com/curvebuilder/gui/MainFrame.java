package com.curvebuilder.gui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

@Component
public class MainFrame extends JFrame {

    Logger LOG = LoggerFactory.getLogger(MainFrame.class);

    @PostConstruct
    void initUI() {
        LOG.info("Initialising UI...");
        setTitle("UI");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
