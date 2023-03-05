package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    // bilgisayarimizin temel dosya yolu user.home
    // /Users/ahmetbulutluoz/Desktop/Thedelta.docx
    //C:\Users\FURKAN\Desktop\TheDelta.docx"
    //C:\Users\Lenovo\Desktop\TheDelta.docx
    // /Users/ahmetbulutluoz/Downloads
    // icinde bulundugumuz projenin temel dosya yolu user.dir
    //    /Users/mahoni/Desktop/seleniumTeam108
    //    /Users/ahmetbulutluoz/IdeaProjects/seleniumTeam108
    //    /Users/mahoni/Desktop/seleniumTeam108/src/test/java/day07_actionsClass_fileTestleri/text.txt
    //   /Users/ahmetbulutluoz/IdeaProjects/seleniumTeam108/src/test/java/day07_actionsClass_fileTestleri/text.txt
    // C:\Users\Zafer\Desktop\gitHubTeam108\com.wisequarter1\src\test\java\day07_fileTests\text
    // C:\Users\sevil\IdeaProjects\seleniumTeam108\src\test\java\day07_actionClass_fileTest\text.txt


    @Test
    public void test01(){

        String dosyaYolu = "/Users/mahoni/Desktop";

        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);

        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */

        dosyaYolu = "/Users/mahoni/Desktop";
        dosyaYolu = System.getProperty("user.home") + "/Desktop/sozlesme.pdf";

        System.out.println(System.getProperty("user.dir"));

    }
}
