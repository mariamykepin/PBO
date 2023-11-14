/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class faktorial {
    public static void main(String[] args){
        int nilai=1;
        int data=4;
        if(data==0|data==1){
            nilai=1;
        }
        else{
            for(int i=1; i<=data; i++){
                nilai*=1;
            }
        }
        System.out.println(data + " ! = "+ nilai);
    }
}
