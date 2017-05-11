/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.servers;

/**
 *
 * @author rfteves
 */
public interface HtmlCached {
    public void setCached(boolean cached);
    public void setHtml(String html);
    public String getUrl();
}
