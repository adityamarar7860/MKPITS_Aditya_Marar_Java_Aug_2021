/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TryCatchEx4 {
    public static void main(String[] args) {
        try{
            int a=50/0;
        }catch(Exception e){
            System.out.println("cant div by zero");
        }
        
    }
}