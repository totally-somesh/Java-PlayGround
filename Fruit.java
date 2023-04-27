package P1;
/*Day 1
0. After the combined lab session ,
please download javadocs
https://www.oracle.com/java/technologies/javase-jdk11-doc-downloads.html

1. Go through today's sequence.txt
Revise n brush up on all mentioned concepts.

2. Solve this
5.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
Use tight encapsulation.

5.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean

5.3 Add suitable constructors.

5.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )

5.5 Add a taste() method : public String taste()

For Fruit : Can you identify taste of any general fruit ?
So will you add a taste() with this definition : returns "no specific taste" OR can u apply abstraction?

Apple : should return  "sweet n sour"
Mango : should return  "sweet"
Orange : should return  "sour"

5.6 Add specific functionality , in the sub classes
In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}


5.7 Add all of above classes under the package "com.app.fruits"
5.8 Create java application FruitBasket , with main method , as a tester , in com.app.tester package.
5.9 Prompt user for the basket size n create suitable data structure

5.10 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.

4. Display names of all fruits in the basket.

5. Display name,color,weight , taste of all fresh fruits , in the basket.


6. Mark a fruit in a basket , as stale(=not fresh)
i/p : index 
o/p : error message (in case of invalid index) or mark it stale

7. Mark all sour fruits stale 
Hint : Use equals() method of the String class.

8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

10. Exit 
*/

public abstract class Fruit {

	private String name;
	private String colour;
	private double weight;
	private boolean fresh;
	private static int CounterId = 0;
	private int id;

	public abstract String taste();

	public Fruit(String name, String colour, double weight) {

		CounterId++;
		this.id = CounterId;
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.fresh = true;
	}

	@Override
	public String toString() {
		return " | Name : " + name + " | Colour : " + colour + " | Weight : " + weight + " | Fresh : " + fresh;
	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public double getweight() {
		return weight;
	}
	
	public int getid() {
		return id;
	}

	public boolean getFresh() {
		return fresh;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setFresh() {
		this.fresh = false;
	}
}
