package animals;

public abstract class Animal {
String name;
String favoriteFood;
protected Animal(String name, String favoriteFood) {
	this.name = name;
	this.favoriteFood = favoriteFood;
}

public abstract String explainSelf();
}
