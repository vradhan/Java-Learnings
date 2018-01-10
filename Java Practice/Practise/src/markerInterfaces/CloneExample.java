package markerInterfaces;

public class CloneExample implements Cloneable {

	private String lName;
	private String fName;
	
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String a[]) throws CloneNotSupportedException{
		CloneExample cloneOrg= new CloneExample();
		cloneOrg.setfName("vishnu");
		cloneOrg.setlName("radhan");
		CloneExample cloneCpy=(CloneExample)cloneOrg.clone();
		System.out.println("clone copy firstname"+cloneCpy.getfName());
		System.out.println("clone copy lastname"+cloneCpy.getlName());
	}
}
