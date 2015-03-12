package ese.pkg102.newpackage;
import java.io.*;

public class complexnumber {
    private double modulus;
    private double argument;
    static private double initModulus;
    static private double initArgument;
    private double re;
    private double im;
    static private double initRe;
    static private double initIm;
    public  double add;
    public double sub;
    public double multiply;
    public double divide;
    private double conjugate;
    
    static public void setInitCartesian(double re, double im)
    {
        initRe=re;
        initIm=im;
    }    
    static public void setInitPolar(double modulus, double argument)
    {
        initModulus=modulus;
        initArgument=argument;
    }
		    
    public complexnumber(double re,double  im)
    {
        this.re = initRe;
	this.im = initIm;
    }
		    
	public complexnumber() 
        {
	   this.re = initRe;
           this.im = initIm;
       }
		    
    public String formatComplexNumber() {
	   String r = this.getRe() + "+(" + this.getIm() + ")i";
	   return r;
	}

	public double getRe() 
        {
		re=Math.sqrt(modulus*modulus)-(im*im);
        return re;
	}

	public void setRe(double re)
        {
	   this.re = re;
	}

	public double getIm() {
	   im=Math.sqrt(modulus*modulus)-(re*re);
	   return im;
	}

	public void setIm(double im) {
	   this.im = im;
    }
	
	public double getModulus(){
		modulus=Math.sqrt((re*re)+(im*im));
		return modulus;
	}
	
	public void setModulus(double modulus){
		this.modulus=modulus;
	}
	
	public double getArgument(){
	    argument=Math.atan((im/re)+Math.PI);
		return argument;
	}
	
	public void setArgument(double argument){
		this.argument=argument;
	}
    
     static public complexnumber add(complexnumber operand1, complexnumber operand2)
      {
        complexnumber somma= new complexnumber();
        double re= operand1.getRe()+operand2.getRe();
        double im=operand1.getIm()+operand2.getIm();
        somma.setInitCartesian(re,im);
        return somma;
          
      }
    /*
    sottrazione tra numeri complessi
    */
     static public complexnumber sub(complexnumber operand1, complexnumber operand2)
    {
        complexnumber sottrazione=new complexnumber();
        double re=operand1.getRe()-operand2.getRe();
        double im= operand1.getIm()-operand2.getIm();
        sottrazione.setInitCartesian(re,im);
        return sottrazione;
        
        
    }
      static public complexnumber multiply(complexnumber operand1, complexnumber operand2)
    {
        complexnumber moltiplicazione= new complexnumber();
        moltiplicazione.setInitPolar(operand1.getArgument()+operand2.getArgument(),operand2.getModulus()*operand2.getModulus());
        return moltiplicazione;
        
    }
    public complexnumber divide(complexnumber operand1, complexnumber operand2)
    {
        complexnumber divisione = new complexnumber();
        divisione.setInitPolar(operand1.getArgument()-operand2.getArgument(),operand1.getModulus()/operand2.getModulus());
        return divisione;
        
        
    }
     private double setConjugate(complexnumber operand)
     {
         if(this.re<0)
         {
             conjugate= - (this.re) + (this.im);
         }
         else
         {
             conjugate = + (this.re) - (this.im);
           
         }
         return conjugate;
         
     }
    
            
    
}
     
            
    
