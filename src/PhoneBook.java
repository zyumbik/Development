import sun.jvm.hotspot.types.WrongTypeException;

import java.util.*;

class Person {
	private String name;
	private String phoneNumber;

	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

}

public class PhoneBook {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String name;
		int choice, index;

		while (true) {
			System.out.print("Enter command: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				//menu commands list
				System.out.println("\n***\n 0. List of commands\n 1. New contact\n 2. Change name\n 3. Remove contact\n 4. Sort contacts by name\n 5. Show contact list\n***\n");
				break;
			case 1:
				//new person
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter phone: ");
				list.add(new Person(name, sc.next()));
				break;
			case 2:
				//change name
				try {
					System.out.println("Element index: ");
					index = sc.nextInt();
					System.out.println("Current name: " + list.get(index).getName() + "\nNew name: ");
					list.get(index).changeName(sc.next());
				} catch (IndexOutOfBoundsException e) {
					System.out.println("There is no such element!");
				} catch (WrongTypeException w) {
					System.out.println("You are supposed to enter numbers only");
				}
				break;
			case 3:
				//delete a contact
				try {
					System.out.println("Element index: ");
					index = sc.nextInt();
					list.remove(index);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("There is no such element!");
				} catch (WrongTypeException w) {
					System.out.println("You are supposed to enter numbers only");
				}
				break;
			case 4:
				//sort by name
				Collections.sort(list, new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				System.out.println("List sorted");
				break;
			case 5:
				//output list
				System.out.println("\nContact list: \n Name —— Phone");
				for (Person item:list) {
					System.out.println(" " + item.getName() + " —— " + item.getPhoneNumber());
				}
				System.out.println();
				break;
			default:
				System.exit(0);
				break;
			}
		}


	}

}
