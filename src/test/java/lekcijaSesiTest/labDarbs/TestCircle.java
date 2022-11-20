package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Circle;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCircle {

    @Test
    public void testRekinatLaukumu() {
        System.out.println("Tests pārbauda, vai pareizi tiek aprēķināts riņķa laukums");
        Circle mansRinkis = new Circle(7.7);

        //expectedResult - sagaidāmais rezultāts
        //actual result - faktiskais rezultāts

        Double expectedArea = 186.27;
        Double actualArea = mansRinkis.rekinaRinkaLaukumu();

        //assert, assertion - pārbaude

        Assert.assertEquals(actualArea, expectedArea);
    }


        //testi riņķa līnijas garuma aprēķiniem - ar daļskaitli, ar veselu skaitli, ar nulli, ar mīnusu, ar lielu skaitli

    @BeforeTest
    public void pirmsTesta(){ //izpildās vienu reizi visas testēšanas ietvaros (pat ja testē vairākas metodes
        System.out.println("Šī ir before testa anotācija");
    }

    @AfterTest
    public void pectesta(){
        System.out.println("Šī ir after testa anotācija");
    }

    @BeforeMethod
    public void sagatavosanas(){ // izpildās pirms katras metodes
       System.out.println("Šī metode tiek izpildīta pirms katra testa");
   }

   @AfterMethod
   public void pecDarbibas(){
       System.out.println("Šī metode tiek izpildīta pēc katra testa");
   }
    @Test
    public void testRekinaRinkaLinijasGarumuDalskaitlis() {
        Circle jaunsRinkis = new Circle(5.5);
        Double expectedLength = 34.54;
        Double actualLength = jaunsRinkis.rekinaRinkaLinijasGarumu();
        Assert.assertEquals(actualLength,expectedLength);
    }
    @Test
    public void testRekinaRinkaLinijasGarumuVesels() {
        Circle jaunsRinkis = new Circle(7);
        Double expectedLength = 77.9;
        Double actualLength = jaunsRinkis.rekinaRinkaLinijasGarumu();
        Assert.assertEquals(actualLength,expectedLength);
    }
    @Test
    public void testRekinaRinkaLinijasGarumuNulle() {
        Circle jaunsRinkis = new Circle(0);
        Double expectedLength = 0.0;
        Double actualLength = jaunsRinkis.rekinaRinkaLinijasGarumu();
        Assert.assertEquals(actualLength,expectedLength);
    }
    @Test
    public void testRekinaRinkaLinijasGarumuNegativs() {
        Circle jaunsRinkis = new Circle(-9);
        Double expectedLength = null;
        Double actualLength = jaunsRinkis.rekinaRinkaLinijasGarumu();
        Assert.assertEquals(actualLength,expectedLength);
    }

    //lai nerakstītu atkārtotus testus ar citu vērtību, var uztaisīt metodi:
    private void calculateArea(Double radius, Double sagaidamaisLaukums){
        System.out.println("Tests pārbauda, vai pareizi tiek aprēķināts riņķa laukums");
        Circle mansRinkis = new Circle (radius);
        Double actualArea = mansRinkis.rekinaRinkaLaukumu();
        Assert.assertEquals(actualArea, sagaidamaisLaukums);
    }
    //private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
    //        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
    //        Rinkis mansRinkis = new Rinkis(radiuss);
    //        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums)}
}
