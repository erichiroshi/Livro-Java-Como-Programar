package capitulo_05.ex_5_30;

public class AutoPolicy {

	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.setAccountNumber(accountNumber);;
		this.setMakeAndModel(makeAndModel);
		this.setState(state);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {

		if (state == "CT" || state == "ME" || state == "NH" || state == "VT" || state == "MA" || state == "NJ"
				|| state == "NY" || state == "PA") {
			this.state = state;

		} else {
			System.out.println("ERRO");

		}
	}

	public boolean isNoFaultState() {
		boolean noFaultState;
		switch (getState()) {
		case "CT":
		case "ME":
		case "NH":
		case "VT":
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;

		}

		return noFaultState;
	}

}
