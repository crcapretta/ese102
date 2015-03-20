package circle;
import triangle.*;
public class Circle {
	private double xC;
	private double yC;
	private double r;
	/**
	 * @param xC
	 * @param yC
	 * @param r
	 */
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		if(r<=0){
			throw new IllegalArgumentException("The value of a must be different from 0.");
		}
		this.r = r;
	}
	/**
	 * @return the xC
	 */
	public double getXC() {
		return xC;
	}
	/**
	 * @param xC the xC to set
	 */
	public void setXC(double xC) {
		this.xC = xC;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "circle [xc=" + xC + ", yc=" + yC + ", r=" + r + "]";
	}
	/**
	 * @return the yC
	 */
	public double getYC() {
		return yC;
	}
	/**
	 * @param yc the yC to set
	 */
	public void setYC(double yC) {
		this.yC = yC;
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		if(r>0){
		   this.r = r;
		}
		else{
			throw new IllegalArgumentException("The value of a must be different from 0.");
		}
	}
	
	public double getXMin(){
		return this.xC-this.r;
	}
	
	public double getYMin(){
		return this.yC-this.r;
	}
	
	public double getXMax(){
		return this.xC+this.r;
	}
	
	public double getYMax(){
		return this.yC+this.r;
	}
	
	
	public boolean contains(Circle c){
		 boolean contain=false;
		if(this.getXMin()<=c.getXMin() && this.getYMin()<=c.getYMin()  && this.getXMax()>=c.getXMax() && this.getYMax()>=c.getYMax()){
	    contain=true;
		}
		return contain;
	}

	public boolean contains(Triangle t){
		 boolean contain=false;
		if(this.getXMin()<=t.getXMin() && this.getYMin()<=t.getYMin()  && this.getXMax()>=t.getXMax() && this.getYMax()>=t.getYMax()){
	    contain=true;
		}
		return contain;
	}
	
}
