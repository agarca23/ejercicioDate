public class Date(/*int day, int month, int year*/) throw Excepcion{

	private int day;
	private int month;
	private int year;

	this.year=1990;
	this.month=1;
	this.day=1;
	
	public Date(int day, int month, int year){
		this.year=year;
		this.month=month;
		this.day=day;

	String mensaje= new StringBuffer();

	if (year<0){
		mensaje.append("El año introducido es incorrecto");
	}else{
		this.year=year;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}
	if ((month<0)&&(month=>12)){
		mensaje.append("El mes introducido es incorrecto");
	}else{
		this.month=month;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}
	if ((day<0)&&(day>31)){
		mensaje.append("El dia introducido es incorrecto");
	}else{
		this.day=day;	
	}
	if (mensaje.length()!=0){
		throw new Excepcion(mensage.toString());	
	}
	
	boolean isSameYear(Date otherDate){
		if (this.year==otherDate.getYear()){
			return true;
		}else{
			return false;
		}
	
	}
}
