import javax.swing.JOptionPane;

public class Day {
	private String day;
	private String [] days ={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	
	public Day (String day){
		
		super();
		String s1=(String)JOptionPane.showInputDialog(null,"select the days","type",JOptionPane.QUESTION_MESSAGE,null,days,days[2]);
		
		this.day=s1;
		}
	public String daygetDay(){
		return day;
	}
	public void setDay(String day){
		this.day=day;
	}
	@Override
	public String toString() {
		return "Day [day=" + day + "]";
	}
	public String calcuateDay(int numOfDays){
		String message="";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex!=-1){
			message = days[(dayIndex+numOfDays)%7];
		}else{
			message="Invalid Day!";
		}
		return message;
		
	}
	public String nextDay(){
		
		return calcuateDay(1);
	}
public String previousDay(){
		
		return calcuateDay(6);
	}
	private int getDayIndex (String day){
		for(int i=0;i<days.length;i++){
			if(days[i]==this.day){
			return i;
			}
		}
		return -1;
	}
	
}
