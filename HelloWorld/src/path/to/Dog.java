package path.to;

import lesson1_19.Lesson1_19dog.Animal;

public record Dog() {
	public static void main(String[] args) {

		 // Q1：フィールドに動物の名前の変数を定義してください。
		 String animalName;

		 // Q2：フィールドに動物の数の変数を定義してください。
		 int numberOfAnimals;

		 // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		 Animal dog = new Animal("犬");

		 // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		 Animal cat = new Animal("猫", 3); // 3匹の猫を生成

		}

		class Animal {
		    
		    // Q1
		    private String name;

		 // Q2
		 private int number;

		 // Q3
		 public Animal(String name) {
		  this.name = name;
		 }

		 // Q4
		 public Animal(String name, int number) {
		  this.name = name;
		  this.number = number;
		 }
		}
}
}
