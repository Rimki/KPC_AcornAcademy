package java_homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class MemberManagementDemo {

	//5월 22일 숙제 콘솔프로그램만들기
	private ArrayList<Member> list = new ArrayList<Member>();

	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}

	public void run(String inputData) {
		// TODO Auto-generated method stub
		if (inputData.equals("1")) {
			insert();
		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("다시 입력해주세요.");
			print();
			String inputData1 = input("번호를 선택하세요>");
			run(inputData1);
		}
	}

//	1.아이디를 입력받는다.
//	2.이름을 입력받는다.
//	3.ArrayList에 고객을 추가한다.
//	4.ArrayList에 있는 모든 고객을 출력한다.
//	5.print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
//	6.번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {
		// TODO Auto-generated method stub
		String id = input("아이디>");
		String name = input("이름>");

		Member m = new Member(id, name);
		list.add(m);

		for (Member mem : list) {
			System.out.printf("아이디: %s , 이름 : %s \n", mem.getId(), mem.getName());
		}

		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}

//	1.수정할 아이디를 입력받는다.
//	2.ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고,
//	  ArrayList에 고객정보를 수정한다. 만약,수정할 아이디가 없으면 "수정할 아이디가 없습니다." 메세지를 출력한다.
//	3.ArrayList에 있는 모든 고객을 출력한다.
//	4.print() 메서드 호출
//	5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		// TODO Auto-generated method stub
		String id = input("아이디>");
		String name = null;
		int count = 0;

		for (Member mem : list) {
			if (mem.getId().equals(id)) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("아이디를 찾았습니다.");
			name = input("이름>");
			for (Member mem : list) {
				if (mem.getId().equals(id)) {
					mem.setName(name);
				}
			}
			System.out.println("수정이 완료되었습니다.");
		}
		else
			System.out.println("수정할 아이디가 없습니다.");

		for (Member mem : list) {
			System.out.printf("아이디: %s , 이름 : %s \n", mem.getId(), mem.getName());
		}

		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}

//	1.삭제할 아이디를 입력받는다.
//	2.ArrayList의 Member 객체 중에서 삭제할 아이디를 찾아 있으면 삭제하고 없으면 "삭제할 아이디가 없습니다."
//	메세지를 출력한다.
//	3.ArrayList에 있는 모든 고객을 출력한다.
//	4.print() 메서드 호출
//	5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		// TODO Auto-generated method stub
		String id = input("아이디>");
		int beforeSize = list.size();

		list.removeIf(new Predicate<Member>() {
			@Override
			public boolean test(Member m) {
				// TODO Auto-generated method stub
				return m.getId().equals(id);
			}
		});

		int afterSize = list.size();
		if (beforeSize != afterSize)
			System.out.println("삭제가 완료되었습니다.");
		else
			System.out.println("삭제할 아이디가 없습니다.");

		for (Member mem : list) {
			System.out.printf("아이디: %s , 이름 : %s \n", mem.getId(), mem.getName());
		}

		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}

//	1.검색할 아이디를 입력받는다.
//	2.ArrayList에 Member 객체중에서 검색할 아이디를 찾아 있으면 출력하고 없으면 "검색된 결과가 없습니다."
//	메세지를 출력한다.
//	3.ArrayList에 있는 모든 고객을 출력한다.
//	4.print() 메서드 호출
//	5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {
		// TODO Auto-generated method stub
		String id = input("아이디>");
		String name = null;
		for (Member mem : list) {
			if (mem.getId().equals(id)) {
				name = mem.getName();
			}
		}
		if (name != null)
			System.out.printf("검색한 아이디에 대한 이름은 %s입니다.\n", name);
		else
			System.out.println("검색된 결과가 없습니다.");

		for (Member mem : list) {
			System.out.printf("아이디: %s , 이름 : %s \n", mem.getId(), mem.getName());
		}

		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}

	public String input(String msg) {
		// TODO Auto-generated method stub
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();// 키보드에서 입력한 데이터를 반환해준다.
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}
}
