import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.File;
import java.io.IOException;
import java.util.Map;


/**
 *      // use this to show fields
 PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC), new PdfWriter(DEST));

 PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);

 Map<String, PdfFormField> fields = form.getFormFields();
        for (String s : fields.keySet()) {
             System.out.println("s = " + s);
 */
public class Populator {

    private static final String SENDER = "Pia Stocker\nBergstrasse 15\n8800 Thalwil";
    private static final String IBAN = "CH48 0070 0111 5001 3210 1";
    private static final String AMOUNT = "115.--";
    private static final String CITY = "Thalwil, ";
    private static final String NAME = "Pia Stocker";


    private static final String SRC = "/home/martin/src/piketform-populator/pikett-vorlage.pdf";
    private static final String DEST = "/home/martin/src/piketform-populator/pikett/";


    public static void main(String args[]) throws IOException {

        for (String community : Data.COMMUNITIES.keySet()) {

            create_pdf(community, Data.COMMUNITIES.get(community));
        }
    }

    private static void create_pdf(String name, String target_address) throws IOException {
        String target_file_name = DEST + "/" + "pikett-formular-" + name + ".pdf";
        File file = new File(target_file_name);
        file.getParentFile().mkdirs();

        //Initialize PDF document
        PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC), new PdfWriter(target_file_name));

        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);

        Map<String, PdfFormField> fields = form.getFormFields();
//        for (String s : fields.keySet()) {
//            System.out.println("key = " + s);
//            System.out.println("alt.name = " + fields.get(s).getFieldName());
//        }
        fields.get("Textfeld 1").setValue(target_address);
        fields.get("Textfeld 8").setValue(SENDER);
        fields.get("Textfeld 3").setValue(CITY);
        fields.get("Textfeld 12").setValue(IBAN);
        fields.get("Textfeld 6").setValue(AMOUNT);
        fields.get("Textfeld 7").setValue(AMOUNT);
        fields.get("Textfeld 2").setValue(NAME);
        pdfDoc.close();
        System.out.println(String.format("writing piket form for %s to %s", name, target_file_name));
    }

}
