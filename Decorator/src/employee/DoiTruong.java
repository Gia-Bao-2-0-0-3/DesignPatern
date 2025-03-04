package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class DoiTruong implements TaskBasic {
	private TaskBasic task;

    public DoiTruong(TaskBasic task) {
        this.task = task;
    }

    public void perform() {
        task.perform();
        System.out.println("Di tuan, gan viec cho nhan vien");
    }

	/**
	 * @return the task
	 */
	public TaskBasic getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(TaskBasic task) {
		this.task = task;
	}

	public DoiTruong() {
		super();
		// TODO Auto-generated constructor stub
	}
}
