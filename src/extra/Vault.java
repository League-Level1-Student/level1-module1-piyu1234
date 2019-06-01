package extra;

public class Vault {
	String Coding;

	Vault(String Coding) {
		this.Coding = Coding;

	}

	boolean tryCode(String Coding) {
		if (this.Coding.equals(Coding)) {
			return true;
		} else {
			return false;
		}
	}

public static void main(String[] args) {
Vault Key= new Vault("858");
if(Key.tryCode("858"))  {	
System.out.println("How are you?");	
}
else {
System.out.println("Bye");
}
}
}
