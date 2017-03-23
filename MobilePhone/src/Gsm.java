
public class Gsm {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();

	void insertSimCard(String simMobileNumber) {

		if (simMobileNumber.length() != 10 && simMobileNumber.charAt(0) != '0' && simMobileNumber.charAt(1) != '8') {

			System.out.println("invalid number");
		}

		boolean isValid = true;
		for (int index = 2; index < simMobileNumber.length(); index++) {

			if (simMobileNumber.charAt(index) < '0' || simMobileNumber.charAt(index) > '9') {

				isValid = false;
				break;
			}

		}

		if (!isValid) {

			System.out.println("INvalid number!!!");
		}

		this.simMobileNumber = simMobileNumber;

		hasSimCard = true;
	}

	void removeSimCard() {

		this.simMobileNumber = "No mobile number";
		this.hasSimCard = false;
	}

	void call(Gsm receiver, double duration) {

		if (this.hasSimCard && receiver.hasSimCard) {
			if (duration > 0.0D) {
				boolean areDifferent = false;
				if (!this.simMobileNumber.equals(receiver.simMobileNumber)) {

					areDifferent = true;
				}
				if (areDifferent) {

					if (this.hasSimCard == true && receiver.hasSimCard == true) {

						receiver.lastIncomingCall.caller = this;
						receiver.lastIncomingCall.duration = duration;
						this.lastOutgoingCall.receiver = receiver;
						this.lastOutgoingCall.duration = duration;
						this.outgoingCallsDuration += duration;
					}
				}
			}
		}
	}

	double getSumForCall() {

		double sumForOutgoingCalls = this.outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute;
		return sumForOutgoingCalls;
	}

	void printInfoForTheLastOutgoingCall() {

		if (this.lastOutgoingCall.receiver != null) {

			System.out.println("The number that is dialed is: " + this.lastOutgoingCall.receiver.simMobileNumber);

			if (this.getSumForCall() > 0.0D) {

				System.out.println("the price for the last outgoing call is: " + this.getSumForCall());
			} else {

				System.out.println("No information for the price!!!");
			}

			if (this.lastOutgoingCall.duration > 0.0D) {

				System.out.println("the last outgoing call duration is: " + this.lastOutgoingCall.duration);
			} else {

				System.out.println("there is no information for the last outgoing call duration !!!");
			}
		}
	}

	void printInfoForTheLastIncomingCall() {

		if (this.lastIncomingCall.caller != null) {

			System.out.println("The number that called you is: " + this.lastIncomingCall.caller.simMobileNumber);
		} else {

			System.out.println("No information for the number who made the call!!!");
		}

		if (this.lastIncomingCall.duration > 0.0D) {

			System.out.println("the last incoming call duration is: " + this.lastIncomingCall.duration);
		} else {

			System.out.println("there is no information for the last incoming call duration !!!");
		}
	}
}
