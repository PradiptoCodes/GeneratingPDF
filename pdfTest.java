package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfTest {
	
	public static void main(String[] args) {
		  try
		  {
			  Document document = new Document();
			 
			      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("d://AddImageExample.pdf"));
			      document.open();
			      document.add(new Paragraph("Image Example"));
			   
			      //Add Image
			      Image image1 = Image.getInstance("002.jpg");
			      //Fixed Positioning
			      image1.setAbsolutePosition(100f, 550f);
			      //Scale to new height and new width of image
			      image1.scaleAbsolute(200, 200);
			      //Add to document
			      document.add(image1);
			   
			      String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
			      Image image2 = Image.getInstance(new URL(imageUrl));
			      document.add(image2);
			   
			      document.close();
			      writer.close();
			      
			      String var="";
			   
			      
			  } catch (Exception e)
			  {
			      e.printStackTrace();
			  }
	}
	

}
