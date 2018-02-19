package TimeInterface;

/**
 * @author Guillermo Vigueras
 *
 */
public class TimeSec implements Time {
	
	private int totalSecs;
	private int sign;

	public TimeSec(){
		sign = 1;
		
		totalSecs = 0;		
	}	
	
	public TimeSec(int s){
		
		sign = s < 0 ? -1 : 1;
		
		totalSecs = Math.abs(s);
	}		
	
	public String toString(){
		
		String sign = this.sign==-1 ? "-" : "";
		
		return sign+getHour()+":"+getMins()+":"+getSecs();
	}	
	
    /**
     * State comparison of "this" with "t" parameter
     *
     * @param  o     object to compare with
     * @return true if "this" has the same state as "t" parameter. False otherwise
     */	
	public boolean equals(Object o){
			return false;			
	}
	
	
    /**
     * Get the Hour slot for the time
     *
     * @return the Hour slot for the time
     */		
	public int getHour() {
		return 0;
	}

    /**
     * Get the Minutes slot for the time
     *
     * @return the Minutes slot for the time
     */			
	public int getMins() {
		return 0;
	}

    /**
     * Get the Seconds slot for the time
     *
     * @return the Seconds slot for the time
     */			
	public int getSecs() {
		return 0;
	}

    /**
     * Get the sign of the time (positive/negative)
     *
     * @return -1 if time is negative, 1 if the time is positive
     */			
	public int getSign() {
		return 0;
	}
	
    /**
     * Return the value of time in seconds
     *
     * @return the value of time in seconds
     */			
	public int timeInSeconds(){
		return 0;
	}

    /**
     * Sum this object with the parameter "t"
     *
     * @param t second operator of the sum
     * @return the sum of this object plus the parameter "t"
     */			
	public Time suma(Time t) {
		return null;
	}

    /**
     * Subtract to this object the parameter "t"
     *
     * @param t second operator of the subtraction
     * @return the difference between this object minus the parameter "t"
     */				
	public Time resta(Time t) {
		return null;		
	}	
	
	
}


	
