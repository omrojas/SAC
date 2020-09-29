import java.io.*;
import java.util.*;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;

public class sac {
    public static void main(String args[]) {

        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Bienvenido al SAC ***");
        System.out.println("--------------------------------------------------------------------------------");

        String line = "";  
        String splitBy = ",";  
 

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                 Menú ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctores  2.Pacientes  3.Citas");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("**Doctores**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("Escoge una opción: \n");
                        System.out.println("1. Mostrar lista de pacientes");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                 try {
                                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SAC\\doctores.csv"), "UTF-8"));  
                                    while ((line = br.readLine()) != null) {  
                                        String[] doctores = line.split(splitBy);    // use comma as separator  
                                        System.out.println("Doctor: [ID: " + doctores[0] + ", Nombre completo: " + doctores[1] + ", Especialidad: " + doctores[2]);
                                    }
                                }   

                                catch (IOException e) {  
                                    e.printStackTrace();  
                                }
                            break;
                            }
                        }
                    System.out.println("\nRetrocede presionando 1 y 0 para regresar al menú principal.");
                    s1 = input.nextInt();
                    }
                break;
                }

                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("**Pacientes**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("Escoge una opción: \n");
                        System.out.println("1. Mostrar lista de pacientes");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                try {
                                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SAC\\pacientes.csv"), "UTF-8"));  
                                    while ((line = br.readLine()) != null) {  
                                        String[] pacientes = line.split(splitBy);    // use comma as separator  
                                        System.out.println("Pacientes: [ID: " + pacientes[0] + ", Nombre completo: " + pacientes[1]);
                                    }
                                }
                                          
                                catch (IOException e) {  
                                    e.printStackTrace();  
                                }
                            break;
                            }                                   
                        }
                    System.out.println("\nRetrocede presionando 1 y 0 para regresar al menú principal.");
                    s2 = input.nextInt();
                    }
                break;
                }
                
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("**Citas**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1){
                            System.out.println("Escoge una opción: \n");
                            System.out.println("1. Lista de citas");
                            c1 = input.nextInt();
                            switch (c1){
                                case 1:{
                                         try {
                                            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SAC\\citas.csv"), "UTF-8"));  
                                                while ((line = br.readLine()) != null) {  
                                                String[] citas = line.split(splitBy);    // use comma as separator  
                                                System.out.println("Citas: [ID: " + citas[0] + ", Fecha y hora de la cita: " + citas[1] + ", Motivo: " + citas[2]);
                                        }
                                     }   

                                        catch (IOException e) {  
                                            e.printStackTrace();  
                                        }
                                    break;
                                    }
                            }
                            System.out.println("\nRetrocede presionando 1 y 0 para regresar al menú principal.");
                            s3 = input.nextInt();
                        }
                        break;
                    }

                default:{
                        System.out.println(" Ingresa una opción valida.");
                    }
            }
            System.out.println("\nPara regresar al menú princal presiona 1");
            status = input.nextInt();
        }
    }
}