package TP1.src;


public class PrintArgs {
	public static void main(String[] args) {
		/*for(int i=0; i< args.length; i++) {
			System.out.println(args[i]);
		}*/
		
		for(String argument: args) {
			System.out.println(argument);
		}
	}
}
