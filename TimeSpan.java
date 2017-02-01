
public class TimeSpan {
	/*
	 * TimeSpan equals minutes
	 * */
	private double timeSpan;
	
	public TimeSpan(int hours, int minutes) {
		this.timeSpan = ((hours * 60) + minutes);
	}
	
	/*
	 * @Getter
	 * - getHours
	 * - getMinutes
	 * - getTotalHours
	 * - toString
	 * */
	public int getHours() {
		return (int) this.timeSpan / 60;
	}
	
	public int getMinutes() {
		return (int) this.timeSpan % 60;
	}
	
	public double getTotalHours() {
		return this.timeSpan / 60;
	}
	
	public String toString() {
		return  (int) this.getHours() + "h" + (int) this.getMinutes() + "m";
	}
	
	/*
	 * @Setter
	 * - add(hours, minutes
	 * - add(timeSpan)
	 * */
	public void add(int hours, int minutes) {
		this.timeSpan += ((hours * 60) + minutes);
	}

	public void add(int timeSpan) {
		this.timeSpan += timeSpan;
	}
	
	public static void main(String[] args) {
		TimeSpan time = new TimeSpan(9, 45);
		
		System.out.println("Hours: " + time.getHours());
		System.out.println("Minutes: " + time.getMinutes());
		System.out.println("TotalTimeSpan: " + time.getTotalHours());
		System.out.println(time.toString());
			
		System.out.println("\nadd(2, 10): 2hour 10mins\n");
		
		time.add(2, 10);
		System.out.println("Hours: " + time.getHours());
		System.out.println("Minutes: " + time.getMinutes());
		System.out.println("TotalTimeSpan: " + time.getTotalHours());
		System.out.println(time.toString());
		
		System.out.println("\nadd(130): 2hour 10mins\n");
		
		time.add(130);
		System.out.println("Hours: " + time.getHours());
		System.out.println("Minutes: " + time.getMinutes());
		System.out.println("TotalTimeSpan: " + time.getTotalHours());
		System.out.println(time.toString());
		
	}
	
}
