import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП

/* 4. Научимся получать случайную цитату из сериала в java.*/
/* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ
ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
// Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.
//  Печатаем данный код (рис.6). ( ниже )
public class Draft6_Task1_3_1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Задание : \n1.\tСделайте класс для цитаты из breaking bad: цитата и автор. " +
                "\nСохраните в массив таких классов 10 цитат." +
                "\n\nРешение: ");
        System.out.println("Переходим на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитаты из фильма. " +
                "\n(в действительности при решении была взята другая страница ( https://text-box.ru/quotes/source/breaking-bad ), поскольку предложенная страница " +
                "\nна момент решения не работала.)");
        /*String page = downloadWebPage("https://text-box.ru/quotes/source/breaking-bad");*/
        String page = downloadWebPage("https://breakingbadquotes.xyz/");






        //System.out.println(page);
        /*int quoteStart = page.indexOf("text__line__content__rus text__line--cell");
        int quoteEnd = page.indexOf("text__footer");*/

        System.out.println("Созаем класс QuotesPage, используем его для сохранения цитат и подписей.");

        System.out.println("Цитата:");
        int quoteStart = page.indexOf("<blockquote class=\"main-quote\" id=\"main-quote\">");
        int quoteEnd = page.indexOf("<cite>");
        String quote1 = page.substring(quoteStart + 55, quoteEnd - 6);
        System.out.println(quote1);

        System.out.println("Подпись: ");
        int signatureStart = page.indexOf("<cite>");
        int signatureEnd = page.indexOf("</cite>");
        String signature1 = page.substring(signatureStart + 6, signatureEnd);
        System.out.println(signature1);
    }

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




//        System.out.println("Созаем класс OperatingSystems");
//
//        OperatingSystems operatingSystems3 = new OperatingSystems();
//        operatingSystems3.name = "macOS";
//        operatingSystems3.age = 39;
//
//        System.out.println("Операционная система " + operatingSystems3.name + "имеет возраст "
//                + operatingSystems3.age + " лет.");

    }
}
//        Конец Примера _ КККККККККККККККК







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









