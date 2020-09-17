package PDF;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.*;

/**
 *
 * @author Ivan
 */
public class PDF_Factura {
    public static final String DEST = "Factura.pdf";

public static void crearPdf(String dest) throws IOException {
        //Fuente del escrito
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        //Tamaño de la hoja generada
        Document document = new Document(pdf, PageSize.A4.rotate());
        //Márgenes de la hoja generada
        document.setMargins(20, 20, 20, 20);
        
        //Imagen añadida
        ImageData data = ImageDataFactory.create("logo404.png");        
        Image img = new Image(data); 
        document.add(img);
        
        //Títulos y subtítulos con sus respectivas fuentes y tamaños
        document.add(new Paragraph("404040404040404"));
        document.add(new Paragraph("Error 404").setFont(font).setBold().setFontSize(20f));
        
        //Añade tabla
        //Añade las cabeceras de la tabla
        Table table = new Table(5);
        Cell c;
        //Definicion de los colores de la tabla 
        Color bkg = ColorConstants.BLACK;
        Color frg= ColorConstants.WHITE;
        //Añade las columnas
        c= new Cell(); c.add(new Paragraph("Cantidad")).setBackgroundColor(bkg).setFontColor(frg); 
        table.addHeaderCell(c);
        c= new Cell(); c.add(new Paragraph("Codigo")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);     
        c= new Cell(); c.add(new Paragraph("Descripcion")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Precio")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Total")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);                    
        
        //Añade la información correspondiente para cada columna
        for(int i=0;i<5;i++){
            table.addHeaderCell("4");
            table.addHeaderCell("404");
            table.addHeaderCell("Error 404");  
            table.addHeaderCell("400");             
            table.addHeaderCell("2000");               
        }
        //Crea una celda que cubre las otras celdas
        c= new Cell(1,4);  c.add(new Paragraph("SubTotal")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.CENTER);
        table.addHeaderCell(c);                    
        c= new Cell();  c.add(new Paragraph("2000")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);
        //Añade la tabla final al PDF
        document.add(table);
        document.close();
    }
}