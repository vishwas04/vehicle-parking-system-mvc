public class Model 
{
 private String name;
 private String email;
 private String vehicle;
 public Model(String name, String email, String vehicle) {
  this.name = name;
  this.email = email;
  this.vehicle = vehicle;
 }
 public String getName() {
  return name;
 }
 public void setname(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }
 public void setemail(String email) {
  this.email = email;
 }
 
 public String getVehicle() {
	  return vehicle;
}
public void setvehicle(String vehicle) {
	  this.vehicle = vehicle;
}
}

