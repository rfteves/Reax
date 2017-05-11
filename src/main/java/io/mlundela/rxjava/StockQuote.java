/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.mlundela.rxjava;

/**
 *
 * @author rfteves
 */
public class StockQuote {

    // Given symbol, get HTML
    private static String readHTML(String symbol) {
        In page = new In("http://finance.yahoo.com/quote/" + symbol);
        String html = page.readAll();
        if (html.contains("<title></title>")) return null;
        else return html;
    }

    // Given symbol, get current stock price.
    public static double priceOf(String symbol) {
        String html = readHTML(symbol);
        int p     = html.indexOf("D(ib) Fw(200) Mend(20px)", 0);      // "price.0" index
        int from  = html.indexOf("<span", p);            // ">" index
        from = html.indexOf(">", from);
        int to    = html.indexOf("</span>", from);   // "</span>" index
        String price = html.substring(from + 1, to);

        // remove any comma separators
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    // Given symbol, get current stock price.
    public static double priceOf(String symbol, String html) {
        int p     = html.indexOf("D(ib) Fw(200) Mend(20px)", 0);      // "price.0" index
        int from  = html.indexOf("<span", p);            // ">" index
        from = html.indexOf(">", from);
        int to    = html.indexOf("</span>", from);   // "</span>" index
        String price = html.substring(from + 1, to);

        // remove any comma separators
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    // Given symbol, get current stock name.
    public static String nameOf(String symbol, String html) {
        int p    = html.indexOf("symbol.$companyName", 0);
        int from = html.indexOf(">", p);
        int to   = html.indexOf("</h6>", from);
        String name = html.substring(from + 1, to);
        return name;
    }

    // Given symbol, get current date.
    public static String dateOf(String symbol, String html) {
        int p    = html.indexOf("adx.bf1.yahoo.com", 0);
        int from = html.indexOf(" ", p);
        int to   = html.indexOf("-->", from);
        String date = html.substring(from + 1, to);
        return date;
    }


    public static void main(String[] args) {
        String symbol = "amd";
        String html = readHTML(symbol);
        if (html == null) StdOut.println("Invalid symbol: " + symbol);
        else {
            StdOut.println(priceOf(symbol, html));
            StdOut.println(nameOf(symbol, html));
            StdOut.println(dateOf(symbol, html));
        }
    }

}
