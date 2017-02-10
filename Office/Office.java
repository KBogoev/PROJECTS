package Office;

public class Office {

	public static void main(String[] args) {

		// AllWork georgiAllwork = new AllWork();

		Task task1 = new Task();
		task1.setNameOfTask("Nova zadachka");
		task1.setWorkingHours(3);
		System.out.println(task1.getNameOfTask() + " za vreme ot " + task1.getWorkingHours() + " chasa");
		// georgiAllwork.addTask(task1);

		Task task2 = new Task();
		task2.setNameOfTask("Tva veche si e druga zadachka");
		task2.setWorkingHours(13);
		System.out.println(task2.getNameOfTask() + " za vreme ot " + task2.getWorkingHours());
		/// georgiAllwork.addTask(task2);

		Task task3 = new Task();
		task3.setNameOfTask("Treta zadacha");
		task3.setWorkingHours(6);
		System.out.println(task3.getNameOfTask() + " za vreme ot " + task3.getWorkingHours());
		// georgiAllwork.addTask(task3);

		System.out.println("--------------------");

		Employee gosho = new Employee("Georgi");
		gosho.setAllWork(new AllWork());
		gosho.getAllwork().addTask(task1);
		gosho.getAllwork().addTask(task2);
		gosho.getAllwork().addTask(task1);

		// System.out.println(gosho.getAllwork().getNextTask().getNameOfTask());
		/*
		 * gosho.setCurrentTask(gosho.getAllwork().getNextTask());
		 * System.out.println(gosho.getCurrentTask().getNameOfTask());
		 * System.out.println(gosho.isTaskReady());
		 */
		/*
		 * gosho.getCurrentTask().setWorkingHours(0);
		 * gosho.setCurrentTask(gosho.getAllwork().getNextTask());
		 * System.out.println(gosho.getCurrentTask().getNameOfTask()); //
		 * System.out.println(gosho.getAllwork().getNextTask().getNameOfTask());
		 */

		// int countWorkingDays = 0;
		do {

			if (gosho.getHoursLeft() == 0) {
				gosho.startWorkingDay();
				// countWorkingDays++;
			}

			// System.out.println("DEN " + countWorkingDays);
			gosho.work();
		//	System.out.println(gosho.getCurrentTask().getWorkingHours() );
			if (gosho.getAllwork().isAllWorkDone()) {

				break;
			}
		} while (true);
	}

}
