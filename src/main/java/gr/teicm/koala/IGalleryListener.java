package gr.teicm.koala;

import javax.swing.*;
import java.io.IOException;

public interface IGalleryListener
{
    void setThumbnail(JPanel thumbnail) throws IOException;
}