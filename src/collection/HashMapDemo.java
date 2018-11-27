package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Player, String> map = new HashMap<Player, String>(); 
		map.put(new Player(1), "吃鸡");
		map.put(new Player(2), "英雄联盟");
		map.put(new Player(3), "英雄联盟");
		Player p = new Player(1);
		Player p1 = new Player(2);
		Player p2 = new Player(3);
		String game = map.get(p);
		System.out.println(game);
	}

}
class Player{
	int id;

	public Player(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
}