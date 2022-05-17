/*
 * anis.bensaif@tu-clausthal.de
 * Vorname: Anis
 * Nachname: Bensaif
 */

package tuc.isse.uebung03;
import java.util.Scanner;

public class Verkehr {
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int A,Vs,Xs,n,Zahl; //Inititalisieren
		try(Scanner reader = new Scanner(System.in)){ //Eingaben
			 System.out.println("Geben Sie Vs");
			 Vs = reader.nextInt(); // Eingabe Vs (Frage a und b)
			 
			 System.out.println("Geben Sie A");
			 A = reader.nextInt();  // Eingabe A  (Frage a und b)
			 
			 System.out.println("Geben Sie Xs");
			 Xs = reader.nextInt(); // Eingabe Xs (Frage b)
			 
			 System.out.println("Geben Sie Zahl");
			 Zahl = reader.nextInt(); // Eingabe Zahl (Frage c)
			 
			 System.out.println("Geben Sie n");
			 n = reader.nextInt(); // Eingabe n (Frage d)
			 
			 }
// Condition A<0
	 if(A>=0) { System.out.println("A muss negativ sein"); 
	 }
	 else {
	 int T = minstopTime(Vs,A);
	 System.out.println(T + " 1/s"); //Mindesthaltezeit T berechnen ( Frage a)
	 int X = minDistance(Xs,Vs,A);
	 System.out.println(X + " m^2"); // Mindestabstand X berechnen (Frage b)
	 }
	 
// Frage c : Function anrufen um die Integer-Zahl als Text auszugeben
	 readWord(Zahl);
	 
// Frage d : Function anrufen um die Summe zu berechnen
	 int S = sumOfSquares(n);
	 System.out.println("Die Summe ist : " + S );
	 
// Frage e : Function anrufen um die Anzahl und Summe zu berechnen
	 int sum = sumAndCount(Xs);
	 System.out.println("Die Summe aller ganzen Zahlen zwischen 73 und 220, die durch Xs teilbar sind, ist : " + sum );
    
    }
    
//Function der Frage (a) 
static int minstopTime(int x, int y) { int V=0;
	  int T = (V-x)/y ; 
	  return T;
      }

//Function der Frage (b)
static int minDistance(int x, int y, int z) {
	int V=0;
	int X = x + ( (int) Math.pow(V,2) -  (int) Math.pow(y,2)) / (2 * z);
	return X;
      }

//Function der Frage (c) mit switch-statement
static int readWord(int x) { int y=0;
while(x != 0 ) {
       y = x % 10;
	        switch(y){
               case 0:
                      System.out.println("0 : null");
                      break;
               case 1:
                      System.out.println("1 : eins" );
                      break;
               case 2:
                      System.out.println("2 : zwei");
                      break;
               case 3:
                      System.out.println("3 : drei");
                      break;
               case 4:
                      System.out.println("4 : vier");
                      break;
               case 5:
                      System.out.println("5 : fünf");
                      break;
               case 6:
                      System.out.println("6 : sechs");
                      break;
               case 7:
                      System.out.println("7 : sieben");
                      break;
               case 8:
   	                  System.out.println("8 : acht");
   	                  break;
               case 9:
                      System.out.println("9 : neun");
                      break;
               default:
                      System.out.println("das ist nicht ein Integer-Zahl");
                      break; 
               }
	   x = x / 10;
	    if(x == 0) {break;}
	}
 return y;
} 

// Function der Frage (d)
static int sumOfSquares(int x) {int S=0;
	for (int i = 1; i <= x;) { 
		 S += (int) Math.pow(i,2);
		 i++;
	}
  return S;
}

/*Function der Frage (e): Ausgabe der Anzahl aller ganzen Zahlen zwischen 73 und 220, die durch Xs teilbar sind
 * und return (sum),also Die Summe aller ganzen Zahlen zwischen 73 und 220, die durch Xs teilbar sind
 */
static int sumAndCount(int x) {int sum=0,cpt=0;
    for(int i = 73; i <= 220; i++) {
    	if(i % x ==0) {
    		sum += i;
    		cpt++;
}
}   System.out.println("Die Anzahl aller ganzen Zahlen zwischen 73 und 220, die durch Xs teilbar sind, ist :" + cpt);
    return sum;
}
 
/*Das ist nur ein Versuch, um die letzte Frage zu programmieren!!!!
 * static int frequencys(int x) {int cpt=0; int[] tab = new int[10];
 while(x != 0) {      
  for (int i=0;i<=tab.length;i++) {
    	  tab[(tab.length)-i] = x % 10;
    	  x = x/10;
  }
  }
 
      for (int i=0;i<=tab.length;i++) {
    	  for(int j=1;j<=tab.length;j++) {
                if(i==j) {cpt++;}   	  
    	  
    	  }}
      return cpt;
}*/

}
