package TimeInterface;

/**
 * @author Guillermo Vigueras
 *
 */
public class TimeHMS implements Time {
	
	private int hour;
	private int mins;
	private int secs;
	private int sign;

	public TimeHMS(){
		sign = 1;
		
		hour = 0;
		mins = 0;
		secs = 0;		
	}	
	
	public TimeHMS(int sgn,int h,int m,int s){
		
		// need to pass the sign as argument for the case when hour=0
		sign = sgn < 0 ? -1 : 1;
		
		hour = Math.abs(h);
		mins = Math.abs(m) % 60;
		secs = Math.abs(s) % 60;
	}		
	
	public String toString(){
		
		String sign = this.sign==-1 ? "-" : "";
		
		return sign+hour+":"+mins+":"+secs;
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
     * Convert the time from HH:MM:SS format to seconds
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


	
