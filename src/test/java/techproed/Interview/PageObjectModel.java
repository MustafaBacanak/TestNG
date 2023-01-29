package techproed.Interview;

public class PageObjectModel {

    /*

    Page Object Model'a dair şuraya bi kaç not bırakayım özet mahiyetinde belki birilerinin işine yarar.

    Aklınıza gelmesi gerekenleri kendi perspektifimden yorumlayım ister alır kullanırsınız ister silersiniz gider :D

    Tabi bu konulardan bahsederken gömülü method ve classlarımızdan değil direk page object model mantığından bahsetcem.

        - Her şeyden önce verilen site manuel test ile sayfa geçişlerine dikkat edilerek özenli bir şekilde
          test edilir. Sitede geçiş yapılan tüm sayfalar belirlenir.
          Peki bu geçiş yapılan sayfalar nedir ?  İşte Page Object Model'in esas mantığı burası tabi bence :)
          Bu geçiş sayfalarını şöyle açıklayabilirim. Misal Amazon için konuşalım. Siteye ilk gittiğimizde bizi Anasayfa
          karşılar. Kendi örneklerimle anlatacak olursam bu HOME PAGE'dir. Sonra Anasayfadan login butonuna yönlenirsiniz.
          İşte o yönlenilen sayfa LOGIN PAGE'dir. Daha sonra Tekrar Anasayfaya döner ve misal bi ürün seçersiniz.
          İşte o ürünü belirleyip üzerine tıkladığınızda yeni yönlendirme olur ve sizi ürünün içeriğine götürür. O sayfa
          PRODUCT(URUN) PAGE'dir. Misal olarak ürünü sepete eklersiniz,ve ekleme yaptıktan sonra sepete gider ürüne işlem
          yapmak istersiniz. İşte o gittiğimiz sayfa BASKET PAGE'dir. Tabi isimler tamamen benim uydurmam şu anda siz
          istediğiniz gibi olusturabilirsiniz :) Daha sonra misal olarak ürünü almaktan vazgeçiniz, ürünü sildiniz.
          ve anasayfaya yönlendiniz. İşlem yapılacak page tekrar HOME PAGE olur ve işlemlerinize o sayfa üzerinden devam edersiniz.
          Sonra çıkış yapmak içn gerekli locate'leri alıp çıkış yaptınız ve çıkışı kontrol edeceksiniz. İşte burası LOGOUT PAGE.
          Artık gerekli tüm işlemler bu sefer LOGOUT PAGE clasınnda yapılır. Yani yapacağınız işlem hangi sayfayı ilgilendiriyorsa
          aşağıda belirteceğimiz işlem sırasını o işlemin gerçekleştiği "X PAGE"den yönlendirerek yapacaksınız.
          Class aşamasını bu şekilde özetleyebilirim. Her ne kadar özet gibi olmamış olsada :D

        -  Genel mantık bundan ibaret olsa da dikkat edilmesi ve alışkanlık haline gelmesi gereken durumlarda var şimdi
           onlardan bahsedicem. Şimdi yukarıda manuel test ile sayfalarımızı belirledik ve page package'mzda bunları hazırladık.
           Daha sonra bu pagelerimizn her birine her şeyden önce Constructor'larımızı oluşturuyoruz.
           Olusturduğumuz const'larla driver'ımızı getiriyoruz.Bu olmazsa olmazımız. Çünkü inheritance bağı kullanmıcaz burada.
           Onun yerine obje olusturup obje üzerinden yapacağız tüm işlerimizi.
           Const. olusturup driverımızı getirdikten sonra yapımız hemen hemen hazır demektir. Bundan sonrası tamamen içerisini
           doğru şekilde doldurmaktan ibaret. Oluşturduğumuz sayfalarda bize verilen case'lere ve öğretilen methodlara göre
           locatelerimizi peş peşe alıp orada depoluyoruz. Herhangi bir işlem yapmıyoruz. Sadece locate depoluyoruz orada.
           ( Tabi bu şimdilik böyle :) )
           Muhtemelen daha sonra oralarda methodlar olusturup, methodlar içerisinde gerekli işlemleri yapıp, locate yerine
           direk methodlarımızı çağıracağız. "Muhtemelen" dediğimi lütfen göz ardı etmeyin bu bilgi hocanın teyitine muhtaçtır :)

         - Pages package'ndan çıkıp Test package'ı içerisine geliyor ve Test Clasımızı olusturuyoruz. Bu olustrduğumuz test clasında
           ilk yapmamız gereken şey ** Buraya Dikkat ** classda her şeyden öcne, açtığımız tüm pagelerden tek tek obje olusturuyoruz.
           Cünkü yukardada belirttiğimz gibi inheritance bağı kurmayacağımız için objeler üzerinden o classlara,orada aldığımız
           locatelere ya da olustrduğumuz methodlara ulaşacağız ve testimiz için gerekli her şeyi buralardan çekeceğiz.Tabi bu objeler
           aşağıda olusturacağımız @Test methodu içerisinde de olusturulabilir ama kullanım kolaylığı açısından bence böylesi daha makul.
           Daha sonra @Test methodumuzu olusturup bize verilen case içeriğine göre olusturuduğumuz class objelerinin yardımıyla method
           ve locatelerimizi kullanarak case'imizi Junitte öğrendiğimiz seleniumu kullanarak tamamlıyoruz.

         - Bu yapıyı kurarken dinamik ve kolay olması açısından bize gösterilen  config-properties, (Henüz olustrmasakda) Reusable Page
           gibi kolaylık sağlayan bir kaç Class daha kullanacağız ama ana mantığı anlatmak adına şimdilik bu kadar yeterli. Çünkü
           bahsettiğim page'lerde yer alan method ve yardımcı olabilecek her şeyi diğer page'lerimizde de method olustururken ya da
           test yaparken kullanacağız.

         - Buraya kadar anlaşıldıysa bundan sonrası 3 - 5 pratikle çok daha kolay ve anlaşılır olacaktır hiiiç merak etmeyin:D
           Size bir öğrenci bakış açısıyla bu konuyu kendimce açıklamaya çalıştım. Tabi ki bu bilgiler benim bilgim dahilindedir.
           Bunun teyitini kendi araştırmalarınızla yapmalısınız. Her ne kadar kendim bu yolla hiçbir sıkıntı yaşamasamda sonuçta
           bende sadece bir kursiyerim ve hatalarım olabilir Hepinize başarılar dilerim :)


     */
}
