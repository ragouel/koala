package gr.teicm.koala.views;


import gr.teicm.koala.CustomComponents.ScaledImageLabel;

import javax.swing.*;
import java.awt.*;


public class KPhoto
{
    public JPanel imagePanel = new JPanel();
    private JButton geolocate;
    private String imagePath;
    private ImageIcon imageIcon;
    private ScaledImageLabel labelImage = new ScaledImageLabel();

    public KPhoto(ImageIcon imageIcon)
    {
        imagePanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;

        this.imagePath = imageIcon.getDescription();
        this.imageIcon = imageIcon;
        labelImage.setIcon(this.imageIcon);

        constraints.gridy = 0;
        constraints.gridx = 0;
        JLabel imagePath = new JLabel();
        imagePath.setText(this.imagePath);


        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;

        geolocate = new JButton("Geolocate");
        constraints.gridx = 1;
        imagePanel.add(imagePath, constraints);

        constraints.gridx = 2;
        constraints.fill = GridBagConstraints.PAGE_END;
        constraints.weightx = 0.0;
        imagePanel.add(geolocate, constraints);

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        labelImage.setPreferredSize(new Dimension(800, 600));
        imagePanel.add(labelImage, constraints);

    }

    public void setDarkBG()
    {
        imagePanel.setBackground(Color.black);
    }

    public void setImageIcon(ImageIcon imageIcon)
    {
        this.imageIcon = imageIcon;
        imagePanel.updateUI();
    }
}