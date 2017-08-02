/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.io;

/**
 *
 * @author rfteves
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.security.KeyStore;
import java.security.cert.*;
import javax.net.SocketFactory;
import javax.net.ssl.*;

public class SSLTest {
private static String password = "changeit";
    public static void main(String[] args) throws Exception {
        BufferedReader inx = new BufferedReader(
                new InputStreamReader(System.in));
        PrintStream out = System.out;
        SSLSocketFactory f
                = (SSLSocketFactory) SSLSocketFactory.getDefault();
        char[] passphrase = password.toCharArray();
        char SEP = File.separatorChar;
        File securityDir = new File(System.getProperty("java.home") + SEP
                + "lib" + SEP + "security");
        //File jssecacerts = new File(securityDir, host + "_" + port); // HD #34899
        File jssecacerts = new File(securityDir, "cacerts"); // HD #34899
        SSLSocketFactory factory = null;
        InputStream in = null;
        InstallTrustedCerts.SavingTrustManager tm = null;
        KeyStore ks = null;
        SSLSocket socket = null;
        try {
            
            
            File certs = jssecacerts;
            if (jssecacerts.exists() == false) {
                certs = new File(securityDir, "cacerts");
            }
            in = new FileInputStream(certs);
            ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(in, passphrase);
            in.close();
            SSLContext context = SSLContext.getInstance("TLS");
            TrustManagerFactory tmf =
                    TrustManagerFactory.getInstance(TrustManagerFactory.
                    getDefaultAlgorithm());
            tmf.init(ks);
            X509TrustManager defaultTrustManager = (X509TrustManager) tmf.
                    getTrustManagers()[0];
            tm = new InstallTrustedCerts.SavingTrustManager(defaultTrustManager);
            
            SSLSocket c
                    = (SSLSocket) f.createSocket("teves.us", 27017);
            printSocketInfo(c);
            HandshakeCompletedListener mListener = null;
            c.addHandshakeCompletedListener(new HandshakeCompletedListener() {
                @Override
                public void handshakeCompleted(HandshakeCompletedEvent hce) {
                    System.out.println();
                }
            });
            
            
            c.startHandshake();
            BufferedWriter w = new BufferedWriter(
                    new OutputStreamWriter(c.getOutputStream()));
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(c.getInputStream()));
            String m = null;
            while ((m = r.readLine()) != null) {
                out.println(m);
                m = inx.readLine();
                w.write(m, 0, m.length());
                w.newLine();
                w.flush();
            }
            w.close();
            r.close();
            c.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    private static void printSocketInfo(SSLSocket s) {
        System.out.println("Socket class: " + s.getClass());
        System.out.println("   Remote address = "
                + s.getInetAddress().toString());
        System.out.println("   Remote port = " + s.getPort());
        System.out.println("   Local socket address = "
                + s.getLocalSocketAddress().toString());
        System.out.println("   Local address = "
                + s.getLocalAddress().toString());
        System.out.println("   Local port = " + s.getLocalPort());
        System.out.println("   Need client authentication = "
                + s.getNeedClientAuth());
        SSLSession ss = s.getSession();
        System.out.println("   Cipher suite = " + ss.getCipherSuite());
        System.out.println("   Protocol = " + ss.getProtocol());
    }
}
