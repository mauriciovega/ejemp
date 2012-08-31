
//public class clase1 {

	package paquete;

	import javax.swing.JOptionPane;

	/**
	 *
	 * @author AKT
	 */

	 
	public class clase1{

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	      String datoin;
	        double a=0,b=0,c=0;
	        double rr1,rr2;
	        double ru,pr,pi;
	        
	        
	        JOptionPane.showMessageDialog(null, "realiza calculo de la ecuacion");
	       // System.out.println("hola");
	      try 
	      {
	      datoin = JOptionPane.showInputDialog("ingrese a");    
	       a = Double.parseDouble(datoin);
	       datoin = JOptionPane.showInputDialog("ingrese b");    
	       b = Double.parseDouble(datoin);
	       datoin = JOptionPane.showInputDialog("ingrese c");    
	       c = Double.parseDouble(datoin);
	       
	   
	      }
	      catch(NumberFormatException nfe)
	      {
	       JOptionPane.showMessageDialog(null,"error a ingresado un dato incorrecto");   
	      
	      }
	      if((Math.pow(b, 2)-4*a*c)==0)
	      {
	          ru = b/(2*a);
	          JOptionPane.showMessageDialog(null,"tienes raiz unica es " +ru);
	      }else
	          if((Math.pow(b, 2)-4*a*c)<0)
	          {
	              pr=-b/(2*a);
	              pi= Math.sqrt(Math.abs(Math.pow(b, 2)-4*a*c))/(2*a);
	              JOptionPane.showMessageDialog(null,"tienes raices complejas\n parte real+parte imaginaria\n"+pr+"+/-"+pi); 
	          }
	    }   
	   }
	   



