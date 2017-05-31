
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        //sdf.parse(h);
        System.out.println(sdf.format(new Date()));
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

    private static String[] DATE_USA_LOCALE_PATTERNS = {
        "yyyy.MM.dd G 'at' HH:mm:ss z",
        "EEE, MMM d, ''yy",
        "h:mm a",
        "hh 'o''clock' a, zzzz",
        "K:mm a, z",
        "yyyyy.MMMMM.dd GGG hh:mm aaa",
        "EEE, d MMM yyyy HH:mm:ss Z",
        "yyMMddHHmmssZ",
        "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
        "yyyy-MM-dd'T'HH:mm-ssZ",
        "yyyy-MM-dd'T'HH:mm:ssXXX",
        "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
        "YYYY-'W'ww-u"};

    public static boolean isDate(JsonElement value) {
        if (!value.isJsonPrimitive()) {
            return false;
        }
        boolean retval = false;
        SimpleDateFormat format = null;
        for (String pattern : Utilities.DATE_USA_LOCALE_PATTERNS) {
            format = new SimpleDateFormat(pattern);
            boolean ok = false;
            try {
                format.parse(value.getAsString());
                ok = true;
            } catch (ParseException ex) {
            }
            if (ok) {
                retval = true;
                break;
            }
        }
        return retval;
    }

    public static boolean isBigDecimal(JsonElement value) {
        if (!value.isJsonPrimitive()) {
            return false;
        }
        boolean retval = false;
        boolean ok = false;
        try {
            BigDecimal d = value.getAsBigDecimal();
            BigDecimal e = new BigDecimal(value.getAsString());
            ok = d.doubleValue() == e.doubleValue() && value.getAsString().indexOf(".") != -1;
        } catch (NumberFormatException nfe) {
        }
        if (ok) {
            retval = true;
        }
        return retval;
    }

    public static boolean isBigInteger(JsonElement value) {
        if (!value.isJsonPrimitive()) {
            return false;
        }
        boolean retval = false;
        boolean ok = false;
        try {
            BigInteger bi = value.getAsBigInteger();
            BigDecimal bd = value.getAsBigDecimal();
            ok = bi.doubleValue() == bd.doubleValue();
        } catch (NumberFormatException nfe) {
        }
        if (ok) {
            retval = true;
        }
        return retval;
    }

    public static boolean isBoolean(JsonElement value) {
        if (!value.isJsonPrimitive()) {
            return false;
        }
        boolean retval = false;
        boolean ok = false;
        try {
            Boolean bi = value.getAsBoolean();
            Boolean bd = Boolean.parseBoolean(value.getAsString());
            Boolean bo = value.getAsString().toLowerCase().equals("false") || value.getAsString().toLowerCase().equals("true");
            ok = bi.toString().equals(bd.toString()) && bo.booleanValue();
        } catch (NumberFormatException nfe) {
        }
        if (ok) {
            retval = true;
        }
        return retval;
    }
    
    public static String indents(int count) {
        StringBuilder sb = new StringBuilder();
        int y = 0;
        while (++y < count) {
            sb.append("\t");
        }
        return sb.toString();
    }
}
