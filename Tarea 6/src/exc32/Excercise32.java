package exc32;

public class Excercise32 
{

	public static void main(String[] args) 
	{
		System.out.println("Max weight box:");
		MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak\n\n")));
        
        System.out.println("One thing box:");
        OneThingBox box1 = new OneThingBox();
        box1.add(new Thing("Saludo", 5));
        box1.add(new Thing("Pirkka", 5));
        System.out.println(box1.isInTheBox(new Thing("Saludo")));
        System.out.println(box1.isInTheBox(new Thing("Pirkka\n")));
        
        System.out.println("Black hole box:");
        BlackHoleBox box2 = new BlackHoleBox();
        box2.add(new Thing("Saludo", 5));
        box2.add(new Thing("Pirkka", 5));
        System.out.println(box2.isInTheBox(new Thing("Saludo")));
        System.out.println(box2.isInTheBox(new Thing("Pirkka")));
	}

}


