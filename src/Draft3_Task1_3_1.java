import java.io.File;
import java.util.Arrays;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft3_Task1_3_1 {
    public static void main(String[] args) {
        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
        // Закончил на видео мин 34 25

//        String name1 = "Barsik";
//        int age1 = 4;
//        String name2 = "Murzik";
//        int age2 = 13;
//        String name3 = "Chernish";
//        int age3 = 1;

        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 4;
        Cat cat2 = new Cat();
        cat2.name = "Murzik";
        cat2.age = 13;
        Cat cat3 = new Cat();
        cat3.name = "Chernish";
        cat3.age = 1;

        System.out.println("Meow! Im  " + cat3.name + ", " +  cat3.age + " years old");
        System.out.println(); // перенос строки




    // Массив с ключевыми словами
//        String javaWord1 = "javaWord1";
//        String javaWord2 = "javaWord2";
//        String javaWord3 = "javaWord3";

        Cat cat4 = new Cat();
        cat4.javaWord1 = "javaWord1";
        cat4.javaWord2 = "javaWord2";
        cat4.javaWord3 = "javaWord3";
        Cat cat5 = new Cat();
        cat5.pythonWord1 = "pythonWord1";
        cat5.pythonWord2 = "pythonWord1";
        cat5.pythonWord3 = "pythonWord1";

        System.out.println(cat4.javaWord1 + ", " + cat4.javaWord2 + ", " + cat4.javaWord3 + "\n" + cat5.pythonWord1
         + ", " + cat5.pythonWord2 + ", " + cat5.pythonWord3);

        String[] wordsArray = {cat4.javaWord1, cat4.javaWord2, cat4.javaWord3};
        System.out.print("Печатаем массив: " + Arrays.toString(wordsArray));

        Cat cat6 = new Cat();
        cat6.array2 = new String[]{cat5.pythonWord1, cat5.pythonWord2, cat5.pythonWord3};
        System.out.println(); //  перенос строки
        System.out.print("Ещё печатаем массив: " + Arrays.toString(cat6.array2));









    }
}
////        Конец Примера _ КККККККККККККККК











////        Пример 4 ППППППППППППППППППППППППППППППППППП
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//
////        System.out.println("Создаем класс WordsOfProgLanguages для описания языков.");
////        WordsOfProgLanguages wordsOfProgLanguage = new WordsOfProgLanguages();
////        wordsOfProgLanguage.javaWord1 = "javaWord1";
////        wordsOfProgLanguage.javaWord2 = "javaWord2";
////        wordsOfProgLanguage.javaWord3 = "javaWord3";
////        wordsOfProgLanguage.pythonWord1 = "pythonWord1";
////        wordsOfProgLanguage.pythonWord2 = "pythonWord2";
////        wordsOfProgLanguage.pythonWord3 = "pythonWord3";
////        wordsOfProgLanguage.javaScriptWord1 = "javaScriptWord1";
////        wordsOfProgLanguage.javaScriptWord2 = "javaScriptWord2";
////        wordsOfProgLanguage.javaScriptWord3 = "javaScriptWord3";
////
////        /*WordsOfProgLanguages[] words = new WordsOfProgLanguages[] {"javaWord1", };*/
//
//    }
//}
//////        Конец Примера 4 КККККККККККККККК











////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//
//        System.out.println("Создаем класс WordsOfProgLanguages для описания языков.");
//        WordsOfProgLanguages wordsOfProgLanguage = new WordsOfProgLanguages();
//        wordsOfProgLanguage.javaWord1 = "javaWord1";
//        wordsOfProgLanguage.javaWord2 = "javaWord2";
//        wordsOfProgLanguage.javaWord3 = "javaWord3";
//        wordsOfProgLanguage.pythonWord1 = "pythonWord1";
//        wordsOfProgLanguage.pythonWord2 = "pythonWord2";
//        wordsOfProgLanguage.pythonWord3 = "pythonWord3";
//        wordsOfProgLanguage.javaScriptWord1 = "javaScriptWord1";
//        wordsOfProgLanguage.javaScriptWord2 = "javaScriptWord2";
//        wordsOfProgLanguage.javaScriptWord3 = "javaScriptWord3";
//
//        /*WordsOfProgLanguages[] words = new WordsOfProgLanguages[] {"javaWord1", };*/
//
//
//    }
//}
//////        Конец Примера 3 КККККККККККККККК






////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//
//        System.out.println("Создаем класс WordsOfProgLanguages для описания языков.");
//
//    }
//}
//////        Конец Примера 2 КККККККККККККККК






////        Пример 1 ППППППППППППППППППППППППППППППППППП Инициализация и с классом и без класса присутствует
//public class Draft4_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСохраните информацию о всех файлах в заданной директории в массив " +
//                "FileInformation\n\n\nРешение: ");
//        File file = new File("test.txt");
//        String fileName = file.getName();
//        long size = file.length();
//
//        FileInformation info = new FileInformation();
//        info.absolutePath = file.getAbsolutePath();
//        info.fileName = file.getName();
//        info.size = file.length();
//
//        File file2 = new File("book.txt");
//        String absolutePath2 = file2.getAbsolutePath();
//        String fileName2 = file2.getName();
//        long size2 = file2.length();
//
//        if(info.size>size2) {
//            System.out.print("Bigger file: ");
//            System.out.println(info.fileName);
//            System.out.println("Path: ");
//            System.out.println(info.absolutePath);
//            System.out.println("Size is: ");
//            System.out.println(info.size);
//        } else {
//            System.out.print("Bigger file: ");
//            System.out.println(fileName2);
//            System.out.println("Path: ");
//            System.out.println(absolutePath2);
//            System.out.println("Size is: ");
//            System.out.println(size2);
//
//        }
//    }
//}
////        Конец Примера 1 КККККККККККККККК








