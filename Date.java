public class Date {
	
		int year;
		int month;
		int day;
	
	public Date(int m, int d, int y) {
		year = y;
		month = m;
		day = d;
	}
	
	public void setMonth(int m){
		month =m;
	}
	public void setYear(int y){
		year =y;
	}
	public void setDay(int d){
		day =d;
	}
	
		public int getMonth(){
			
			return month;
			
		}
		public int getDay(){
			
			return day;
		}

		public int getYear(){
			
			return year;
		}
		
		public int dayOfYear() { 
			int totalDays = 0;
			switch (month) { 
			case 12: totalDays += 30; 
			case 11: totalDays += 31; 
			case 10: totalDays += 30; 
			case 9 : totalDays += 31; 
			case 8 : totalDays += 31; 
			case 7 : totalDays += 30; 
			case 6 : totalDays += 31; 
			case 5 : totalDays += 30; 
			case 4 : totalDays += 31; 
			case 3 : totalDays += 28; 
			case 2 : totalDays += 31;
			}
			totalDays += day;
			return totalDays;
		}

		public int compare(Date dt){
			int yearDiff = Math.abs(this.getYear()-dt.getYear());
			int day = Math.abs(this.dayOfYear()-dt.dayOfYear())+365*yearDiff;
			
			int difference = day/30;
			
			if(difference>60)
				return 60;
			return difference;
			
		}
}
