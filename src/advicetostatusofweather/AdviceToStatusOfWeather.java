/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advicetostatusofweather;

import java.util.Scanner;
/*
 * Patika dev kapsamındaki java101 dersi koşullu ifadeler hava durumuna göre tavsiye 
 * yapan program
 */
/**
 *
 * @author alimdursun
 */
public class AdviceToStatusOfWeather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sıcaklık;
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen şehrinizdeki hava sıcaklığını girin: ");
        sıcaklık=scanner.nextInt();
        if(sıcaklık>(-30)&&sıcaklık<5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if(sıcaklık>=5 && sıcaklık<15){
            System.out.println("Sinemaya Gidebilirsiniz");
        }else if(sıcaklık>=15 && sıcaklık<25){
            System.out.println("Piknik Yapabilirsiniz");
        }else if(sıcaklık>=25 && sıcaklık<45){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }else{
            System.out.println("Sağlığınız için evde kalmanızı öneririz.");
        }
    }
    
}
