package Office;

public class Task {

	private String nameOfTask;
	private int workingHours;

	Task() {

		this.nameOfTask = "Default task";
		this.workingHours = 8;
	}

	public String getNameOfTask() {

		return this.nameOfTask;
	}

	public void setNameOfTask(String nameOfTask) {

		if (nameOfTask != null && !nameOfTask.equals("")) {

			this.nameOfTask = nameOfTask;
		}
	}

	public int getWorkingHours() {

		return this.workingHours;
	}

	public void setWorkingHours(int workingHours) {

		if (workingHours >= 0) {

			this.workingHours = workingHours;
		}
	}
}
