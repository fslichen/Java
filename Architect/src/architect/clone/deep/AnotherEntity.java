package architect.clone.deep;

import java.io.Serializable;

public class AnotherEntity implements Cloneable {
	private String gender;

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "AnotherEntity [gender=" + gender + "]";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
		return super.clone();
    }
	
}
