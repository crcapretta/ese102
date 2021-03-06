package complexNumber;

public class ComplexNumber {

	// TODO Auto-generated method stub
		     private double modulus;
		     private double argument;
		     public static double initModulus;
		     public static double initArgument;
		     private double re;
		     private double im;
		     public static double initRe;
		     public static double initIm;
		     private StringFormat format;
		  
		    enum StringFormat{
		    	RECTANGULAR,
		    	POLAR
		    }
		     
		    static public void setInitRectangular( double re,double im){
		        initRe=re;
		        initIm=im;
		     
		    }    
		    static public void setInitPolar(double modulus, double argument){
		        initModulus=modulus;
		        initArgument=argument;
		    }    
		    public void complexNumber( ){
		    	 this.re = initRe;
				 this.im = initIm;
				
			}
			public String formatComplexNumber() {
			   String r = this.getRe() + "+(" + this.getIm() + ")i";
			   return r;
			}

			public double getRe() {
				re=Math.sqrt(modulus*modulus)-(im*im);
		        return re;
			}

			public void setRe(double re){
				if(re<=modulus){ 
				   this.re = re; 
		 	   } 
		 	   else{ 
				   throw new IllegalArgumentException("The value of a must be different from 0."); 
			   } 

			}

			public double getIm() {
			   im=Math.sqrt(modulus*modulus)-(re*re);
			   return im;
			}

			public void setIm(double im) {
				if(re<=modulus){ 
			    this.im=im; 
			   } 
		 	   else{ 
		 		   throw new IllegalArgumentException("The value of a must be different from 0."); 
		 	   } 

		    }
			
			public double getModulus(){
				modulus=Math.sqrt((re*re)+(im*im));
				return modulus;
			}
			
			public void setModulus(double modulus){
				if(modulus>=0){ 
				   this.modulus=modulus; 
		 	    } 
		 		else{ 
		 			throw new IllegalArgumentException("The value of a must be different from 0."); 
		 		} 

			}
			
			public double getArgument(){
			    argument=Math.atan((im/re)+Math.PI);
				return argument;
			}
			
			public void setArgument(double argument){
				this.argument=argument;
			}
		    
		     static public ComplexNumber add(ComplexNumber operand1, ComplexNumber operand2){
		        ComplexNumber somma= new ComplexNumber();
		        somma.setInitRectangular(operand1.getRe()+operand2.getRe(),operand1.getIm()+operand2.getIm());
		        return somma;
		          
		      }
		     static public ComplexNumber sub(ComplexNumber operand1, ComplexNumber operand2){
		    	ComplexNumber sottrazione=new ComplexNumber();
		        sottrazione.setInitRectangular(operand1.getRe()-operand2.getRe(),operand1.getIm()-operand2.getIm());
		        return sottrazione;
		      }
		      static public ComplexNumber multiply(ComplexNumber operand1, ComplexNumber operand2){
		        ComplexNumber moltiplicazione= new ComplexNumber();
		        moltiplicazione.setInitPolar(operand1.getArgument()+operand2.getArgument(),operand1.getModulus()*operand2.getModulus());
		        return moltiplicazione;
		        
		    }
		    static public ComplexNumber divide(ComplexNumber operand1, ComplexNumber operand2){
		        ComplexNumber divisione = new ComplexNumber();
		        divisione.setInitPolar(operand1.getArgument()-operand2.getArgument(),operand1.getModulus()/operand2.getModulus());
		        return divisione;
		        
		        
		    }
		     static public ComplexNumber setConjugate(ComplexNumber operand) {
				ComplexNumber congiunzione = new ComplexNumber();
				congiunzione.setInitRectangular(operand.getRe(),-operand.getIm());
				return congiunzione;
		         
		     } 
		     
		      public ComplexNumber add(ComplexNumber operand){
			        ComplexNumber somma= new ComplexNumber();
			        somma.setInitRectangular(this.getRe()+operand.getRe(),this.getIm()+operand.getIm());
			        return somma;
			  }
		      
		       public ComplexNumber sub(ComplexNumber operand){
			    	ComplexNumber sottrazione=new ComplexNumber();
			        sottrazione.setInitRectangular(this.getRe()-operand.getRe(),this.getIm()-operand.getIm());
			        return sottrazione;
			    
		      }
		       
		       public ComplexNumber multiply(ComplexNumber operand){
			        ComplexNumber moltiplicazione= new ComplexNumber();
			        moltiplicazione.setInitPolar(this.getArgument()+operand.getArgument(),this.getModulus()*operand.getModulus());
			        return moltiplicazione;
			   }
		       
		       public ComplexNumber divide(ComplexNumber operand){
			        ComplexNumber divisione = new ComplexNumber();
			        divisione.setInitPolar(this.getArgument()-operand.getArgument(),this.getModulus()/operand.getModulus());
			        return divisione;
		       }
		       
		        public ComplexNumber setConjugate() {
					ComplexNumber congiunzione = new ComplexNumber();
					congiunzione.setInitRectangular(this.getRe(),-this.getIm());
					return congiunzione;
		       }
		     public String toString() {
		    	 return toString(this.format);
		    	 
		     }
		     
		     public String toString(StringFormat format) {
		    	 String r = new String(); 
		    	 switch(format) { 
		    	     case RECTANGULAR: 
		    	     r = this.getRe() + "+(" + this.getIm() + ")i"; 
		    	     break; 
		    	  	 case POLAR: 
		    	  	 r = this.getModulus() + "*exp(i*" + this.getArgument() +")"; 
		    	  	 break; 
		    	 } 
		   		 return r; 
		 	}
	    
		     @Override public boolean equals(Object o) { 
		         boolean equal = false; 
		         if(o instanceof ComplexNumber) { 
		      	    ComplexNumber pointer = (ComplexNumber)o; 
		      		if(this.re == pointer.getRe() && this.im == pointer.getIm()) 
		      		equal = true; 
		      	} 
		     		return equal;
		     }

	
}
