package Com.Model;
import java.util.List;

public class Customer 
{
	private int cId;
	private String cName;
	private String cAddress;
	private long cMob;
	private List<Product> lst;

	public Customer(int cId, String cName, String cAddress, long cMob, List<Product> lst) 
	{
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.cMob = cMob;
		this.lst = lst;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public long getcMob() {
		return cMob;
	}

	public List<Product> getLst() {
		return lst;
	}

	public void setLst(List<Product> lst) {
		this.lst = lst;
	}	
}
