package basic;

public class DisplayFactory {


	private DisplayFactory(){
		
	}
	
	static Display getDisplay(int decide){
	
		if(decide==1){
		Input1 i1=new Input1();
		return i1;
		}
		if(decide==2){
		Input2 i2=new Input2();
		return i2;
			
		}
		else{
			return null;
		}
	
}
}
