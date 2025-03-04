package employee;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 4, 2025
 * @version: 1.0
 */
public class Employee {
	private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void showTask() {
        state.handleTask();
    }

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(State state) {
		super();
		this.state = state;
	}
    
}
