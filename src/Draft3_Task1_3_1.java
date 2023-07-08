import java.io.File;
import java.util.Arrays;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft3_Task1_3_1 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tСоздайте классы для описания языков программирования " +
                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
        // Закончил на видео мин 34 25

        // Создаем класс Типизация
        System.out.println("Создаем класс Типизация (Typing).");
        Typing javaTyping = new Typing();
        javaTyping.javaTyping1 = "Жесткая";
        javaTyping.javaTyping2 = "Статическая";
        javaTyping.javaTyping3 = "Динамическая";

        Typing pytonTyping = new Typing();
        pytonTyping.pythonTyping1 = "Динамическая";
        pytonTyping.pythonTyping2 = "Неявная";
        pytonTyping.pythonTyping3 = "Строгая";

        Typing visualBasicTyping = new Typing();
        visualBasicTyping.visualBasicTyping1 = "Явная";
        visualBasicTyping.visualBasicTyping2 = "Неявная";
        visualBasicTyping.visualBasicTyping3 = "Строгая";

        System.out.print("Варианты типизации в Java: " + javaTyping.javaTyping1 + ", " + javaTyping.javaTyping2 +
                ", " + javaTyping.javaTyping3 + "\n" +
                "Варианты типизации в Python: " + pytonTyping.pythonTyping1 + ", " + pytonTyping.pythonTyping2 +
                ", " + pytonTyping.pythonTyping3 + "\n" +
                "Варианты типизации в Visual Basic: " + visualBasicTyping.visualBasicTyping1 + ", " + visualBasicTyping.visualBasicTyping2 +
                ", " + visualBasicTyping.visualBasicTyping3);
        System.out.println("\n"); //  перенос строки

        // Создаем класс Версии
        System.out.println("Создаем класс Версии (Versions).");
        Versions javaVersion = new Versions();
        javaVersion.javaVersion1 = "Java SE 7";
        javaVersion.javaVersion2 = "Java SE 8";
        javaVersion.javaVersion3 = "Java SE 9";

        Versions pythonVersion = new Versions();
        pythonVersion.pythonVersion1 = "Python 2";
        pythonVersion.pythonVersion2 = "Python 3";

        Versions visualBasicVersion = new Versions();
        visualBasicVersion.visualBasicVersion1 = "VBA";
        visualBasicVersion.visualBasicVersion2 = "VBScript";
        visualBasicVersion.visualBasicVersion3 = "Visual Basic .NET";

        System.out.print("Версии Java: " + javaVersion.javaVersion1 + ", " + javaVersion.javaVersion2 +
                ", " + javaVersion.javaVersion3 + "\n" +
                "Версии Python: " + pythonVersion.pythonVersion1 + ", " + pythonVersion.pythonVersion2 + "\n" +
                "Версии Visual Basic: " + visualBasicVersion.visualBasicVersion1 + ", " + visualBasicVersion.visualBasicVersion2 +
                ", " + visualBasicVersion.visualBasicVersion3);
        System.out.println("\n"); //  перенос строки






        // Создаем массив с ключевыми словами (KeyWords).
        System.out.println("Создаем класс для ключевых слов (KeyWords) с переменными и массивом.");
        KeyWords keyWords1 = new KeyWords();
        keyWords1.javaWord1 = "class";
        keyWords1.javaWord2 = "int";
        keyWords1.javaWord3 = "return";

        KeyWords keyWords2 = new KeyWords();
        keyWords2.pythonWord1 = "global";
        keyWords2.pythonWord2 = "pass";
        keyWords2.pythonWord3 = "elif";

        KeyWords keyWords3 = new KeyWords();
        keyWords3.visualBasic1 = "Get";
        keyWords3.visualBasic2 = "Next";
        keyWords3.visualBasic3 = "ParamArray";

        /*System.out.println(keyWords3.visualBasic1 + ", " + keyWords3.visualBasic2 + ", " + keyWords3.visualBasic3);*/

        /*String[] wordsArray = {cat4.javaWord1, cat4.javaWord2, cat4.javaWord3};
        System.out.print("Печатаем массив: " + Arrays.toString(wordsArray));*/

        KeyWords keyWords4 = new KeyWords();
        KeyWords keyWords5 = new KeyWords();
        KeyWords keyWords6 = new KeyWords();
        keyWords4.array = new String[]{keyWords1.javaWord1, keyWords1.javaWord2, keyWords1.javaWord3};
        keyWords5.array = new String[]{keyWords2.pythonWord1, keyWords2.pythonWord2, keyWords2.pythonWord3};
        keyWords6.array = new String[]{keyWords3.visualBasic1, keyWords3.visualBasic2, keyWords3.visualBasic3};
        System.out.println("Печатаем элементы массивов ключевых слов:");
        System.out.print("Ключевые слова для Java: " + Arrays.toString(keyWords4.array) + "\n" +
                         "Ключевые слова для Python: " + Arrays.toString(keyWords5.array) + "\n" +
                         "Ключевые слова для Visual Basic: " + Arrays.toString(keyWords6.array));
        System.out.println(); //  перенос строки

    }
}
////        Конец Примера _ КККККККККККККККК









////        Пример 6 ППППППППППППППППППППППППППППППППППП Работает только массив ключевых слов
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//        // Закончил на видео мин 34 25
//
//
//    // Создаем массив с ключевыми словами (KeyWords).
//        System.out.println("Создаем класс для ключевых слов (KeyWords) с переменными и массивом.");
//        KeyWords keyWords1 = new KeyWords();
//        keyWords1.javaWord1 = "class";
//        keyWords1.javaWord2 = "int";
//        keyWords1.javaWord3 = "return";
//
//        KeyWords keyWords2 = new KeyWords();
//        keyWords2.pythonWord1 = "global";
//        keyWords2.pythonWord2 = "pass";
//        keyWords2.pythonWord3 = "elif";
//
//        KeyWords keyWords3 = new KeyWords();
//        keyWords3.visualBasic1 = "Get";
//        keyWords3.visualBasic2 = "Next";
//        keyWords3.visualBasic3 = "ParamArray";
//
//        /*System.out.println(keyWords3.visualBasic1 + ", " + keyWords3.visualBasic2 + ", " + keyWords3.visualBasic3);*/
//
//        /*String[] wordsArray = {cat4.javaWord1, cat4.javaWord2, cat4.javaWord3};
//        System.out.print("Печатаем массив: " + Arrays.toString(wordsArray));*/
//
//        KeyWords keyWords4 = new KeyWords();
//        KeyWords keyWords5 = new KeyWords();
//        KeyWords keyWords6 = new KeyWords();
//        keyWords4.array = new String[]{keyWords1.javaWord1, keyWords1.javaWord2, keyWords1.javaWord3};
//        keyWords5.array = new String[]{keyWords2.pythonWord1, keyWords2.pythonWord2, keyWords2.pythonWord3};
//        keyWords6.array = new String[]{keyWords3.visualBasic1, keyWords3.visualBasic2, keyWords3.visualBasic3};
//        System.out.println("Печатаем элементы массивов ключевых слов:");
//        System.out.print("Ключевые слова для Java: " + Arrays.toString(keyWords4.array) + "\n" +
//                         "Ключевые слова для Python: " + Arrays.toString(keyWords5.array) + "\n" +
//                         "Ключевые слова для Visual Basic: " + Arrays.toString(keyWords6.array));
//        System.out.println(); //  перенос строки
//
//    }
//}
//////        Конец Примера 6 КККККККККККККККК









////        Пример 5 ППППППППППППППППППППППППППППППППППП
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//        // Закончил на видео мин 34 25
//
////        String name1 = "Barsik";
////        int age1 = 4;
////        String name2 = "Murzik";
////        int age2 = 13;
////        String name3 = "Chernish";
////        int age3 = 1;
//
//        Cat cat1 = new Cat();
//        cat1.name = "Barsik";
//        cat1.age = 4;
//        Cat cat2 = new Cat();
//        cat2.name = "Murzik";
//        cat2.age = 13;
//        Cat cat3 = new Cat();
//        cat3.name = "Chernish";
//        cat3.age = 1;
//
//        System.out.println("Meow! Im  " + cat3.name + ", " +  cat3.age + " years old");
//        System.out.println(); // перенос строки
//
//
//
//
//    // Массив с ключевыми словами
////        String javaWord1 = "javaWord1";
////        String javaWord2 = "javaWord2";
////        String javaWord3 = "javaWord3";
//
//        Cat cat4 = new Cat();
//        cat4.javaWord1 = "javaWord1";
//        cat4.javaWord2 = "javaWord2";
//        cat4.javaWord3 = "javaWord3";
//        Cat cat5 = new Cat();
//        cat5.pythonWord1 = "pythonWord1";
//        cat5.pythonWord2 = "pythonWord1";
//        cat5.pythonWord3 = "pythonWord1";
//
//        System.out.println(cat4.javaWord1 + ", " + cat4.javaWord2 + ", " + cat4.javaWord3 + "\n" + cat5.pythonWord1
//         + ", " + cat5.pythonWord2 + ", " + cat5.pythonWord3);
//
//        String[] wordsArray = {cat4.javaWord1, cat4.javaWord2, cat4.javaWord3};
//        System.out.print("Печатаем массив: " + Arrays.toString(wordsArray));
//
//        Cat cat6 = new Cat();
//        cat6.array2 = new String[]{cat5.pythonWord1, cat5.pythonWord2, cat5.pythonWord3};
//        System.out.println(); //  перенос строки
//        System.out.print("Ещё печатаем массив: " + Arrays.toString(cat6.array2));
//
//    }
//}
//////        Конец Примера 5 КККККККККККККККК











////        Пример 4 ППППППППППППППППППППППППППППППППППП
//public class Draft3_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСоздайте классы для описания языков программирования " +
//                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");
//
////        System.out.println("Создаем класс KeyWords для описания языков.");
////        KeyWords wordsOfProgLanguage = new KeyWords();
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
////        /*KeyWords[] words = new KeyWords[] {"javaWord1", };*/
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
//        System.out.println("Создаем класс KeyWords для описания языков.");
//        KeyWords wordsOfProgLanguage = new KeyWords();
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
//        /*KeyWords[] words = new KeyWords[] {"javaWord1", };*/
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
//        System.out.println("Создаем класс KeyWords для описания языков.");
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








