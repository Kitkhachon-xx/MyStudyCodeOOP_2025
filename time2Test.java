class Time2{
      //instant variable
      private int hour;
      private int minute;
      private int second;
      
      public Time2(){
      /** hour = 0;
       *            miunte = 0;
       *            second = 0;
       */
        
      }
      
      public Time2(int hour){
            this.hour = hour;
      }
      
      public Time2(int hour, int minute){
      
              this.hour = hour;
              this.minute = minute;
      }
      
      public Time2(int hour, int minute, int second){
              this.hour = hour;
              this.minute = minute;
              this.second = second;
      }
              
      
      //setter mutator 
      
      public void setHour(int hour){
          this.hour = hour;
      }
      
      public void setMinute(int minute){
          this.minute = minute;
      } 
      
      public void serSecond(int second){
          this.second = second;
      }
      
      public int getHour(){
          return hour;
      }
      
      public int getMinute(){
          return minute;
      }
      
      public int getSecond(){
          return second;
      }

      @Override
      public String toString(){
            return String.format("%02d:%02d:%02d" , hour, minute, second);
      }

}

public class time2Test{
    public static void main(String [] args){
        Time2 time = new Time2(); //default constructor
        Time2 time2 = new Time2(9);
        Time2 time3 = new Time2(10, 2);
        time2.setMinute(59);
        time3.serSecond(59);
        System.out.println(time3);

    }
}