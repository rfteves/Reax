/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rfteves
 */
public class PatMatcher {
    public static void main(String[]main) throws Exception {
        String span = " data-discountPrice=\"$89.99\"data-purchasable=\"true\"";
            Matcher m = Pattern.compile(" [0-9a-zA-Z\\-]+=\"[0-9a-zA-Z\\-$.]*\"[0-9a-zA-Z\\-]+").matcher(span);
            System.out.println(m.find());
    }
}
