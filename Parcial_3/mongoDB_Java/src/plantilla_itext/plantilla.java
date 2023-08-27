package plantilla_itext;

import java.time.*;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import java.io.IOException;

/**
 *
 * @author appka
 */
public class plantilla {

    String nombre;
    String apellido;
    LocalDate fecha;
    String encargado;
    String proposito;
    String laboratorioName;
    String depto;
    String inHorario, outHorario;
    String day;
    String time;

    Document doc;
    FileOutputStream archivo;
    Paragraph titulo, tituloTabla;

    public plantilla(String nombre, String apellido, LocalDate fecha, String time, String encargado, String laboratorioName, String proposito, String depto,
            String inHorario, String outHorario, String day) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha = fecha;
        this.time = time;
        this.encargado = encargado;
        this.laboratorioName = laboratorioName;
        this.proposito = proposito;
        this.depto = depto;
        this.inHorario = inHorario;
        this.outHorario = outHorario;
        this.day = day;

        doc = new Document(PageSize.A4);
        titulo = new Paragraph();
        tituloTabla = new Paragraph();
    }

    public void crearPlantilla() throws IOException {
        try {
            archivo = new FileOutputStream(nombre + ".pdf");
            //PdfWriter.getInstance(doc, archivo);
            PdfWriter writer = PdfWriter.getInstance(doc, archivo);

            FooterEventHandler footerHandler = new FooterEventHandler();
            writer.setPageEvent(footerHandler);

            doc.open();

            Image image = Image.getInstance("C:\\Users\\appka\\Downloads\\SantoDomingo.png");
            image.scaleToFit(400, 80);
            image.setAlignment(Image.ALIGN_CENTER); //Permite centrar la imagen
            doc.add(image);

            Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12); //Establezco la fuente negrilla
            Font normalFont = FontFactory.getFont(FontFactory.HELVETICA, 12); //Establezco la fuente normal
            Chunk chuck = new Chunk("\nPetición de Laboratorio", boldFont);
            titulo.add(chuck);
            titulo.setAlignment(1); //Centra el parrafo
            doc.add(titulo);

            doc.add(Chunk.NEWLINE); //Permite saltar linea
            
            String dia = String.valueOf(fecha);
            Paragraph date = new Paragraph();
            Chunk chuck5 = new Chunk("Fecha de Petición: ", boldFont);
            Chunk chuck6 = new Chunk(dia, normalFont);
            Chunk chuckS = new Chunk(" - ", normalFont);
            Chunk chuck7 = new Chunk(time, normalFont);
            date.add(chuck5);
            date.add(chuck6);
            date.add(chuckS);
            date.add(chuck7);
            doc.add(date);

            doc.add(Chunk.NEWLINE); //Permite saltar linea
            
            
            Paragraph texto = new Paragraph(
                    "La Universidad de las Fuerzas Armadas (ESPE) otorga a " + nombre + " " + apellido
                    + " el permiso no exclusivo para acceder y utilizar el Laboratorio '" + laboratorioName + "' "
                    + "con el propósito de '" + proposito + "'.\n\n"
                    + nombre + " " + apellido + " se compromete a utilizar el Laboratorio únicamente para "
                    + "los fines establecidos en el presente contrato. Cualquier uso indebido, ilegal o no "
                    + "autorizado del Laboratorio estará estrictamente prohibido."
                    + "\n\n" + nombre + " " + apellido + " asume la responsabilidad total por cualquier daño causado a las "
                    + "instalaciones, equipos o recursos del Laboratorio durante el período de uso. " + nombre + " " + apellido + " se compromete "
                    + "a reembolsar al Concedente por cualquier costo asociado con la reparación o reemplazo de los daños causados "
                    + "por su uso.\n"
                    + "\n" + nombre + " " + apellido + " se compromete a cumplir con todas las regulaciones de seguridad y "
                    + "protocolos establecidos para el uso del Laboratorio. El incumplimiento de estas regulaciones "
                    + "podría resultar en la revocación inmediata del permiso.");
            texto.setAlignment(Element.ALIGN_JUSTIFIED); //Permite justificar el texto
            doc.add(texto);

            doc.add(Chunk.NEWLINE);

            Chunk chuck1 = new Chunk("\nTabla de detalles de la petición del Laboratorio", normalFont);
            tituloTabla.add(chuck1);
            tituloTabla.setAlignment(1); //Centra el parrafo
            doc.add(tituloTabla);
            
            doc.add(Chunk.NEWLINE); //Permite saltar linea
            
            // Crear una tabla con 6 columnas
            PdfPTable table = new PdfPTable(6);

            // Agregar celdas a la tabla
            PdfPCell cell = new PdfPCell();
            cell.setPhrase(new com.itextpdf.text.Paragraph("Nombre"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph("Dia"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph("Entrada"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph("Salida"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph("Encargado"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph("Departamento"));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(laboratorioName));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(day));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(inHorario));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(outHorario));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(encargado));
            table.addCell(cell);
            cell.setPhrase(new com.itextpdf.text.Paragraph(depto));
            table.addCell(cell);

            // Agregar la tabla al documento
            doc.add(table);

            doc.add(Chunk.NEWLINE); //Permite saltar linea
            doc.add(Chunk.NEWLINE); //Permite saltar linea
            
            Image image1 = Image.getInstance("C:\\Users\\appka\\Downloads\\descarga.png");
            image1.scaleToFit(200, 90);
            doc.add(image1);
            
            Paragraph lineas = new Paragraph();
            Chunk chuckN = new Chunk("_________________________________                   _________________________________", boldFont);
            lineas.add(chuckN);
            doc.add(lineas);
            Paragraph firmas = new Paragraph();
            Chunk chuckNa = new Chunk("                  ", boldFont);
            Chunk chuckf = new Chunk(encargado, boldFont);
            Chunk chuckNa1 = new Chunk("                                                    ", boldFont);
            Chunk chuckf1 = new Chunk(nombre, boldFont);
            Chunk chuckNaS = new Chunk(" ", boldFont);
            Chunk chuckf2 = new Chunk(apellido, boldFont);
            firmas.add(chuckNa);
            firmas.add(chuckf);
            firmas.add(chuckNa1);
            firmas.add(chuckf1);
            firmas.add(chuckNaS);
            firmas.add(chuckf2);
            doc.add(firmas);
            
            doc.add(Chunk.NEWLINE); //Permite saltar linea
            
            Paragraph fnl = new Paragraph("Este contrato entra en vigor a partir de la fecha de emision.", FontFactory.getFont(FontFactory.HELVETICA, 8));
            fnl.setAlignment(1);
            doc.add(fnl);
            
            doc.close();
            System.out.println("Documento creado :D");
        } catch (FileNotFoundException | DocumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

class FooterEventHandler extends PdfPageEventHelper { //Clase para establecer el pie de pagina

    public void onEndPage(PdfWriter writer, Document document) {
        // Crear un pie de página
        Phrase footer = new Phrase("UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)", FontFactory.getFont(FontFactory.HELVETICA, 10));

        // Agregar el pie de página al documento
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, footer,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.bottom() - 10, 0);
    }
}
