
public class Call {

	static double priceForAMinute;
	Gsm caller;
	Gsm receiver;
	double duration;

	Call() {

	}

	Call(Gsm receiver, double duration) {

		if (receiver != null) {

			this.receiver = receiver;
		}

		if (duration > 0.0D) {

			this.duration = duration;
		}
	}
}
