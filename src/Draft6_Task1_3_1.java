import java.io.*;
import java.net.URL;
import java.net.URLConnection;

//        Пример _ ППППППППППППППППППППППППППППППППППП

/* 4. Научимся получать случайную цитату из сериала в java.*/
/* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ
ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
// Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.
//  Печатаем данный код (рис.6). ( ниже )
public class Draft6_Task1_3_1 {

    public static void main(String[] args) throws IOException {
        File myFile = new File("quotes.txt");
        try {

            System.out.println("Задание : \n1.\tСделайте класс для цитаты из breaking bad: цитата и автор. " +
                    "\nСохраните в массив таких классов 10 цитат." +
                    "\n\nРешение: ");
            System.out.println("ПРИМЕЧАНИЕ: К сожалению, взятая в качестве альтернативы для получения случайных цитат, " +
                    "\nстраница не перезагружается при получении следующего запроса от IDE, и выдает цитату, аналогичную " +
                    "\nпредыдущей. Перезагрузка производится только  вручную непосредственно на веб странице.");
            System.out.println("Переходим на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитаты из фильма. " +
                    "\n(в действительности при решении была взята другая страница ( https://text-box.ru/quotes/source/breaking-bad ), поскольку предложенная страница " +
                    "\nна момент обращения к ней не работала.)");
            System.out.println();  // Это перенос строки
            String page = downloadWebPage("https://breakingbadquotes.xyz/");
            int quoteStart = page.indexOf("<blockquote class=\"main-quote\" id=\"main-quote\">");
            int quoteEnd = page.indexOf("<cite>");
            int signatureStart = page.indexOf("<cite>");
            int signatureEnd = page.indexOf("</cite>");

            System.out.println("Созаем класс QuotesPage с полями 'Цитата' и 'Подпись', используем его для сохранения цитат и подписей.");
            System.out.println("Выведено в консоль для примера две цитаты, остальные сохранены в файле 'quotes.txt' в корневом каталоге проекта.");

            QuotesPage quotesPage1 = new QuotesPage();
            quotesPage1.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage1.signature = page.substring(signatureStart + 6, signatureEnd);
            System.out.println("Цитата1: \n" + quotesPage1.quote);
            System.out.println("Подпись1: \n" + quotesPage1.signature + "\n");
            PrintWriter writer1 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer1.println("Цитата1: \n" + quotesPage1.quote + "\n" + "Подпись1: \n" + quotesPage1.signature + "\n");
            writer1.flush();
            writer1.close();

            QuotesPage quotesPage2 = new QuotesPage();
            quotesPage2.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage2.signature = page.substring(signatureStart + 6, signatureEnd);
            System.out.println("Цитата2: \n" + quotesPage2.quote);
            System.out.println("Подпись2: \n" + quotesPage2.signature + "\n");
            PrintWriter writer2 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer2.println("Цитата2: \n" + quotesPage2.quote + "\n" + "Подпись2: \n" + quotesPage2.signature + "\n");
            writer2.flush();
            writer2.close();

            QuotesPage quotesPage3 = new QuotesPage();
            quotesPage3.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage3.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer3 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer3.println("Цитата3: \n" + quotesPage3.quote + "\n" + "Подпись3: \n" + quotesPage3.signature + "\n");
            writer3.flush();
            writer3.close();

            QuotesPage quotesPage4 = new QuotesPage();
            quotesPage4.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage4.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer4 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer4.println("Цитата4: \n" + quotesPage4.quote + "\n" + "Подпись4: \n" + quotesPage4.signature + "\n");
            writer4.flush();
            writer4.close();

            QuotesPage quotesPage5 = new QuotesPage();
            quotesPage5.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage5.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer5 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer5.println("Цитата5: \n" + quotesPage5.quote + "\n" + "Подпись5: \n" + quotesPage5.signature + "\n");
            writer5.flush();
            writer5.close();

            QuotesPage quotesPage6 = new QuotesPage();
            quotesPage6.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage6.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer6 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer6.println("Цитата6: \n" + quotesPage6.quote + "\n" + "Подпись6: \n" + quotesPage6.signature + "\n");
            writer6.flush();
            writer6.close();

            QuotesPage quotesPage7 = new QuotesPage();
            quotesPage7.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage7.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer7 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer7.println("Цитата7: \n" + quotesPage7.quote + "\n" + "Подпись7: \n" + quotesPage7.signature + "\n");
            writer7.flush();
            writer7.close();

            QuotesPage quotesPage8 = new QuotesPage();
            quotesPage8.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage8.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer8 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer8.println("Цитата8: \n" + quotesPage8.quote + "\n" + "Подпись8: \n" + quotesPage8.signature + "\n");
            writer8.flush();
            writer8.close();

            QuotesPage quotesPage9 = new QuotesPage();
            quotesPage9.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage9.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer9 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer9.println("Цитата9: \n" + quotesPage9.quote + "\n" + "Подпись9: \n" + quotesPage9.signature + "\n");
            writer9.flush();
            writer9.close();

            QuotesPage quotesPage10 = new QuotesPage();
            quotesPage10.quote = page.substring(quoteStart + 55, quoteEnd - 6);
            quotesPage10.signature = page.substring(signatureStart + 6, signatureEnd);
            PrintWriter writer10 =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer10.println("Цитата10: \n" + quotesPage10.quote + "\n" + "Подпись10: \n" + quotesPage10.signature + "\n");
            writer10.flush();
            writer10.close();

            // сюда всавлять catch
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    /*}*/
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
//        Конец Примера _ КККККККККККККККК


////        Пример 3 ППППППППППППППППППППППППППППППППППП
//
///* 4. Научимся получать случайную цитату из сериала в java.*/
///* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ
//ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
//// Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.
////  Печатаем данный код (рис.6). ( ниже )
//public class Draft6_Task1_3_1 {
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание : \n1.\tСделайте класс для цитаты из breaking bad: цитата и автор. " +
//                "\nСохраните в массив таких классов 10 цитат." +
//                "\n\nРешение: ");
//        System.out.println("Переходим на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитаты из фильма. " +
//                "\n(в действительности при решении была взята другая страница ( https://text-box.ru/quotes/source/breaking-bad ), поскольку предложенная страница " +
//                "\nна момент обращения к ней не работала.)");
//        System.out.println();  // Это перенос строки
//
//        System.out.println("Созаем класс QuotesPage с полями 'Страница', 'Цитата', 'Подпись', используем его для сохранения цитат и подписей.");
//
//        QuotesPage quotesPage1 = new QuotesPage();
//        quotesPage1.page = downloadWebPage("https://breakingbadquotes.xyz/");
//        int quoteStart = quotesPage1.page.indexOf("<blockquote class=\"main-quote\" id=\"main-quote\">");
//        int quoteEnd = quotesPage1.page.indexOf("<cite>");
//        quotesPage1.quote = quotesPage1.page.substring(quoteStart + 55, quoteEnd - 6);
//        int signatureStart = quotesPage1.page.indexOf("<cite>");
//        int signatureEnd = quotesPage1.page.indexOf("</cite>");
//        quotesPage1.signature = quotesPage1.page.substring(signatureStart + 6, signatureEnd);
//        System.out.println("Цитата1: \n" + quotesPage1.quote);
//        System.out.println(Подпись11: \n" + quotesPage1.signature + "\n");
//
//    }
//
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//
//    }
//}
////        Конец Примера 3 КККККККККККККККК


////        Пример 2 ППППППППППППППППППППППППППППППППППП
//
///* 4. Научимся получать случайную цитату из сериала в java.*/
///* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ
//ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
//// Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.
////  Печатаем данный код (рис.6). ( ниже )
//public class Draft6_Task1_3_1 {
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание : \n1.\tСделайте класс для цитаты из breaking bad: цитата и автор. " +
//                "\nСохраните в массив таких классов 10 цитат." +
//                "\n\nРешение: ");
//        System.out.println("Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.\n" +
//                "Печатаем данный код (рис.6). ( ниже ) ( взята другая страница, поскольку предложенная в тот момент не работала.");
//        String page = downloadWebPage("https://text-box.ru/quotes/source/breaking-bad");
//        //System.out.println(page);
//        int quoteStart = page.indexOf("text__line__content__rus text__line--cell");
//        int quoteEnd = page.indexOf("text__footer");
//        System.out.println(page.substring(quoteStart + 43, quoteEnd - 82));
//
//    }
//
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//
//
//
//
////        System.out.println("Созаем класс OperatingSystems");
////
////        OperatingSystems operatingSystems3 = new OperatingSystems();
////        operatingSystems3.name = "macOS";
////        operatingSystems3.age = 39;
////
////        System.out.println("Операционная система " + operatingSystems3.name + "имеет возраст "
////                + operatingSystems3.age + " лет.");
//
//    }
//}
////        Конец Примера 2 КККККККККККККККК


//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//  public class Draft6_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tСделайте класс для цитаты из breaking bad: цитата и автор. " +
//                "\nСохраните в массив таких классов 10 цитат." +
//                "\n\nРешение: ");
//
//        System.out.println("Созаем класс OperatingSystems");
//
//        OperatingSystems operatingSystems3 = new OperatingSystems();
//        operatingSystems3.name = "macOS";
//        operatingSystems3.age = 39;
//
//        System.out.println("Операционная система " + operatingSystems3.name + "имеет возраст "
//                + operatingSystems3.age + " лет.");
//
//    }
//}
////        Конец Примера 1 КККККККККККККККК









