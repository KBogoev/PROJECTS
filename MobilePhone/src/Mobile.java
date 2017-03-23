import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Gsm nokia = new Gsm();
		System.out.print("INput telephone number: ");
		String nokiaNumber = sc.next();
		nokia.insertSimCard(nokiaNumber);
		nokia.lastOutgoingCall.priceForAMinute = 2.10D;

		Gsm iphone = new Gsm();
		System.out.print("Input telephone nuber: ");
		String iphoneNumber = sc.next();
		iphone.insertSimCard(iphoneNumber);

		iphone.call(nokia, 25.0D);
		iphone.printInfoForTheLastOutgoingCall();
		System.out.println("------------------------");
		nokia.printInfoForTheLastIncomingCall();

	}

}
