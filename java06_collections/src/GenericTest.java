
public class GenericTest<V> {
	private V name;
	public GenericTest() {
		
	}
	public void setName(V name) {
		this.name = name;
	}
	public V getName() {
		return name;
	}
}
//   new GenericTest<String>()
//   new GenericTest<Calendar>()