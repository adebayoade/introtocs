package introtocs.time;

public class Time {
	int hour;
	int minute;
	int second;
	
	/**
	 * constructs the time with default values.
	 */
	public Time() {
		this(0, 0, 0);
	}
	
	/**
	 * constructs the time with determined hour
	 * @param h the hour
	 */
	public Time(int h) {
		this(h, 0, 0);
	}
	
	/**
	 * constructs the time with determined hour and minute
	 * @param h the hour
	 * @param m the minute
	 */
	public Time(int h, int m) {
		this(h, m, 0);
	}

	/**
	 * constructs the time with determined hour, minute and second
	 * @param h the hour
	 * @param m the minute
	 * @param s the second
	 */
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	/**
	 * sets the time
	 * @param h the hour
	 * @param m the minute
	 * @param s the second
	 */
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
		
		// In case some idiot will set the time above 24 hours. 
		if (getHour() >= 24 && getMinute() > 0) {
			setHour(0);
			setMinute(0);
			
			System.err.println("Idiot alert!!!");
		}
	}

	/**
	 * sets the hour
	 * @param h the hour
	 */
	public void setHour(int h) {
		hour = (h >= 0 && h <= 24 ? h : 0);
	}
	
	/**
	 * sets the minute
	 * @param m the minute
	 */
	public void setMinute(int m) {
		minute = (m >= 0 && m <= 60 ? m : 0);
	}
	
	/**
	 * sets the second
	 * @param s the second
	 */
	public void setSecond(int s) {
		second = ((s >= 0 && s <= 60 ? s : 0));
	}
	
	/**
	 * gets a military format of the time
	 * @return the time in military format (call this function only if you are Chief Marshal like myself);
	 */
	public String toMillitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	/**
	 * gets a standard format of the time
	 * @return a standard format of the time.
	 */
	public String toStandard() {
		String AMPM = "";
		if (hour == 24 && minute == 0) {
			AMPM = "MIDNIGHT";
		} else if (hour == 12 && minute == 0) {
			AMPM = "NOON";
		} else if (hour >= 12 && minute >= 0) {
			AMPM = "PM";
		} else {
			AMPM = "AM";
		}
		return String.format("%02d:%02d:%02d %s", ((getHour() > 12 ? (getHour() - 12) : getHour())), getMinute(),
				getSecond(), AMPM);
	}
	
	/**
	 * gets the hour
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}
	
	/**
	 * gets the minute
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}
	
	/**
	 * gets the second
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
}
