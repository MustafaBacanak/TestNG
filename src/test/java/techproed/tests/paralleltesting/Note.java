package techproed.tests.paralleltesting;

public class Note {

    /*
        1. paralleltesting klasoru olustur
        2. en az 2 adet test sinifi olustur.(biz 3 tane olusturduk)
        3. parallel test icin yeni bir xml dosyasi olustur : paralleltest.xml
        --------------------
        4. Paralel test yapmak icin tek yapilmasi gereken xml dosyasina su kelimeleri eklemek
        *parallel
        *thread-count
        <suite name="All Test Suite" parallel="classes" thread-count="3">
        Bu durumda, bu xml dosyami calistirdigimda, test caselerim parallel bir sekilde ayni anda calisacakdir
     */
}
