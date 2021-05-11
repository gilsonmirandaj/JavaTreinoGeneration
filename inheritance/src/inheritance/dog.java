package inheritance;

public class dog extends Animals{
	private String run;

	public String getRun() {
		System.out.println("O animal corre.");
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
}
