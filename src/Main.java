import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 800);
		fl.add(s1);
		Fruit s2 = new Fruit(102, "Banana", 1000);
		fl.add(s2);
		fl.add(new Fruit(103, "Pinapple", 5000));
		fl.add(new Fruit(104, "WaterMalon", 9000));
		fl.add(new Fruit(105, "Orange", 2000));
		fl.add(new Fruit(106, "plum", 500));
		fl.add(new Fruit(107, "Korean melon", 700));
		fl.add(new Fruit(108, "apricot", 900));
		fl.add(new Fruit(109, "pomegranate", 5500));
		fl.add(new Fruit(110, "persimmon", 6100));
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, Collections.reverseOrder());
		
		for(int i = 0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}
