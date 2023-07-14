
public class Main {
    public static void main(String[] args) {
    	Gestor gs = new Gestor();
	    int numgenerados = 0;
	    int [] nums = new int[6];
	    int n;
	        
	    do {
	    	n = (int)(Math.random()*29+1);
	    	if (!gs.repetido(n, nums, numgenerados)){
	    		nums[numgenerados] = n;
	    		numgenerados ++;
	    	}
	    } while (numgenerados < 6);
	    gs.getOrdenar(nums);
	    gs.mostrar(nums);
    }
}