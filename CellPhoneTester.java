public class CellPhoneTester{
	
	public static void main(String[] args){


		System.out.println("Main method Started");

		HeadPhone headPhone = new HeadPhone();

		headPhone.brand = " Boat";
	    headPhone.color = " Red";
	    headPhone.iswired = true;

	    CellPhone cellphone = new CellPhone();

	    cellphone.brand = "Samsung";
	    cellphone.color = "White";
        cellphone.price = 30000;
        cellphone.processor = "snapdragon";
        cellphone.headPhone = headPhone;

        cellphone.headPhoneDetails();
        cellphone.listeningMusic();

        System.out.println("Main Method Ended");



}

}





