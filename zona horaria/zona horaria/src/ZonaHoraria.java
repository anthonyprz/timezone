
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZonaHoraria {
 
  public static void main(String[] args) {
	  
		Date fechayhora = new Date();
		DateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
		System.out.println("Fecha      Hora");
		System.out.println(outFormat.format(fechayhora));
 
	}
}
	