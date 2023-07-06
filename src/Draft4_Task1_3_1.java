import java.io.File;

public class Draft4_Task1_3_1 {
    public static void main(String[] args) {
        System.out.println("Задание 4.: \n1.\tСохраните информацию о всех файлах в заданной директории в массив " +
                "FileInformation\n\n\nРешение: ");
        File file = new File("test.txt");
        String fileName = file.getName();
        long size = file.length();

        FileInformation info = new FileInformation();
        info.absolutePath = file.getAbsolutePath();
        info.fileName = file.getName();
        info.size = file.length();

        File file2 = new File("book.txt");
        String absolutePath2 = file2.getAbsolutePath();
        String fileName2 = file2.getName();
        long size2 = file2.length();

        if(info.size>size2) {
            System.out.print("Bigger file: ");
            System.out.println(info.fileName);
            System.out.println("Path: ");
            System.out.println(info.absolutePath);
            System.out.println("Size is: ");
            System.out.println(info.size);
        } else {
            System.out.print("Bigger file: ");
            System.out.println(fileName2);
            System.out.println("Path: ");
            System.out.println(absolutePath2);
            System.out.println("Size is: ");
            System.out.println(size2);

        }
    }
}
