package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PruebaFecha {

	public static void main(String[] args) throws ParseException {
		//Fecha y hora actual
		Date f1=new Date();
		System.out.println(f1);
		//Fecha y hora concreta
		Calendar cal=Calendar.getInstance();
		cal.set(2022, 0, 30, 10, 20, 35);
		Date f2=cal.getTime();
		System.out.println(f2);
		//Fecha a partir de un String
		String fecha="04/10/1999";
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date f3=format.parse(fecha);
		f3.setTime(292929939393L);
		System.out.println(f3);
	}

}
