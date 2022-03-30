
public class App 
{
 public static void main(String[] args) {
  Model m = new Model(null,null,null);
  View v = new View("My View");
  Controller c = new Controller(m, v);
  c.initController();
 }
}