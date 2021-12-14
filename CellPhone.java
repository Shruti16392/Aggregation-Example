public class CellPhone{

String brand;
String color;
double price;
float battery;
String processor;

HeadPhone headPhone;//taking another object as a reference or property

public void calling(){

	System.out.println("Calling...");
}
 public void listeningMusic(){

 	System.out.println("listening music..");
 }
 public void headPhoneDetails() {

 	System.out.println("....HeadphoneDetails...");
 	System.out.println("Brand :" +headPhone.brand);
 	System.out.println("Color :" +headPhone.color);
 	System.out.println("Price :" +headPhone.price);
 	System.out.println("iswired:"+headPhone.iswired);

 }
	}
