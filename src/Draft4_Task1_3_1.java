import java.io.File;


//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!!!!!!!!!!!!!!
public class Draft4_Task1_3_1 {
    public static void main(String[] args) {
        System.out.println("Задание 4.: \n1.\tСохраните информацию о всех файлах в заданной директории в массив " +
                "FileInformation\n\nРешение: ");

        File dir = new File("text_files");
        File[] files = dir.listFiles();
        int fifesCount = files.length;
        /*long [] sizes = new long[fifesCount];
        String[] fileNames = new String[fifesCount];
        String[] absolutePaths = new String[fifesCount];*/
        FileInformation[] fileInfos = new FileInformation[fifesCount];

        System.out.println("Сохраняем информацию о файлах в директории text_files в массив fileInfos[] " +
                "и выводим в консоль");
            for (int i = 0; i < fifesCount; i++) {
            File currentFile = files[i];
            FileInformation info = new FileInformation();
            info.absolutePath = currentFile.getAbsolutePath();
            info.fileName = currentFile.getName();
            info.size = currentFile.length();
            fileInfos[i] = info;
            /*System.out.println(fileInfos[i].fileName);*/
        }

        //  Обойдем fileInfos[i] в цикле
        for (int i =0; i < fileInfos.length; i++) {
            /*FileInformation current = fileInfos[i];*/
            System.out.println("fileName" + i + ": " + fileInfos[i].fileName);
            System.out.println("size" + i + ": " + fileInfos[i].size);
            System.out.println("absolutePath" + i + ": " + fileInfos[i].size);

        }
    }
}
//        Конец Примера _ КККККККККККККККК







////        Пример 5 ППППППППППППППППППППППППППППППППППП
//public class Draft4_Task1_3_1 {
//    public static void main(String[] args) {
//        System.out.println("Задание 4.: \n1.\tСохраните информацию о всех файлах в заданной директории в массив " +
//                "FileInformation\n\n\nРешение: ");
//
//        File dir = new File("text_files");
//        File[] files = dir.listFiles();
//        int fifesCount = files.length;
//        long [] sizes = new long[fifesCount];
//        String[] fileNames = new String[fifesCount];
//        String[] absolutePaths = new String[fifesCount];
//
//        for (int i = 0; i < fifesCount; i++) {
//            File currentFile = files[i];
////            FileInformation info = new FileInformation();
////            info.absolutePath = currentFile.getAbsolutePath();
////            info.fileName = currentFile.getName();
////            info.size = currentFile.length();
//            sizes[i] = currentFile.length();
//            fileNames[i] = currentFile.getName();
//            absolutePaths[i] = currentFile.getAbsolutePath();
//
//        }
//    }
//}
////        Конец Примера 5 КККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП
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
//        FileInformation info2 = new FileInformation();
//        info2.absolutePath = file2.getAbsolutePath();
//        info2.fileName = file2.getName();
//        info2.size = file2.length();
//
//        FileInformation biginfo = info.size > info2.size ? info : info2;
//        System.out.print("Bigger file: ");
//            System.out.println(biginfo.fileName);
//            System.out.println("Path: ");
//            System.out.println(biginfo.absolutePath);
//            System.out.println("Size is: ");
//            System.out.println(biginfo.size);
//
//
//    }
//}
////        Конец Примера 4 КККККККККККККККК







////        Пример 3 ППППППППППППППППППППППППППППППППППП
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
//        FileInformation info2 = new FileInformation();
//        info2.absolutePath = file2.getAbsolutePath();
//        info2.fileName = file2.getName();
//        info2.size = file2.length();
//
//        FileInformation biginfo;
//        if(info.size>info2.size) {
//            biginfo = info;
//        } else {
//            biginfo = info2;
//        }
//            System.out.print("Bigger file: ");
//            System.out.println(biginfo.fileName);
//            System.out.println("Path: ");
//            System.out.println(biginfo.absolutePath);
//            System.out.println("Size is: ");
//            System.out.println(biginfo.size);
//
//
//    }
//}
////        Конец Примера 3 КККККККККККККККК







////        Пример 2 ППППППППППППППППППППППППППППППППППП
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
//        FileInformation info2 = new FileInformation();
//        info2.absolutePath = file2.getAbsolutePath();
//        info2.fileName = file2.getName();
//        info2.size = file2.length();
//
//        if(info.size>info2.size) {
//            System.out.print("Bigger file: ");
//            System.out.println(info.fileName);
//            System.out.println("Path: ");
//            System.out.println(info.absolutePath);
//            System.out.println("Size is: ");
//            System.out.println(info.size);
//        } else {
//            System.out.print("Bigger file: ");
//            System.out.println(info2.fileName);
//            System.out.println("Path: ");
//            System.out.println(info2.absolutePath);
//            System.out.println("Size is: ");
//            System.out.println(info2.size);
//
//        }
//    }
//}
////        Конец Примера 2 КККККККККККККККК







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








