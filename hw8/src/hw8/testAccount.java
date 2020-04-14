package hw8;

/**
 * Using THE GUI Java Swing,
 * This Program uses the account Inheritance hierarchy.
 *  Along with the subclasses, abstract classes and polymorphism
 *  This program uses the Array List how our Instructor asked us to use.
 * 
 * @author Haroon Aziz
 * 
 * Objected-Oriented Programming Lewis University
 */


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class testAccount {

    public static void main(String[] args) {

    	for (int count = (Integer
				.parseInt(JOptionPane.showInputDialog
					("How Many Objects do you wish to enter:"))); count > 0; count--) {
    	ArrayList<Account> arrayList = new ArrayList<Account>();
    		
    	String whichObject=JOptionPane.showInputDialog("Services or Supplies?");
    	
    	if(whichObject.equalsIgnoreCase("services")) {
    		String id = JOptionPane.showInputDialog("Enter Account ID");
        	String rate = JOptionPane.showInputDialog("Enter Hours worked");
        	String hours = JOptionPane.showInputDialog("Enter Hourly Rate");
        	int idNum = Integer.parseInt(id);
        	int hoursWorked = Integer.parseInt(rate);
        	double rateNum = Double.parseDouble(hours);
        	arrayList.add(new Services(idNum,hoursWorked,rateNum));
        	
    	}
    	if(whichObject.equalsIgnoreCase("supplies")) {
    		String id = JOptionPane.showInputDialog("Enter Account ID");
        	String items = JOptionPane.showInputDialog("Enter Number of Items");
        	String price = JOptionPane.showInputDialog("Enter Price of an Item");
        	int idNum = Integer.parseInt(id);
        	int itemsNum = Integer.parseInt(items);
        	double priceNum = Double.parseDouble(price);
        	arrayList.add(new Supplies(idNum,itemsNum,priceNum));
        	
    	}
   
    	String out ="";
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
			Account a = arrayList.get(i);	
			out ="You have entered: "+whichObject+"\n"+ a;
		}
		JOptionPane.showMessageDialog(null, out, "Results", JOptionPane.INFORMATION_MESSAGE);
    	}
         
    }
}