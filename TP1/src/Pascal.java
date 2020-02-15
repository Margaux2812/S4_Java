package TP1.src;


public class Pascal {
	public static int pascal (int nBut, int pBut){
	       int[] tab = new int[nBut+1];
	       int n, i;
	       
	       tab[0] = 1;

	       for(n=1; n<=nBut; n++){
	         tab[n] = 1;

	         for(i=n-1; i>0; i--) {
	           tab[i] = tab[i-1] + tab[i];
	         }
	       }

	       int result=tab[pBut];
	       return result;
	}

    public static void main(int argc, String[] argv) {
    	long temps = System.currentTimeMillis();
    	System.out.println(" Cn, p = %d\n" + pascal (30000, 250));
    	System.out.println("Temps écoulé : " + (System.currentTimeMillis()-temps));
    }
}
