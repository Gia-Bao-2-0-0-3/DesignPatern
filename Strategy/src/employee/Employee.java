/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
package employee;

public class Employee {
	private TaskStrategy taskStrategy;

    public void setTaskStrategy(TaskStrategy taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    public void performTask() {
        taskStrategy.executeTask();
    }

	/**
	 * @return the taskStrategy
	 */
	public TaskStrategy getTaskStrategy() {
		return taskStrategy;
	}

	public Employee(TaskStrategy taskStrategy) {
		super();
		this.taskStrategy = taskStrategy;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
