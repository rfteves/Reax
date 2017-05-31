/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.io;

import com.gotkcups.servers.HtmlCached;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rfteves
 */
public class PageReader {

    public static void main(String[] args) {
    }

    private final static StringBuilder CONTENT = new StringBuilder();

    private final static Map<String, Long> TIMES = new HashMap<>();
    private final static Map<String, String> HTMLS = new HashMap<>();

    public static void fetch(HtmlCached ud) {
        if (TIMES.containsKey(ud.getUrl()) && TIMES.get(ud.getUrl()) > System.currentTimeMillis()) {
            ud.setHtml(HTMLS.get(ud.getUrl()));
            return;
        }
        try {
            Thread.sleep(750);
        } catch (InterruptedException ex) {
            Logger.getLogger(PageReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        CONTENT.setLength(0);
        //Scanner in = null;
        //In page = new In(ud.getUrl());
        String html = RestClient.processGetHtml(ud.getUrl());
        HTMLS.put(ud.getUrl(), html);
        TIMES.put(ud.getUrl(), System.currentTimeMillis() + (1000 * 60 * 60));
        ud.setHtml(HTMLS.get(ud.getUrl()));
        //page.close();
        /*try {
            URL url = new URL(ud.getUrl());
            in = new Scanner(url.openStream());
            while (in.hasNext()) {
                CONTENT.append(in.nextLine());
                CONTENT.append("\r\n");
            }
            HTMLS.put(ud.getUrl(), CONTENT.toString());
            TIMES.put(ud.getUrl(), System.currentTimeMillis() + (1000 * 60 * 60));
            ud.setHtml(HTMLS.get(ud.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }*/

    }
}
