package __Object;

public class MyDogList {
	Dog[] d = new Dog[5];
	MyDogList() {
		System.out.println("-- 도구 관리 --");
		System.out.println(d[0]);
		if(d[0]!=null) {
			System.out.println(d[0]);
		}
		d[1]=new Dog();
		System.out.println(d[1]);
		d[2]=d[1];
		System.out.println(d[2]);
		d[3]=new Dog();
		System.out.println(d[3]);
		Dog dd = new Dog();
		d[4]=dd;
		System.out.println(dd);
		System.out.println(d[4]);
		d[1].name="abc";
		System.out.println(d[1].name);
		System.out.println(d[2].name);
		System.out.println(d[3].name);
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(d[i].name);
		}
	}
}
