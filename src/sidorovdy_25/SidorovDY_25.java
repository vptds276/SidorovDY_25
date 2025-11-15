/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidorovdy_25;

/**
 *
 * @author директор
 */
public class SidorovDY_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array25 = new int[10];
        int[] a = new int[5];
        int[] b = new int[5];

        int col_chet25 = 0;
        int col_nechet25 = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("24. Задан одномерный массив А[1..20]. Просуммировать все\n"
                + "неотрицательные элементы, стоящие на четных местах.");
        System.out.println("Задан массив D[1..10]. Сформировать два массива, включая в первый\n"
                + "элементы исходного массива с четными индексами, а во второй - с нечетными\n"
                + "индексами.");

        System.out.println("Исходный массив: ");
        for (int i25 = 0; i25 < array25.length; i25++) {
            array25[i25] = (int) (Math.random() * 200 - 100);
            System.out.print(array25[i25] + " ");
        }
        System.out.println("");
        //Поиск минимального числа
        for (int i25 = 0; i25 < array25.length; i25++) {

            if (array25[i25] < min) {

                min = array25[i25];
            }
        }
        System.out.println("Минимальный элемент" + max);
        //формирование массивов по заданию
        for (int i25 = 0; i25 < array25.length; i25++) {
            //Проверка на четность
            if (i25 % 2 == 0) {

                a[col_chet25] = array25[i25];
                col_chet25++;

            } else {
                b[col_nechet25] = array25[i25];
                col_nechet25++;
            }
        }

        System.out.println("Массив четных индексов: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

            //System.out.print(b[i]+" ");
        }
        System.out.println("");
        System.out.println("Массив нечетных индексов: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");

            //System.out.print(b[i]+" ");
        }
        System.out.println("");
    }

}
