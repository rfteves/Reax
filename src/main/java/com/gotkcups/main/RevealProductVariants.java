/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.cwd.db.Base64Coder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.gotkcups.io.RestClient;
import com.gotkcups.json.GsonData;
import com.gotkcups.json.GsonKey;
import com.gotkcups.json.GsonMapper;
import com.gotkcups.pageprocessors.CostcoProcessor;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang.StringEscapeUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author rfteves
 */
public class RevealProductVariants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String url = "https://www.costco.com/.product.100318260.html";
        String html = RestClient.processGetHtml(url);
        Map<String, String> jsons = CostcoProcessor.dig(html);
        jsons.values().stream().forEach(System.out::println);
        Map<GsonKey, JsonElement> products = GsonMapper.getJsonElements(jsons.get("products"));
        Map<GsonKey, JsonElement> options = GsonMapper.getJsonElements(jsons.get("options"));
        for (Map.Entry<GsonKey, JsonElement> entry : products.entrySet()) {

            if (entry.getKey().getField().endsWith("]listPrice")) {
                JsonElement js = new JsonParser().parse(Base64Coder.decode(entry.getValue().getAsString()));
                entry.setValue(js);
            } else if (entry.getKey().getField().endsWith("]price")) {
                JsonElement js = new JsonParser().parse(Base64Coder.decode(entry.getValue().getAsString()));
                entry.setValue(js);
            } else if (entry.getKey().getField().contains("]options.")) {
                String val = entry.getValue().getAsString();
                options.entrySet().stream().forEach(ops -> {
                    System.out.println(ops.getKey());
                    if (ops.getKey().getField().endsWith("v]".concat(val))) {
                        entry.setValue(ops.getValue());
                    }
                });
            }
        }
        StringBuilder text = new StringBuilder();
        products.entrySet().forEach(entry -> {
            if (entry.getKey().getField().endsWith("]partNumber")) {
                text.append("\r\n");
                text.append("VariantSku:" + entry.getValue().getAsString());
            } else if (entry.getKey().getField().endsWith("]productName")) {
                text.append(";\r\n\t\t");
                text.append("ProductName:" + StringEscapeUtils.unescapeHtml(entry.getValue().getAsString()));
            } else if (entry.getKey().getField().endsWith("]ordinal")) {
                text.append(";\r\n\t\t");
                text.append("Ordinal:" + StringEscapeUtils.unescapeHtml(entry.getValue().getAsString()));
            } else if (entry.getKey().getField().endsWith("]price")) {
                text.append(";\r\n\t\t");
                text.append("Price:" + entry.getValue().getAsBigDecimal());
            } else if (entry.getKey().getField().endsWith("]listPrice")) {
                text.append(";\r\n\t\t");
                text.append("ListPrice:" + entry.getValue().getAsBigDecimal());
            } else if (entry.getKey().getField().contains("]options.1")) {
                text.append(";\r\n\t\t");
                text.append("Option.1:" + StringEscapeUtils.unescapeHtml(entry.getValue().getAsString()));
            } else if (entry.getKey().getField().contains("]options.2")) {
                text.append(";\r\n\t\t");
                text.append("Option.2:" + StringEscapeUtils.unescapeHtml(entry.getValue().getAsString()));
            }
        });
        System.out.println(text.toString());
    }

    public static void display(Map.Entry value) {
        System.out.println(String.format("%s: %s", value.getKey(), value.getValue()));
    }

    public static void constructClass(Map<String, JsonElement> values) throws ParserConfigurationException {

    }
}
