public class Array {
    public static void main(String[] args) {
        int number = 10;
        /*char charter = 'a';
        String s = "Hello";

        // КАК СОЗДАТЬ STRING ПО ДРУГОМУ, ЧЕРЕЗ NEW, ТО ЖЕ САМОЕ, ЧТО И ПРЕДЫДУЩАЯ СТРОКА
        String s1 = new String("Hello");*/

        int[] numbers = new int[5];
        // Далее инициализаци , видео мин 06 16
        /*System.out.println(numbers[0]);*/
        // Цикл for для инициализации массива , видео мин 08 55
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        String[] words = {"word1", "word2", "word3"};
        String[] words2 = new String[] {"word4", "word25", "word6"};

        String[] array = {"javaWord1", "javaWord2", "javaWord3"};


    }
}
