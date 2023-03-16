package animals;

public class Dog extends Animal{

	protected Dog(String name, String favoriteFood) {
		super(name, favoriteFood);
	}
	
	@Override
	
	public String explainSelf() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("I am %s and my favourite food is %s", name, favoriteFood))
		.append(System.lineSeparator())
		.append("DJAAF");
		return sb.toString();
	}
}
