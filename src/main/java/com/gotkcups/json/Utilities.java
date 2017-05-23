/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author rfteves
 */
public class Utilities {

    public static void main(String[] s) throws Exception {
        String h = "2016-07-30T11:10:00-07:00";
        System.out.println(Utilities.parsePublishedDate(h));
    }

    public static Date parsePublishedDate(String date) throws ParseException {
        String modified = date.substring(0, date.lastIndexOf(":")) + date.substring(date.lastIndexOf(":") + 1);
        SimpleDateFormat publishedTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        return publishedTime.parse(modified);
    }

    public static String formatPublishedDate(Date date) throws ParseException {
        SimpleDateFormat publishedTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String retval = publishedTime.format(date);
        return retval.substring(0, retval.length() - 2) + ":" + retval.substring(retval.length() - 2);
    }

    public static <T> String gson(T object) {
        Gson g = new Gson();
        return g.toJson(object);
    }

    public static <T> String xml(T object) {
        String retval = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter sw = new StringWriter();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(object, sw);
            retval = sw.toString();
        } catch (JAXBException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return retval;
        }
    }
    
    public static <T> Object objectify(String xml, T object) {
        Object retval = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
            StringWriter sw = new StringWriter();
            retval = jaxbMarshaller.unmarshal(new InputStreamReader(new ByteArrayInputStream(xml.getBytes())));
        } catch (JAXBException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return retval;
        }
    }
    
    public static String getApplicationProperty(String name) {
	File propertiesFile = new File("./application.properties");
	String userFile = propertiesFile.toURI().toString();
	URL url = null;
	Properties props = new Properties();
	String value = null;
	try {
	    url = new URL(userFile);
	    props.load(url.openStream());
	    value = props.getProperty(name);
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    return value;
	}
    }
}
