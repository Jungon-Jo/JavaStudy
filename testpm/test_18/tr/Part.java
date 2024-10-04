package testpm.test_18.tr;

public class Part {
	private String partName = null;
	private String className = null;
	private String partPro = null;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPartPro() {
		return partPro;
	}

	public void setPartPro(String partPro) {
		this.partPro = partPro;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}
	public void prt() {
		System.out.println(partName);
		System.out.println(className);
		System.out.println(partPro);
	}
}
