package Office;

public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {

		this.tasks = new Task[10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}

	void addTask(Task task) {

		if (task != null) {

			for (int index = 0; index < this.tasks.length; index++) {

				if (this.tasks[index] == null) {

					this.tasks[index] = task;
					this.freePlacesForTasks--;
					break;
				}
			}
		}
	}

	Task getNextTask() {

		if (this.tasks[this.currentUnassignedTask] != null) {
			if (this.tasks[this.currentUnassignedTask].getWorkingHours() > 0
					|| this.currentUnassignedTask < this.tasks.length) {
				return this.tasks[this.currentUnassignedTask++];
			}
		} else {

			System.out.println("Brat ne stava, tuka nqma zadacha, nqma kvo da vzema");
		}
		return null;

	}

	/// ima da se opravi oshte
	boolean isAllWorkDone() {

		boolean isDone = true;
		for (int index = 0; index < this.tasks.length; index++) {

			if (this.tasks[index] != null) {
				if (this.tasks[index].getWorkingHours() > 0) {

					isDone = false;
					break;
				}
			}
		}

		return isDone;
	}

}
