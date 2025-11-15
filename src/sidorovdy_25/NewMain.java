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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array25 = new int[10];
        
        
        int col_chet = 0;
        int col_nechet = 0;
        
        System.out.println("Задан массив D[1..10]. Найти количество нечетных элементов");
        System.out.println("Исходный массив: ");
        for (int i25 = 0; i25 < array25.length; i25++) {
            array25[i25]=(int) (Math.random()*200-100);
            System.out.print(array25[i25]+" ");
        }
        System.out.println();
        int sum_pol=0;
        int sum_otr=0;
        
        int pol = 0;
        int otr = 0;
        for (int i = 0; i < array25.length; i++) {
            if (array25[i]>0){
                sum_pol = sum_pol + array25[i];
                pol++;
            }
            if (array25[i]<0){
                sum_otr = sum_otr + array25[i];
                otr++;
            }
            
            if (array25[i] % 2 == 0){
                col_chet++;
            }
           
        }
        int sr_pol = sum_pol / pol;
        int sr_otr = sum_otr / otr;
        
        System.out.println("Количество четных = "+col_chet);
    }
    
}
