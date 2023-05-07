package test.package1;




	
	public class ClassesDemo{
		
		// Atributes / properties
		String name;
		int age;
		String address;
		
		// constructor of Student
		
		 public ClassesDemo(String name,int age, String address )
		{
			this.name=name;
			this.age= age;
			this.address=address;
		}
		
		public ClassesDemo(String name,int age)
		{
			this.name=name;
			this.age= age;
			this.address="Warsow";  // default value
		}
		
		
		
		
		// Set method
		public void SetName(String Name)
		{
			this.name=Name;
		}
		
		public void SetAge(Integer Age)
		{
			this.age=Age;
		}
		
		public void SetAddress(String Address)
		{
			this.address=Address;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public int getAge()
		{
			return this.age;
		}
		
		public String getAddress()
		{
			return this.address;
		}
		
		public void Print()
		{
			System.out.println(getName() + " " + getAge() + " " + getAddress());
		}
	
	
	public static void main(String[] arg)
	{
		ClassesDemo John= new ClassesDemo("Jamal",21,"Lodz");
		John.Print();
		ClassesDemo Ann= new ClassesDemo("Ann",22);
		Ann.Print();
		Ann.SetAddress("Krakow");
		Ann.Print();
		
		
		
	}

}
