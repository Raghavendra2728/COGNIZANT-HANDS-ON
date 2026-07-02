
public class FactoryTest{
 public static void main(String[] a){
  new WordFactory().createDocument().open();
  new PdfFactory().createDocument().open();
  new ExcelFactory().createDocument().open();
 }
}
