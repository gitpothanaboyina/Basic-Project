package contactapp;

public class Contact {
	
	int a;
	public Contact() {
		a=0;
	}
	
	public  Contact(String name,String number){
		this.name=name;
		this.number=number;
		a=1;
	}

		private String name;
		private String number;
		private Address addr=null;
		
		public void setPartValues(){
			if(a==0){
			this.name="Manjeeth Kumar";
			this.number="9949598599";
			}
			System.out.println(this);
		}
		
		public void setFullValues(){
			if(a==0){
			this.name="Sai Ram";
			this.number="9700684651";
			}
			addr=new Address();
			addr.setCity("Hyderabad");
			addr.setStreet("Asif Nagar");
			System.out.println(this);
		}

		@Override
		public String toString() {
			return "Contact [name=" + name + ", number=" + number + ", addr="
					+ addr + "]";
		}
		
		
}
