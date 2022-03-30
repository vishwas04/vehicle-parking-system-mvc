
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View 
{
 private JFrame frame;
 private JLabel nameLabel;
 private JLabel EmailLabel;
 private JLabel vehicleLabel;
 
 private JTextField nameTextfield;
 private JTextField emailTextfield;
 private JTextField VechicleTextfield;

//  private JButton nameSave;
//  private JButton emailSaveButton;
//  private JButton VehicleTextfield;
 private JButton save_as;
 private JButton clear;
 private JButton welcome;
 private JButton bye;

 public View(String title) {

  frame = new JFrame(title);
  frame.getContentPane().setBackground(Color.yellow);
  frame.getContentPane().setLayout(new BorderLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(600, 150);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);



  nameLabel = new JLabel("Name :");
  EmailLabel = new JLabel("EMAIL ID :");
  vehicleLabel = new JLabel("Vehicle No :");

  nameTextfield = new JTextField();
  emailTextfield = new JTextField();
  VechicleTextfield = new JTextField();

  // nameSave = new JButton("Save Name");
  // emailSaveButton = new JButton("Save EMAIL");
  // VehicleTextfield = new JButton("Save Vehicle");

  save_as = new JButton("Save & Show");
  clear = new JButton("Clear");
  welcome = new JButton("Entry");
  bye = new JButton("Exit");


  GroupLayout layout = new GroupLayout(frame.getContentPane());
  layout.setAutoCreateGaps(true);
  layout.setAutoCreateContainerGaps(true);
  layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addComponent(nameLabel)
    .addComponent(EmailLabel)
    .addComponent(vehicleLabel))
    .addComponent(welcome)

    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addComponent(nameTextfield)
    .addComponent(emailTextfield)
    .addComponent(VechicleTextfield)
    .addComponent(bye))
    

    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    // .addComponent(nameSave)
    // .addComponent(emailSaveButton)
    .addComponent(clear)
    .addComponent(save_as)));

    // .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    // .addComponent(welcome)
    // .addComponent(bye)));


  layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(nameLabel)
    .addComponent(nameTextfield))
    // .addComponent(nameSave)
    // .addComponent(welcome))

    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(EmailLabel)
    .addComponent(emailTextfield))
    // .addComponent(emailSaveButton)
    // .addComponent(bye))

    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(vehicleLabel)
    .addComponent(VechicleTextfield)
    .addComponent(clear))
    // .addComponent(VehicleTextfield)));
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(welcome)
    .addComponent(bye)
    .addComponent(save_as)));
  	
  // layout.linkSize(SwingConstants.HORIZONTAL, nameSave, emailSaveButton, VehicleTextfield);
  layout.linkSize(SwingConstants.HORIZONTAL, welcome, bye,save_as);
  frame.getContentPane().setLayout(layout);
 }
 
 public JFrame getFrame() {
  return frame;
 }
 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
//  public JLabel getNameLabel() {
//   return nameLabel;
//  }
//  public void setnameLabel(JLabel nameLabel) {
//   this.nameLabel = nameLabel;
//  }
//  public JLabel getEmailLabel() {
//   return EmailLabel;
//  }
//  public void setEmailLabel(JLabel EmailLabel) {
//   this.EmailLabel = EmailLabel;
//  }
//  public JLabel getVehicleLabel() {
// 	  return vehicleLabel;
// 	 }
// public void setvehicleLabel(JLabel vehicleLabel) {
// 	  this.vehicleLabel = vehicleLabel;
// 	 }

 public JTextField getnameTextfield() 
 {
  return nameTextfield;
 }
 public void setnameTextfield(JTextField nameTextfield) 
 {
  this.nameTextfield = nameTextfield;
 }
 public JTextField getemailTextfield() {
  return emailTextfield;
 }
 public void setemailTextfield(JTextField emailTextfield) {
  this.emailTextfield = emailTextfield;
 }
 public JTextField getVechicleTextfield() {
	  return VechicleTextfield;
}
public void setVechicleTextfield(JTextField VechicleTextfield) {
	  this.VechicleTextfield = VechicleTextfield;
}

//  public JButton getnameSave() {
//   return nameSave;
//  }
//  public void setnameSave(JButton nameSave) {
//   this.nameSave = nameSave;
//  }


//  public JButton getemailSaveButton() {
//   return emailSaveButton;
//  }
//  public void setemailSaveButton(JButton emailSaveButton) {
//   this.emailSaveButton = emailSaveButton;
//  }


 public JButton getTextfields()
{
  // JButton[ ] all = new JButton [3];
	return save_as;
}
// public void setTextfields(JButton VehicleTextfield) 
// {
// 	  this.VehicleTextfield = VehicleTextfield;
// }

public JButton getClear() {
  return clear;
 }

 public JButton getHello() {
  return welcome;
 }
 public void setHello(JButton welcome) {
  this.welcome = welcome;
 }


 public JButton getBye() {
  return bye;
 }
 public void setBye(JButton bye) {
  this.bye = bye;
 }
}