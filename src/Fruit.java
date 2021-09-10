import java.util.Comparator;

public class Fruit implements Comparator<Fruit>{
	int no;
	String name;
	int price;

	public Fruit(int i, String string, int j) {
		no = i;
		name = string;
		price = j;
	}
	
	
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}

}

