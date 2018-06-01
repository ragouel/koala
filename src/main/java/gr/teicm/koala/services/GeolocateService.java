package gr.teicm.koala.services;

import gr.teicm.koala.views.StaticGeolocationView;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.IOException;

public class GeolocateService
{
    public GeolocateService(String path) throws TikaException, IOException, SAXException
    {
        MetadataRetrieverService retrieverService;
        double longitude;
        double latitude;

        retrieverService = new MetadataRetrieverService(path);//key == path
        longitude = retrieverService.getLongitude();
        latitude = retrieverService.getLatitude();

        if (latitude > 0 & longitude > 0)
        {
            new StaticGeolocationView(longitude, latitude);

        } else
        {
            new MessageService().latLongErrorMessage(path);
        }

    }
}