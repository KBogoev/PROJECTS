package Office;

public class Employee {

	private String name;
	private Task currentTask; // the task for the moment
	private int hoursLeft; // how many hours are left until the end of this day
	private static AllWork allWork;

	/**
	 * Initialising employee instance's name
	 * 
	 * @param name
	 */
	Employee(String name) {

		if (name != null && name != "") {

			this.name = name;
		}
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {

		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {

		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {

		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {

		if (hoursLeft >= 0) {

			this.hoursLeft = hoursLeft;
		}
	}

	boolean isTaskReady() {

		if (this.currentTask != null) {

			if (this.hoursLeft >= this.currentTask.getWorkingHours()) {

				int workerHours = this.hoursLeft;
				workerHours -= this.currentTask.getWorkingHours();
				this.hoursLeft = workerHours;
				this.currentTask.setWorkingHours(0);
				this.currentTask = null;

				return true;
			}

			if (this.hoursLeft < this.currentTask.getWorkingHours()) {

				int hoursForTheTaskToBeFinished = this.currentTask.getWorkingHours() - this.hoursLeft;
				this.hoursLeft = 0;
				this.currentTask.setWorkingHours(hoursForTheTaskToBeFinished);
				System.out.println(this.currentTask.getWorkingHours());
			}
		}
		return false;
	}

	void work() {

		if (this.currentTask == null) {

			this.currentTask = allWork.getNextTask();
			System.out.println("Ae, brat, zimam si edna zadachica " + this.currentTask.getNameOfTask()
					+ " i pochvam da q bachkam qko!!!");
		}

		if (this.isTaskReady()) {

			if (this.hoursLeft > 0) {
				System.out.println("Are svurshi se i taq raota sq da pochvam druga");
				this.currentTask = allWork.getNextTask();
			} else {

				System.out.println("Ae brat stiga tolkova za dneska, umorih se, utre she produlja!!!");
				this.currentTask = null;
			}
		} else {

			if (this.hoursLeft == 0) {

				System.out.println("Stiga tolkova za dneska, utre she q dovursha taq zadacha !!!");
			}
		}
	}

	void showReport() {
		System.out.println("Chai da napisha edin doklad za shefa");
		System.out.println("Worker's name: " + this.name);
		System.out.println("Task's name: " + this.currentTask.getNameOfTask());
		System.out.println("Hours for the worker left: " + this.getHoursLeft());
		System.out.println("Hours for the task to be finished: " + this.currentTask.getWorkingHours());
	}

	void startWorkingDay() {

		System.out.println("Dobroutro na vsichki kolegi!");
		System.out.println("Az sum " + this.name + " i pochvam qko da bachkam!!!");
		this.hoursLeft = 8;
	}

	public void setAllWork(AllWork allWork) {

		if (allWork != null) {

			this.allWork = allWork;
		}
	}

	public AllWork getAllwork() {

		return allWork;
	}

}
