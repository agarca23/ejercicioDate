public class Date(int day, int month, int year) throw Excepcion{
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
	
}
