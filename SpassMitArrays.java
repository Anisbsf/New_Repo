/*
 * anis.bensaif@tu-clausthal.de
 * Vorname: Anis
 * Nachname: Bensaif
 */
package tuc.isse.uebung03;
import java.util.*;


public class SpassMitArrays {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Mon = new String();
		String M = new String();
		int[] array = new int[13];
array[0]=31;array[1]=31;array[2]=29;array[3]=31;array[4]=30;array[5]=31;array[6]=30;array[7]=31;array[8]=31;array[9]=30;array[10]=31;array[11]=30;array[12]=31;
		try(Scanner reader = new Scanner(System.in)){ //Eingaben
			
			 System.out.println("Geben Sie einen String"); // Eingabe Mon Frage (b)
			 Mon = reader.nextLine();
			 System.out.println("Geben Sie einen Enum Monat"); // Eingabe Mon Frage (b)
			 M = reader.nextLine();
			 
	}
		       
		StringToMonat(Mon); // Function anrufen Frage (b)
		anzahlTage(M);// Function anrufen Frage (c)	
		findeGroesstesElement(array);	
	}
	//Erstellung eine Enum Frage (a)
public enum Monat {
	 Jan, Feb, März, April, May, Juni, Juli, August, Sep, Okt, Nov, Dez
	 }


	
// Function Frage (b) einen String erhalten und den passenden Enum (Monat) zurückgeben mit Switch-Statement
  static String  StringToMonat(String x ) 
	{
	  
	 switch(x) {
     case "Januar":
            System.out.println("die passende Enum ist :Jan");
            break;
     case "Februar":
            System.out.println("die passende Enum ist :Feb" );
            break;
     case "März":
            System.out.println("die passende Enum ist :März");
            break;
     case "April":
            System.out.println("die passende Enum ist :April");
            break;
     case "May":
            System.out.println("die passende Enum ist :May");
            break;
     case "Juni":
            System.out.println("die passende Enum ist :Juni");
            break;
     case "Juli":
            System.out.println("die passende Enum ist :Juli");
            break;
     case "August":
            System.out.println("die passende Enum ist :August");
            break;
     case "September":
               System.out.println("die passende Enum ist :Sep");
               break;
     case "Oktober":
            System.out.println("die passende Enum ist :Okt");
            break;
     case "November":
         System.out.println("die passende Enum ist :Nov");
         break;
     case "Dezember":
         System.out.println("die passende Enum ist :Dez");
         break;
     default:
            System.out.println("das ist kein Monat");
            break; 
     }
	 return x;}

//Function Frage (b) eine Enum erhalten und den passende Anzahl Tage in diesem Monat zurückgeben mit Switch-Statement
  static String  anzahlTage(String x ) 
	{
	 switch(x) {
     case "Jan":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "Feb":
            System.out.println("die Anzahl Tage ist : 29" );
            break;
     case "März":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "April":
            System.out.println("die Anzahl Tage ist : 30");
            break;
     case "May":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "Juni":
            System.out.println("die Anzahl Tage ist : 30");
            break;
     case "Juli":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "August":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "Sep":
               System.out.println("die Anzahl Tage ist : 30");
               break;
     case "Okt":
            System.out.println("die Anzahl Tage ist : 31");
            break;
     case "Nov":
         System.out.println("die Anzahl Tage ist : 30");
         break;
     case "Dez":
         System.out.println("die Anzahl Tage ist : 31");
         break;
     default:
            System.out.println("das ist kein Monat");
            break; 
     }
	 return x;}
static void findeGroesstesElement(int[] array) {int x=0; 
	for(int i=0;i<=array.length;) {
		for(int j=1;j<=array.length;j++) {
			if(array[j]>array[i]) { array[i] = array[j];
			x = array[i];}
			}
		break;
		} 
	System.out.println(x);
	}
}
