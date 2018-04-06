

public class Preference {
 int quietTime;
 int music;
 int reading;
 int chatting;
 public Preference(int qt, int m, int r, int c){

	 
	 quietTime=qt;
	 music=m;
	 reading=r;
	 chatting=c;
	 
 }
 public void setQuietTime(int qt){
	 quietTime = qt;
 }

 public void setMusic(int m){
	 music = m;
 }
 
 public void setReading(int r){
	 reading = r;
 }

 public void setChatting(int c){
	 chatting = c;
 }
 
 public int getQuietTime(){
	 return quietTime;
 }
 public int getMusic(){
	 return music;
 }
 public int getReading(){
	 return reading;
 }
 public int getChatting(){
	 return chatting;
 }
 
 public int compare(Preference pref){
	 int diff = Math.abs(this.getQuietTime() - pref.getQuietTime()) + Math.abs(this.getMusic() - pref.getMusic()) + Math.abs(this.getReading() - pref.getReading()) + Math.abs(this.getChatting() - pref.getChatting());
	 return diff;
 }
 
 
}
/*
Preference
Write a Preference class that records preferences for different types
of activities:
• quiet Time
• music
• reading
• chatting
Each of these is of type int and must contain values in the range 0 to
10 (inclusive). 0 means the person hates the activity. 10 means the
person loves the activity. The class Preference should have at least
the following methods:
• a constructor, which sets the instance variables to their
appropriate input parameters (4 inputs)
//• Accessor methods for each of the 4 instance variables
• compare(Preference pref) method that returns the difference
between oneself and the Preference input parameter, pref.
o Sum of absolute value of the differences in the 4 activities. 
 */
