
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException; 
import java.io.FileWriter;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.*;

public class Controller 
{
 private Model model;
 private View view;
 public Controller(Model m, View v) 
 {
  model = m;
  view = v;
  initView();
 }

 public void initView() 
 {
    JOptionPane.showMessageDialog(null,"WELCOME TO PES-PARKING" );
    if(model.getName() != null || model.getEmail() != null || model.getVehicle() != null )
    {
      view.getnameTextfield().setText(model.getName());
      view.getemailTextfield().setText(model.getEmail());
      view.getVechicleTextfield().setText(model.getVehicle());
    }
    else 
    {
      view.getnameTextfield().setText("");
      view.getemailTextfield().setText("");
      view.getVechicleTextfield().setText("");
    }
 }
 public void initController() 
 {
  view.getTextfields().addActionListener(e -> saveall());
  view.getClear().addActionListener(e -> clearall());
  view.getHello().addActionListener(e -> sayHello());
  view.getBye().addActionListener(e -> sayBye());
 }


 private void saveall() 
 {
  model.setemail(view.getemailTextfield().getText());
  if(view.getVechicleTextfield().getText().equals("") || view.getnameTextfield().getText().equals("") )
  {
    JOptionPane.showMessageDialog(null, "Vehicle No. and Name is compulsory");
  }
  else
  {
    model.setvehicle(view.getVechicleTextfield().getText());
    model.setname(view.getnameTextfield().getText());
    JOptionPane.showMessageDialog(null, "Vehicle No."+model.getVehicle()+"\nName:"+model.getName()+"\nEmail"+model.getEmail());
  } 
  
  
}
private void clearall() 
{
  view.getnameTextfield().setText("");
  view.getemailTextfield().setText("");
  view.getVechicleTextfield().setText("");
}






private void sayHello() 
{
  if(!view.getVechicleTextfield().getText().equals(model.getVehicle()) || 
  !view.getemailTextfield().getText().equals(model.getEmail()) || 
  !view.getnameTextfield().getText().equals(model.getName()) )
  {
      JOptionPane.showMessageDialog(null, "PLEASE Save All entries");
  }
   else
  {
    String last="", line;
    try
    {
      FileReader fr= new FileReader("a.txt");    
      BufferedReader input = new BufferedReader(fr);
      while ((line = input.readLine()) != null) { 
          last = line;
      }
    }
    catch(IOException e) 
    {
    }
    String last_Arr[] = new String[4];
    int t=1;
    if(!last.equals(""))  
    {
      last_Arr = last.split(" ");
      // System.out.println(last_Arr[0]+last_Arr[1]+last_Arr[2]+last_Arr[3]);
      t=Integer.parseInt(last_Arr[3])+1;
    }
    
    try(FileWriter fw = new FileWriter("a.txt", true);BufferedWriter bw = new BufferedWriter(fw);PrintWriter out = new PrintWriter(bw))
      {
        if(model.getName().equals(last_Arr[0]) || model.getEmail().equals(last_Arr[1]) || model.getVehicle().equals(last_Arr[2]))
        {
          JOptionPane.showMessageDialog(null, "Same as before entry");
        }
        else
        {
          out.println(model.getName() + " " + model.getEmail() +" " + model.getVehicle()+" "+t);
          JOptionPane.showMessageDialog(null,"TOKEN No-" + t + "\nEntering...." + model.getName() + " " + model.getEmail());
        }
      } 
      catch (IOException e) 
      {
      }
  } 
}



private void sayBye() 
 {
  System.exit(0);
 }


}













// private void saveName() 
// {
//   if(view.getnameTextfield().getText().equals("") )
//   {
//     JOptionPane.showMessageDialog(null, "PLEASE Enter Name");
//   }
//   else
//   {
//   model.setname(view.getnameTextfield().getText());
//   // JOptionPane.showMessageDialog(null, "Name saved : " + model.getName(), "Info", JOptionPane.INFORMATION_MESSAGE);
//   } 
//   saveEmail();

// }


// private void saveEmail()
// {
//   model.setemail(view.getemailTextfield().getText());
// }
