package triangle;
import circle.*;
public class Triangle {
	
	private double xV;
	private double yV;
	private double l;
	/**
	 * @return the xV
	 */
	public double getXV() {
		return xV;
	}
	/**
	 * @param xV the xV to set
	 */
	public void setXV(double xV) {
		this.xV = xV;
	}
	/**
	 * @return the yV
	 */
	public double getYV() {
		return yV;
	}
	/**
	 * @param yV the yV to set
	 */
	public void setYV(double yV) {
		this.yV = yV;
	}
	/**
	 * @return the l
	 */
	public double getL() {
		return l;
	}
	/**
	 * @param l the l to set
	 */
	public void setL(double l) {
		if(l>0){
		   this.l = l;
	    }
	    else{
		   throw new IllegalArgumentException("The value of a must be different from 0.");
	    }
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	/**
	 * @param xV
	 * @param yV
	 * @param l
	 */
	public Triangle(double xV, double yV, double l) {
		this.xV = xV;
		this.yV = yV;
		if(l<=0){
			throw new IllegalArgumentException("The value of a must be different from 0.");
		}
		this.l = l;
	}
	
	public double getXMin(){
		
		return this.xV;
		
	}

	public double getXMax(){
		
		return this.xV+this.l;
	}
	
	public double getYMin(){
		return this.yV;
	}
	
	public double getYMax(){
		return this.yV+this.l*Math.sqrt(3)/2;
	}
	public boolean contains(Triangle t){
		boolean contains=false;
		if(this.getXMin()<=t.getXMin() && this.getYMin()<=t.getYMin()  && this.getXMax()>=t.getXMax() && this.getYMax()>=t.getYMax()){
	    contains=true;
		}
		return contains;
	}
	
	public boolean contains(Circle c){
		boolean contains=false;
		if(this.getXMin()<=c.getXMin() && this.getYMin()<=c.getYMin()  && this.getXMax()>=c.getXMax() && this.getYMax()>=c.getYMax()){
			contains=true;
		}
		return contains;
	}
	
}
