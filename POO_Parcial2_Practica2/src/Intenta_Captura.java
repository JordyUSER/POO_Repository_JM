
public class Intenta_Captura {

	public static void main(String[] args) {
		int num[] = new int[5];
		try {
			num[7] = 0;
		 //catch(java.lang.ArrayIndexOutOfBoundsException e){
//		System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		} finally {		
		}
	}
}
