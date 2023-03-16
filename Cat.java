package animals;

public class Cat extends Animal {
	

	protected Cat(String name, String favoriteFood) {
		super(name, favoriteFood);
	}
@Override
public String explainSelf() {
	StringBuilder sb = new StringBuilder();
	sb.append(String.format("I am %s and my favourite food is %s", name, favoriteFood))
	.append(System.lineSeparator())
	.append("MEEOW");
	return sb.toString();
}

}
