import java.util.ArrayList;
import java.util.Scanner;

class Pupil {
	private String name, surname;
	private int[] marks = new int[3];

	public Pupil(String name, String surname, int[] marks) {
		this.name = name;
		this.surname = surname;
		this.marks = marks;
	}


	public double getAverage () {
		return (marks[0] + marks[1] + marks[2]) / 3;
	}

	public String getFullName() {
		return name + " " + surname;
	}

}

public class First {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//top 3 pupil
		Pupil[] top = new Pupil[3];
		//lists for pupil with the same results as top ones
		ArrayList<Pupil> first = new ArrayList();
		ArrayList<Pupil> second = new ArrayList();
		ArrayList<Pupil> third = new ArrayList();
		while (true) {
			//for checking if the new pupil is eligible for being in top
			Pupil temp = new Pupil(sc.next(), sc.next(), new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()});

			//быдлокод
			if (top[0] == null) {
				top[0] = temp;
			} else if (top[1] == null) {
				if (top[0].getAverage() < temp.getAverage()) {
					top[1] = top[0];
					top[0] = temp;
				} else {
					top[1] = temp;
				}
			} else if (top[2] == null) {
				if (top[0].getAverage() < temp.getAverage()) {
					top[2] = top[1];
					top[1] = top[0];
					top[0] = temp;
				} else if (top[1].getAverage() < temp.getAverage()) {
					top[2] = top[1];
					top[1] = temp;
				} else {
					top[2] = temp;
				}
			} else {
				//initialize top[] or check if null
				if (top[0].getAverage() < temp.getAverage()) {
					top[2] = top[1];
					top[1] = top[0];
					top[0] = temp;
				} else if (top[1].getAverage() < temp.getAverage()) {
					top[2] = top[1];
					top[1] = temp;
				} else if (top[2].getAverage() < temp.getAverage()) {
					top[2] = temp;
				}
				//result
				for (int i = 0; i < top.length; i++) {
					System.out.println(top[i].getFullName());
				}
			}



		}

	}

}
