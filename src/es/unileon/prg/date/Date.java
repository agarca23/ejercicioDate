package es.unileon.prg.date;
public class Date {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {
	
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}

	public Date(int day, int month, int year) throws Exception{
		this.year=year;
		this.month=month;
		this.day=day;

	StringBuffer mensaje= new StringBuffer();

	if (year<0){
		mensaje.append("El año introducido es incorrecto");
	}else{
		this.setYear=year;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}
	if ((month<0)&&(month>12)){
		mensaje.append("El mes introducido es incorrecto");
	}else{
		this.setMonth=month;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}
	if ((day<0)&&(day>31)){
		mensaje.append("El dia introducido es incorrecto");
	}else{
		this.setDay=day;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}

	public boolean isSameYear(Date otherDate) {
		if (this.year == otherDate.getYear()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isSameMonth(Date otherDate) {
		if (this.month == otherDate.getMonth()) {
			return true;
		} else {
			return false;
		}

	}

	 public boolean isSameDay(Date otherDate){
		if (this.day==otherDate.getDay()){
			return true;
		}else{
			return false;
		}
	
	}	
	
	public String getMonthName(this.getMonth){
		StringBuffer month = new StringBuffer();
		switch(month){
			case 1: month.append("Enero");
				break;
			case 2: month.append("Febrero");
				break;
			case 3: month.append("Marzo");
				break;
			case 4: month.append("Abril");
				break;
			case 5: month.append("Mayo");
				break;
			case 6: month.append("Junio");
				break;
			case 7: month.append("Julio");
				break;
			case 8: month.append("Agosto");
				break;
			case 9: month.append("Septiembre");
				break;
			case 10: month.append("Octubre");
				break;
			case 11: month.append("Noviebre");
				break;
			case 12: month.append("Diciembre");
				break;
			return toString();
		}
	}

	 public String getMonthSeason(this.getMonth){
		StringBuffer season = new StringBuffer();
		switch(month){
			case 1:
			case 2:
			case 3: season.append("Invierno");
				break;
			case 4:
			case 5:
			case 6: month.append("Primavera");
				break;
			case 7: 
			case 8:
			case 9: month.append("Verano");
				break;
			case 10:
			case 11:
			case 12: month.append("Otoño");
				break;
			return toString();
		}
	}
	
	public int printMonthsLeft(){
		int i;
		int j=0;
		for (i=month;i=12;i++){
			
			j++;
				
		}
		System.out.println("Quedan "+j+" meses para que acabe el año");
	}
}

