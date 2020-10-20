/**
 * 
 */
package imd.fic;

/**
 * @author Adelson
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Data novaData = new Data(32,10,2015);
		System.out.println(novaData.toString());
		
		novaData.avancaData();
		System.out.println(novaData.toString());
		
		Data novaData2 = new Data();
		System.out.println(novaData2.toString());

	}

}
