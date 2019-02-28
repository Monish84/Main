package com;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class FirstPdf {
    private static String FILE = "D:/Monish.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL, BaseColor.RED);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
        
            //addMetaData(document);
            addTitlePage(document);
            
            // addContent(document);
            document.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
      
        addEmptyLine(preface, 1);										// We add one empty line
        
        preface.add(new Paragraph("Title of the document", catFont));	// Lets write a big header

        addEmptyLine(preface, 1);
        
        // Will create: Report generated by: _name, _date
        preface.add(new Paragraph("Report generated by: " +System.getProperty("user.name")+", " +new Date(),smallBold));
       
        addEmptyLine(preface, 3);
        preface.add(new Paragraph("This document describes something which is very important ",smallBold));

        addEmptyLine(preface, 8);
        preface.add(new Paragraph(
                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
                redFont));

        document.add(preface);
        
        // document.newPage();						// Start a new page
        
        System.out.println("PDF File Created................");
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}