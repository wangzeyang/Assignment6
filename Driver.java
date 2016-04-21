import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s2=Integer.parseInt(JOptionPane.showInputDialog("please enter ther number of certain day"));
		Day day=new Day("");
		System.out.println("Current Days: "+day);
		System.out.println("Next Day: "+day.nextDay());
		System.out.println("Previous Day: "+day.previousDay());
		System.out.println("the caertain day is : "+day.calcuateDay(s2));
	}

}
