package Day04;

//Java�� �ֻ��� Ŭ������ Object
//����� ���� Ŭ���� ���� �� �׻� Object Ŭ������ ��ӹ��� Ŭ������ ����
//extends Object Ű���尡 ������ ����
//Object Ŭ�������� �����ϴ� �޼ҵ�� �������̵��Ͽ� ���
public class PhoneInfo {
	String name;
	String phoneNumber;
	String birthDay;
	
	PhoneInfo() {
		
	}
	
	PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	PhoneInfo(String name, String phoneNumber, String birthDay) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDay = birthDay;
	}
	
	public void showPhoneInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
		System.out.println("������� : " + this.birthDay);
	}

	@Override
	//Object Ŭ�������� �����ϴ� �޼ҵ�
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + ", birthDay=" + birthDay + "]";
	}
}