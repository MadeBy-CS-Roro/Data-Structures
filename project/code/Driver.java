public class Driver extends Person implements IDriver{
private String vehiclePlate;
private VehicleType vehicleType ;

Driver(int id,String name, String phoneNumber,String vehiclePlate,VehicleType vehicleType){
super(id,name,phoneNumber);
setVehiclePlate(vehiclePlate);
this.vehicleType=vehicleType;
}

public String getVehiclePlate(){
return vehiclePlate;}

public void setVehiclePlate(String VehiclePlate){
if(vehiclePlate==null||vehiclePlate.length()!=7)
throw new IllegalArgumentException("plate must 7 character");
for(int i=0;i<3;i++){
char c =vehiclePlate.charAt(i);
if(c<'A'||c>'Z')
throw new IllegalArgumentException("First 3 must be uppecase letters");

}

for(int i=3;i<7;i++){
char c =vehiclePlate.charAt(i);
if(c<'0'||c>'9')
throw new IllegalArgumentException("last 4 must be digit");

}
    this.vehiclePlate=vehiclePlate;
}

public VehicleType getVehicleType(){
return vehicleType;}

 public void setVehicleType(VehicleType vehicleType){
    this.vehicleType=vehicleType;
}

public int compareTo(IDriver other){
return getId()-other.getId();}

public String toString(){
return "Driver{id = "+getId()+" name + "+getName()+" plate = "+vehiclePlate+" type = "+ vehicleType;}
}