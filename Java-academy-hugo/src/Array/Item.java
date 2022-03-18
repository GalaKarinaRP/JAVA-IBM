package Array;

public class Item {	

		int id;
		String name;
		int price;
		
		public Item(int id, String name, int price) {
			
			this.id = id;
			this.name = name;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public static void main(String[] args) {		
			
			
			
			

		}	

		/*
		public static void sortProducts(Item[] itms) {
			Arrays.sort(itms);
			System.out.println(Arrays.toString(itms, Comparator<Item>(){
				@Override
				public int compare(Item o1, Item o2) {
					
				}
			}));
		}
		*/
	


}
