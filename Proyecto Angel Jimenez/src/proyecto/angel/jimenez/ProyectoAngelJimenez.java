/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.angel.jimenez;
import java.util.Scanner;
/**
 */
public class ProyectoAngelJimenez {
   
     
public static void main(String[] args) {
String Sal = null;
do{ 
/* Variables */
int Salida = 0, Op = 0, A = 0, Am = 0,TT =0, TC = 0, TCT = 0,TA = 0, TAE = 0, TAI = 0, TAL = 0, Ag = 0;
double P = 0, Pt = 0, Pa = 0, Pae = 0, Pai = 0, Pal = 0, total = 0;
String N = null, Nt = null, Nc = null, Nct=null, Na = null, Nae = null, Nai=null, Nal =null;

/*Scanners*/
Scanner SA = new Scanner(System.in);
Scanner OP = new Scanner(System.in);
Scanner AM = new Scanner(System.in);
Scanner Amenidad = new Scanner(System.in);
Scanner TipoT = new Scanner(System.in);
Scanner TipoC = new Scanner(System.in);
Scanner TipoCT = new Scanner(System.in);
Scanner TipoA = new Scanner(System.in);
Scanner TipoAE = new Scanner(System.in);
Scanner TipoAI = new Scanner(System.in);
Scanner TipoAL = new Scanner(System.in);
Scanner Agrega = new Scanner(System.in);
Scanner SalidaP = new Scanner (System.in);
do{
do{
/* Menú Principal */
      System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
      System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "           --Menú Principal--           "+ "\n");
      System.out.print("\n" +"Escriba el numero de la opción que desea realizar: "+"\n"+"1.Selección de automoviles"+"\n"+"2.Salir"+ "\n");  
         Salida = SA.nextInt();
       
       if (Salida == 1){
/* Menú Selección de gama */
            System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
              System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "           --Selección de Automovil--           "+ "\n");
              System.out.print("\n" +"1.Sedán económico"+ "\n" +"2.Sedán"+ "\n" +"3.Deportivo"+ "\n" +"4.Híbrido"+ "\n" +"5.Coupe"+ "\n" +"6.Coupe Deportivo"+ "\n" +"7.Compacto"+ "\n" +"8.Hatchback"+ "\n" +"9.Económico versión Rally"+ "\n" +"10.Regresar");
              System.out.print("\n" +"Escriba el numero de la opción que desea seleccionar: "+"\n");
               Op = OP.nextInt();
               
           if (Op == 1){
            N = "Sedán económico";
            P = 18940.00;
            }
           
           if (Op == 2){
            N = "Sedán";
            P = 23570.00;
            }
           
            if (Op == 3){
            N = "Deportivo";
            P = 24100.00;
            }
            
            if (Op == 4){
            N = "Híbrido";
            P = 25100.00;
            }
            
            if (Op == 5){
            N = "Coupe";
            P = 19350.00;
            }
            
            if (Op == 6){
            N = "Coupe Deportivo";
            P = 24100.00;
            } 
            
            if (Op == 7){
            N = "Compacto";
            P = 16190.00;
            } 
            
            if (Op == 8){
            N = "Hatchback";
            P = 20150.00;
            } 
            
           if (Op == 9){
            N = "Económico Versión Rally";
            P = 34700.00;
            }           
        } 
      
       if (Salida == 2){
/* Salida del Programa */
                System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Gracias por utilizar nuestra aplicación");
                 System.exit(0);
    }
        
       if (Salida >=  2){
/* Menú numero fuera de rango */
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");   
                  System.out.print("\n"+"Solo existen 2 opciones disponibles"+"\n");
      }
       
} while (Salida >=  2 || Op == 10);
/* Menú numero fuera de rango */
    System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Ha seleccionado la gama: "+ N +"\n");
                  System.out.print("\n" +"¿Desea agregar amenidades?" +"\n" +"1.SI"+"\n" +"2.NO"+"\n");    
            A = AM.nextInt();
            


/* Menú Amenidades */
       if (A == 1){
do {
do {
    System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección de Amenidades--           "+ "\n");
                  System.out.print("\n" +"Ha seleccionado la gama: "+ N +"\n"+ "Tipos de Amenidades: "+"\n");
                  System.out.print("\n" +"1.-Tipo de transmisión"+"\n"+ "2.-Color de pintura exterior"+"\n"+"3.-Color de Tapicería"+"\n"+"4.-Aros"+"\n"+"5.-Accesorios exteriores"+"\n"+"6.-Accesorios Interiores"+"\n"+"7.-Accesorios Electronicos"+"\n"+"8.-Regresar al menú Principal"+"\n");
             Am = Amenidad.nextInt();
             
         switch (Am)
             {
             
             case 1: 
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                 System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Tipo de Transmisión--           "+ "\n");
                 System.out.print("\n" +"1.-Manual                        0.00"+ "\n" +"2.-CVT                         800.00"+ "\n"+"3.-Manual con Turbo               0.00"+ "\n"+"4.-CVT con Turbo               800.00"+ "\n"+"5.-Regresar a selección de amenidades" + "\n");
                  TT = TipoT.nextInt();
                  
                 if (TT == 1){
                     Nt = "Manual";
                     Pt = 0.00;
                 }
                 
                 if (TT == 2){
                     Nt = "CVT";
                     Pt = 800.00;
                 }
              
                 if (TT == 3){
                     Nt = "Manual con Turbo";
                     Pt = 0.00;
                 }
                
                 if (TT == 4){
                     Nt = "CVT con Turbo";
                     Pt = 800.00;
                 }
                 
                 if (TT > 5){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;
             
             case 2:    
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                 System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Color de pintura exterior--           "+ "\n");
                 System.out.print("\n" +"1.-Cosmic Blue               0.00"+ "\n" +"2.-Burgundy Night               0.00"+ "\n"+"3.-Rallye Red               0.00"+ "\n"+"4.-Crystal Black               0.00"+ "\n"+"5.-Modern Steel               0.00"+ "\n"+"6.-Taffeta White               0.00"+ "\n"+"7.-Energy Green               0.00"+ "\n"+"8.-Kona Coffee               0.00"+ "\n"+"9.-Orange Fury               0.00"+ "\n"+"10.-Helios Yellow               0.00"+ "\n"+"11.-Sonic Gray               0.00"+ "\n"+"12.-Polished Metal               0.00"+ "\n"+"13.-Regresar a selección de amenidades"+ "\n");
                  TC = TipoC.nextInt(); 
                 
                 if (TC == 1){
                     Nc = "Cosmic Blue                    0.00";
                 }
                 
                 if (TC == 2){
                     Nc = "Burgundy Night                    0.00";
                 }
                 
                 if (TC == 3){
                     Nc = "Rallye Red                    0.00";
                 }
                 
                 if (TC == 4){
                     Nc = "Crystal Black                    0.00";
                 } 
                 
                 if (TC == 5){
                     Nc = "Modern Steel                    0.00";
                 }
                 
                 if (TC == 6){
                     Nc = "Taffeta White                    0.00";
                 }
                
                 if (TC == 7){
                     Nc = "Energy Green                    0.00";
                 }
                 
                 if (TC == 8){
                     Nc = "Kona Coffee                    0.00";
                 }
                 
                 if (TC == 9){
                     Nc = "Orange Fury                    0.00";
                 }
                 
                 if (TC == 10){
                     Nc = "Helios Yellow                    0.00";
                 }
                 
                 if (TC == 11){
                     Nc = "Sonic Gray                    0.00";
                 }
                 
                 if (TC == 12){
                     Nc = "Polished Metal                    0.00";
                 }
                 
                 if (TC > 13){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;
                 
             case 3:
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Color de Tapicería--           "+ "\n");  
                  System.out.print("\n" +"1.-Gray Cloth           0.00"+"\n"+"2.-Black Cloth           0.00" + "\n"+ "3.-Black/Gray Cloth           0.00"+ "\n"+"4.-Red/Black Suede Effect-Fabric           0.00"+"\n"+"5.-Regresar a selección de amenidades"+"\n");
                 TCT = TipoCT.nextInt();
                
                 if (TCT == 1){
                     Nct = "Gray Cloth           0.00";
                 }
                 
                 if (TCT == 2){
                     Nct = "Black Cloth           0.00";
                 }
                 
                 if (TCT == 3){
                     Nct = "Black/Gray Cloth           0.00";
                 }
                 
                 if (TCT == 4){
                     Nct = "Red/Black Suede Effect-Fabric           0.00";
                 }
                 
                 if (TCT > 5){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;
           
             case 4:
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección tipo de Aros--           "+ "\n");   
                  System.out.print("\n" +"1.-15´           0.00"+"\n"+"2.-16´           0.00" + "\n"+ "3.-17´           1,688.00"+ "\n"+"4.-18´           1,700.00"+"\n"+"5.-19´           3,011.00"+"\n"+"6.-Regresar a selección de amenidades"+"\n");
                  TA = TipoA.nextInt();
                  
                 if (TA == 1){
                     Na = "15´           0.00";
                     Pa = 0.00;
                 }
                 
                 if (TA == 2){
                     Na = "16´           0.00";
                     Pa = 0.00;
                 }
                 
                 if (TA == 3){
                     Na = "17´           1,688.00";
                     Pa = 1688.00;
                 }
                  
                 if (TA == 4){
                     Na = "18´           1,700.00";
                     Pa = 1700.00;
                 } 
                  
                 if (TA == 5){
                     Na = "19´           3,011.00";
                     Pa = 3011.00;
                 }   
                 
                 if (TA > 6){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break; 
           
             case 5:
                  System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Accesorios Exteriores--           "+ "\n");   
                  System.out.print("\n" 
                          + "1.-Body Side Molding                  217.00" + "\n" 
                          + "2.-Car Cover                          230.00" + "\n" 
                          + "3.-Decklid Spoiler                    299.99" + "\n"
                          + "4.-Door Edge Film                      42.00" + "\n"
                          + "5.-Door Edge Guards                    84.00" + "\n"
                          + "6.-Door Trim Chrome                   285.00" + "\n"
                          + "7.-Door Visor                         185.00" + "\n"
                          + "8.-Front Fender Emblems                50.00" + "\n"
                          + "9.-Rear Bumper Applique                70.00" + "\n"
                          + "10.-Fog Lights                        325.00" + "\n"
                          + "11.-Nose Mascs                        158.00" + "\n"
                          + "12.-Moonrof Visor                     138.00" + "\n"
                          + "13.-Splash Guard Set                  104.00" + "\n"
                          + "14.-Dust Cover                        350.00" + "\n"
                          + "15.-Door Mirror Cover - Carbon fiber  520.00" + "\n"
                          + "16.-Regresar a selección de amenidades"
                          + "\n");
                 TAE = TipoAE.nextInt();
                 
                 if (TAE == 1){
                     Nae = "Body Side Molding                  217.00";
                     Pae = 217.00;
                 }
                 
                 if (TAE == 2){
                     Nae = "Car Cover                          230.00";
                     Pae = 230.00;
                 }
                 
                 if (TAE == 3){
                     Nae = "Decklid Spoiler                    299.99";
                     Pae = 299.99;
                 }
                 
                 if (TAE == 4){
                     Nae = "Door Edge Film                      42.00";
                     Pae = 42.00;
                 }
                 
                 if (TAE == 5){
                     Nae = "Door Edge Guards                    84.00";
                     Pae = 84.00;
                 }
                 
                 if (TAE == 6){
                     Nae = "Door Trim Chrome                   285.00";
                     Pae = 285.00;
                 }
                 
                 if (TAE == 7){
                     Nae = "Door Visor                         185.00";
                     Pae = 185.00;
                 }
                 
                 if (TAE == 8){
                     Nae = "Front Fender Emblems                50.00";
                     Pae = 50.00;
                 }
                 
                 if (TAE == 9){
                     Nae = "Rear Bumper Applique                70.00";
                     Pae = 70.00;
                 }
                 
                 if (TAE == 10){
                     Nae = "Fog Lights                        325.00";
                     Pae = 325.00;
                 }
                
                 if (TAE == 11){
                     Nae = "Nose Mascs                        158.00";
                     Pae = 158.00;
                 }
                 
                 if (TAE == 12){
                     Nae = "Moonrof Visor                     138.00";
                     Pae = 138.00;
                 }
                 
                 if (TAE == 13){
                     Nae = "Splash Guard Set                  104.00";
                     Pae = 104.00;
                 }
                 
                  if (TAE == 14){
                     Nae = "Dust Cover                        350.00";
                     Pae = 350.00;
                 }
                  
                 if (TAE == 15){
                     Nae = "Door Mirror Cover - Carbon fiber  520.00";
                     Pae = 520.00;
                 }
                 
                 if (TAE > 16){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;      
                 
             case 6:
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Accesorios Interiores--           "+ "\n"); 
                  System.out.print("\n" 
                          + "1.-All-Seasons Floor Mats                  142.00" + "\n" 
                          + "2.-Automatic-Dimming Mirror                219.00" + "\n" 
                          + "3.-Cargo Hook                               12.00" + "\n"
                          + "4.-Cargo Net                                49.00" + "\n"
                          + "5.-Console Illumination                    250.00" + "\n"
                          + "6.-Cargo Organizer                          87.00" + "\n"
                          + "7.-Door Panel Protector                    149.00" + "\n"
                          + "8.-Armrest Compartiment                    337.00" + "\n"
                          + "9.-Door Sill Trim-Illuminated              290.00" + "\n"
                          + "10.-Cargo Cover                            166.00" + "\n"
                          + "11.-Cargo Liner                            187.00" + "\n"
                          + "12.-Regresa a selección de amenidades"
                          +  "\n");
                  
                  TAI = TipoAI.nextInt();
                  
                 if (TAI == 1){
                     Nai = "All-Seasons Floor Mats                  142.00";
                     Pai = 142.00;
                 }
                 
                 if (TAI == 2){
                     Nai = "Automatic-Dimming Mirror                219.00";
                     Pai = 219.00;
                 }
                 
                 if (TAI == 3){
                     Nai = "Cargo Hook                               12.00";
                     Pai = 12.00;
                 }
                
                 if (TAI == 4){
                     Nai = "Cargo Net                                49.00";
                     Pai = 49.00;
                 }
                 
                 if (TAI == 5){
                     Nai = "Console Illumination                    250.00";
                     Pai = 250.00;
                 }  
                 
                 if (TAI == 6){
                     Nai = "Cargo Organizer                          87.00";
                     Pai = 87.00;
                 }  
                 
                 if (TAI == 7){
                     Nai = "Door Panel Protector                    149.00";
                     Pai = 149.00;
                 }  
                 
                 if (TAI == 8){
                     Nai = "Armrest Compartiment                    337.00";
                     Pai = 337.00;
                 }  
                 
                 if (TAI == 9){
                     Nai = "Door Sill Trim-Illuminated              290.00";
                     Pai = 290.00;
                 } 
                 
                 if (TAI == 10){
                     Nai = "Cargo Cover                            166.00";
                     Pai = 166.00;
                 } 
                 
                 if (TAI == 11){
                     Nai = "Cargo Liner                            187.00";
                     Pai = 187.00;
                 }
                 
                 if (TAI > 12){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;
           
             case 7:
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Selección Accesorios Electronicos--           "+ "\n"); 
                 System.out.print("\n" 
                          + "1.-Wireless Phone Charger                  305.00" + "\n" 
                          + "2.-USB Charger - 2.1 Amp                   120.00" + "\n" 
                          + "3.-Puddle Light                            185.00" + "\n"
                          + "4.-Parking Sensors                         514.00" + "\n"
                          + "5.-Regresar a selección de amenidades" 
                          +  "\n");
                  
                  TAL = TipoAL.nextInt();
                  
                 if (TAL == 1){
                     Nal = "Wireless Phone Charger                  305.00";
                     Pal = 305.00;
                 }
                  
                 if (TAL == 2){
                     Nal = "USB Charger - 2.1 Amp                   120.00";
                     Pal = 120.00;
                 }
                 
                 if (TAL == 3){
                     Nal = "Puddle Light                            185.00";
                     Pal = 185.00;
                 }
                  
                 if (TAL == 4){
                     Nal = "Parking Sensors                         514.00";
                     Pal = 514.00;
                 } 
                 
                 if (TAL > 5){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }
           break;                                                                                                                                                     
                  
             }
         
         } while (TT >= 5 || TC >= 13 || TCT >= 5|| TA >= 6 || TAE >= 16 || TAI >= 12 || TAL >= 5);
                 if (Am < 8 ){
                 total = P +Pt + Pa + Pae + Pai + Pal;
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Resumen de amenidades--           "+ "\n");
                  System.out.print("\n" +"Ha seleccionado la gamma: " + N +"                  " + P + "\n");
                  
                 if (TT > 0 ){
                 System.out.print("\n" +"Tipo de transmisión: "+ Nt +"              "+ Pt +"\n");        
                 }    
                 if (TC > 0 ){
                 System.out.print("\n" +"Color de pintura exterior: "+ Nc+"\n");        
                 } 
                 if (TCT > 0 ){
                 System.out.print("\n" +"Color de Tapicería: "+ Nct+"\n");        
                 } 
                 if (TA > 0 ){
                 System.out.print("\n" +"Tipo de Aros: "+ Na+"\n");        
                 } 
                 if (TAE > 0 ){
                 System.out.print("\n" +"Accesorios exteriores: "+ Nae+"\n");        
                 }
                 if (TAI > 0 ){
                 System.out.print("\n" +"Accesorios Interiores: "+ Nai+"\n");        
                 }
                 if (TAL > 0 ){
                 System.out.print("\n" +"Accesorios Electronicos: "+ Nal+"\n");        
                 }
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Su total es de: "+ total +"\n");
                 System.out.print("\n" +"¿Desea agregar otra amenidad? 1.SI 2.NO"+"\n");
                 Ag = Agrega.nextInt();
                          
                 } 
          } while (Ag == 1);       
          
      if (Ag == 2){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Resumen de amenidades--           "+ "\n");
                  System.out.print("\n" +"Ha seleccionado la gamma: " + N +"                  " + P + "\n");
                  
                 if (TT > 0 ){
                 System.out.print("\n" +"Tipo de transmisión: "+ Nt +"              "+ Pt +"\n");        
                 }    
                 if (TC > 0 ){
                 System.out.print("\n" +"Color de pintura exterior: "+ Nc+"\n");        
                 } 
                 if (TCT > 0 ){
                 System.out.print("\n" +"Color de Tapicería: "+ Nct+"\n");        
                 } 
                 if (TA > 0 ){
                 System.out.print("\n" +"Tipo de Aros: "+ Na+"\n");        
                 } 
                 if (TAE > 0 ){
                 System.out.print("\n" +"Accesorios exteriores: "+ Nae+"\n");        
                 }
                 if (TAI > 0 ){
                 System.out.print("\n" +"Accesorios Interiores: "+ Nai+"\n");        
                 }
                 if (TAL > 0 ){
                 System.out.print("\n" +"Accesorios Electronicos: "+ Nal+"\n");        
                 }
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Su total es de: "+ total +"\n");
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Escriba SI para volver al menú principal"+"\n");
                 Sal = SalidaP.nextLine();
} 
       }
       
       

     if (Am > 8){
                 System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                  System.out.print("\n" +"Numero Fuera de Rango" + "\n");
                 }                   
 } while (Am >= 8);   


       if (A == 2){
             System.out.print("\n" +"---------------------------------------------------------------------"+"\n"); 
                  System.out.print("\n" +"--Bienvenido, Consesionaria de Automoviles--"+ "\n" + "         --Resumen de Venta--           "+ "\n");
                  System.out.print("\n" +"Ha seleccionado la gamma: " + N +"                  " + P + "\n");
                  System.out.print("\n" +"No se eligieron Amnenidades" + "\n");
            System.out.print("\n" +"---------------------------------------------------------------------"+"\n");
                 System.out.print("\n" +"Su total es de: "+ P +"\n");
                  System.out.print("\n" +"Escriba SI para volver al menú principal"+"\n");
                  Sal = SalidaP.nextLine();
    }   
       
 }while (Sal.equals("SI"));     
}  
}
