
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.gotkcups.data.KeurigSpan;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        String span = "<span><a data-color-picker-name=\"Rhubarb\" title=\"Rhubarb\" data-anchor-div-row=\"1\" data-anchor-pos=\"0\" data-onsale-value=\"\" data-swatch-name=\"Rhubarb\" data-swatch-color=\"5000081025\" data-price=\"$119.99\" data-isDiscountPrice=\"true\" data-discountPrice=\"$89.99\"data-purchasable=\"true\" style=\"background-color:#991c21\" data-display-price-spider=\"false\" class=\"custom-color-picker-item \" href=\"#\" onclick=\"cmCreateProductviewTag('5000081025', '5000081025', 'EC_BR_H' , null, null);\"> </a><a data-color-picker-name=\"Black\" title=\"Black\" data-anchor-div-row=\"1\" data-anchor-pos=\"1\" data-onsale-value=\"\" data-swatch-name=\"Black\" data-swatch-color=\"5000068926\" data-price=\"$119.99\" data-isDiscountPrice=\"true\" data-discountPrice=\"$89.99\"data-purchasable=\"true\" style=\"background-color:#000000\" data-display-price-spider=\"true\" class=\"custom-color-picker-item active\" href=\"#\" onclick=\"cmCreateProductviewTag('5000068926', '5000068926', 'EC_BR_H' , null, null);\"> </a></span>";
        System.out.println(Utilities.insertSpace(span));
        KeurigSpan kspan = (KeurigSpan) Utilities.objectify(span, new KeurigSpan());
    }
    
    public static String insertSpace(String span) {
        while (true) {
            Matcher m = Pattern.compile(" [0-9a-zA-Z\\-]+=\"[0-9a-zA-Z\\-$.]*\"[0-9a-zA-Z\\-]+").matcher(span);
            if (m.find()) {
                int begin = m.start();
                int quotes = span.indexOf("\"", begin);
                quotes = span.indexOf("\"", quotes + 1);
                System.out.println(span.substring(quotes - 15, quotes + 15));
                span = span.substring(0, quotes + 1) + " " + span.substring(quotes + 1);
                System.out.println(span.substring(quotes - 15, quotes + 16));
            } else {
                break;
            }
        }
        return span;
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
            xml = Utilities.insertSpace(xml);
            if (object instanceof KeurigSpan) {
                
            }
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
            StringWriter sw = new StringWriter();
            retval = jaxbMarshaller.unmarshal(new InputStreamReader(new ByteArrayInputStream(xml.getBytes())));
        } catch (JAXBException ex) {
            System.out.println("XML:" + xml);
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
    
    public static String normalizeNumbers(String value, String[]excludes) {
        value = Utilities.normalizeDecimal(value, excludes);
        value = Utilities.normalizeInteger(value, excludes);
        return value;
    }
    
    private static String normalizeInteger(String value, String[]excludes) {
        
        Matcher m = Pattern.compile("\"[\\-]{0,1}[0-9]{1,}\"").matcher(value);
        int start = 0;
        while (m.find()) {
            start = m.start();
            String str = m.group();
            Matcher r = Pattern.compile("[\\-]{0,1}[0-9]{1,}").matcher(str);
            if (r.find()) {
                boolean flag = false;
                for (String exclude: excludes) {
                    int back = start - 2 - exclude.length();
                    if (back > 0 && value.length() > back && value.substring(back).startsWith(exclude)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    value = value.replaceAll(str, r.group());
                }
                
            }
        }
        return value;
    }
    
    private static String normalizeDecimal(String value, String[]excludes) {
        Matcher m = Pattern.compile("\"[\\-]{0,1}[0-9]{1,}\\.[0-9]{2}\"").matcher(value);
        int start = 0;
        while (m.find()) {
            start = m.start();
            String str = m.group();
            Matcher r = Pattern.compile("[\\-]{0,1}[0-9]{1,}\\.[0-9]{2}").matcher(str);
            if (r.find()) {
                boolean flag = false;
                for (String exclude: excludes) {
                    int back = start - 2 - exclude.length();
                    if (back > 0 &&  value.length() > back && value.substring(back).startsWith(exclude)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    value = value.replaceAll(str, r.group());
                }
            }
        }
        return value;
    }
}
