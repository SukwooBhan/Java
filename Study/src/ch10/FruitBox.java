package ch10;
import ch09.Apple;
import ch09.Banana;
public class FruitBox<T> {
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
