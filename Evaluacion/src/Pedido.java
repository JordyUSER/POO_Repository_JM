
public class Pedido {
	private String pedido;

    public void getPedido(int nped) {
        for(int i=0;i<nped;i++) {
        	
        }
    	System.out.println(
        		"\n=======================\n" +
        		"Pedido\n" +
        		pedido + "\n");
    }

    public String setPedido(String prod, String prov, int prec, int unidades) {
        this.pedido = prod + "|" + prov + "|$" + prec + "|" + unidades + "|";
        return pedido;
    }

}
