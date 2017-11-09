/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov09_ReadXMLFileUsingSAX;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author J2EE-33
 */
public class ReadXMLFileUsingSAX {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean bfname = false;
                boolean bfsalary = false;
                boolean bfcompany = false;

                @Override
                public void startElement(String uri, String localName, String qName,
                        Attributes attributes) throws SAXException {
                    //System.out.println("Start Element: " + qName);

                    if (qName.equalsIgnoreCase("FULLNAME")) {
                        bfname = true;
                    }
                    if (qName.equalsIgnoreCase("SALARY")) {
                        bfsalary = true;
                    }
                    if (qName.equalsIgnoreCase("COMPANY")) {
                        bfcompany = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    //System.out.println("End Element: " + qName);
                }

                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (bfname) {
                        System.out.println("Full name: " + new String(ch, start, length));
                        bfname = false;
                    }
                    if (bfsalary) {
                        System.out.println("Salary: " + new String(ch, start, length));
                        bfsalary = false;
                    }
                    if (bfcompany) {
                        System.out.println("Company: " + new String(ch, start, length));
                        bfcompany = false;
                    }
                }

            };

            saxParser.parse("D:\\Users\\J2EE-33\\Desktop\\JAVA\\AdvanceJava\\src\\com\\nov09_ReadXMLFileUsingSAX\\stuff.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
