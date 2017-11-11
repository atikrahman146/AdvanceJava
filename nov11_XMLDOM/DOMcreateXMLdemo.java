/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov11_XMLDOM;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author J2EE-33
 */
public class DOMcreateXMLdemo {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);

            Element staff = doc.createElement("staff");
            rootElement.appendChild(staff);

            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            //Shorten way
            staff.setAttribute("joining-date", "01012017");

            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Shahriar"));
            staff.appendChild(firstname);

            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Islam"));
            staff.appendChild(lastname);

            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("Topper"));
            staff.appendChild(nickname);

            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("100000"));
            staff.appendChild(salary);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\Users\\J2EE-33\\Desktop\\JAVA\\AdvanceJava\\src\\com\\nov11_XMLDOM\\domxml.xml"));

            transformer.transform(source, result);
            System.out.println("File saved");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
