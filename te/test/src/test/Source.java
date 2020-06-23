package test;

class TypeException extends RuntimeException{
	
	public String toString() {
        return "Vehicle Type Not Set";
    }
    
}

class Vehicles{
    String type; 
    String model_no;
    String model_name;
    String owner_name;
    String owner_details;
    
    public Vehicles() {
		
		}
	public Vehicles(String type, String model_no, String model_name, String owner_name, String owner_details) {
	
		this.type = type;
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}
    public String getType() {
		return null;
	}
	
	public String retrieve() {
		return null;
	}
}

 class Car extends Vehicles{

	public Car() {
	
	}

	public Car(String type, String model_no, String model_name, String owner_name, String owner_details) {
		super(type, model_no, model_name, owner_name, owner_details);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 public String retrieve() {
		 String str = getType();
		 String con ;
	 if(str ==null) {
		 throw new TypeException();
	 }else {
		  con =str.concat(model_no).concat(model_name).concat(owner_details).concat(owner_name);
	 }
	return con;
	 }
}
public class Source
{
       public static void main(String args[])
       {
    	   Vehicles vlk = new Car("A-23", "122E05", "180 Pulsar", "Daniel", "A-23, Greater Kailash");
    	 System.out.println(vlk.retrieve());
    	   Vehicles  vlk1 = new Car(null, "122E05", "180 Pulsar", "Daniel", "A-23, Greater Kailash");
    	   System.out.println(vlk1.retrieve());
       }
}
