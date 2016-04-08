package es.unileon.prg.date;
public class MainDate{

	public static void main(String arg[]){
		Date, today, tomorrow;
		today=new Date(6,4,2016);
		tomorrow= new Date(7,4,2016);
		today.isSameYear(tomorrow);
		today.isSameMonth(tomorrow);
		today.isSameDay(tomorrow);
	}

}
