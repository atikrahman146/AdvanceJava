/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov11_DomParser;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author J2EE-33
 */
public class DomParser {

    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\Users\\J2EE-33\\Desktop\\JAVA\\AdvanceJava\\src\\com\\nov11_DomParser\\domparser.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();
            System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("--------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no. " + eElement.getAttribute("rollno"));
                    System.out.println("First name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }
        } catch (Exception e) {

        }
    }
}
