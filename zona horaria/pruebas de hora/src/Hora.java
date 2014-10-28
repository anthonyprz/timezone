//import java.util.Calendar;
import java.util.TimeZone;
//import java.util.GregorianCalendar;
public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar calendar = new GregorianCalendar();
		//TimeZone tz = calendar.getTimeZone();
		
		TimeZone tz = TimeZone.getDefault();
		
		//TimeZone tz1 = TimeZone.gettimezone("America/Los_Angeles");

		//calendar.setTimeZone(tz);
		 tz.getDefault ();
		 //tz.getDisplayName();
		// tz.getID();
		// tz.getOffset( System.currentTimeMillis() ); 
		// tz.getRawOffset ();
		System.out.println("tu zona horaria es " + tz.getDisplayName());
		System.out.println("zona horaria " + tz.getID());
		//System.out.println("milisegundos " + tz.getOffset(System.currentTimeMillis()));
		// System.out.println("zona horaria " + tz.getDefault());
	}

}
