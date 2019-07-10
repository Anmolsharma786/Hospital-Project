/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalroomnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anmol
 */
public class HospitalRoomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String patientName = null,doctorName = null;
    int room = 0, patientID =0;
    Scanner t = new Scanner(System.in);
    
    System.out.print("enter the total number of rooms in hospital");
    int totalRoom = t.nextInt();
    for(int i=0;i<totalRoom;i++){
        
    Random y = new Random();
    System.out.println("Please enter the patient name");
    patientName = t.next();
    System.out.println("Please enter the doctor name");
    doctorName = t.next();
    
    System.out.println("Please enter the Patient ID");
    patientID=t.nextInt();
//    System.out.println("Please enter the Room Patient");
//    room = t.nextInt();
    room = y.nextInt(totalRoom);
    Room tt = new Room(patientName,doctorName,room,patientID);   
        }
    Room tt = new Room(patientName,doctorName,room,patientID);
    tt.methodOne();
    
    }
    
}
