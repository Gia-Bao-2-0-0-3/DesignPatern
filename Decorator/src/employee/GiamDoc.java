package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class GiamDoc implements TaskBasic{
	private TaskBasic task;

    public GiamDoc(TaskBasic task) {
        this.task = task;
    }

    public void perform() {
        task.perform();
        System.out.println("Quyet dinh chien luoc, chi dao");
    }

	public GiamDoc() {
		super();
		// TODO Auto-generated constructor stub
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
}
