public class Person {

		private String gender = "F";
		private String name = "Sophia";
		private int height = 180; 
		private int weight = 75;
		private int age = 25;

		public String getgender() {
			return gender;
		}

		void setGender(String gender) {
			if (gender == "") {
				System.out.println("Поле gender пустое");
			} else this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		void setAge(int age) {
			if (age < 8) {
				System.out.println("Некорректный возраст");
			} else {
				this.age = age;
				System.out.println(this.age);
			}
		}

		public void move() {

		}

		public void sit() {
			System.out.println(name + " села");
		}

		public void run() {
			System.out.println(name + " бежит");
		}

		public void talk() {
			System.out.println(name + " говорит");
		}

		public void show(int field) {
			System.out.println(field);
		}
}