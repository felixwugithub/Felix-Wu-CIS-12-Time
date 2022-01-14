public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour < 24 && hour >= 0){
        this.hour = hour;}else{
            this.hour = 0;
        }if(minute < 60 && minute >= 0){
        this.minute = minute;}else{
            this.minute = 0;
        }if(second < 60 && second >= 0){
        this.second = second;}else{
            this.minute = 0;
        }

    }

    /*
    Requires: int newHour where newHour < 24 && newHour >= 0
    Modifies: hour
    Purpose:  set the hour of the object to the specified int value
     */
    public void setHour(int newHour){
        if(newHour < 24 && newHour >= 0){
            hour = newHour;
        }else{
            hour = 0;}
    }

    /*
   Requires: int newMinute where newMinute < 60 && newMinute >= 0
   Modifies: minute
   Purpose:  set the minute of the object to the specified int value
    */
    
    public void setMinute(int newMinute){
        if(newMinute < 60 && newMinute >= 0){
            minute = newMinute;
        }else{
            minute = 0;}
    }

    /*
 Requires: int newSecond where newSecond < 60 && newMinute >= 0
 Modifies: second
 Purpose:  set the second of the object to the specified int value
  */

    public void setSecond(int newSecond){
        if(newSecond < 60 && newSecond >= 0){
            second = newSecond;
        }else{
            second = 0;
        }
    }

    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}


    /*
    Requires:
    Modifies: second, (minute & hour when necessary)
    Purpose:  increments the clock one second to the future
     */
    public Clock nextSecond(){
        second++;
        if(second >= 60){
            minute++;
            second = 0;
            if(minute >= 60){
                hour++;
                minute = 0;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    /*
    Requires:
    Modifies: second, (minute & hour when necessary)
    Purpose:  rewind the clock one second backwards
     */
    public Clock previousSecond(){
        second--;
        if(second < 0){
            minute--;
            second = 59;
            if(minute < 0){
                hour--;
                minute = 59;
                if(hour < 0){
                    hour = 23;
                }
            }
        }
        return this;
    }


    /*
    Requires:
    Modifies:
    Purpose: Prints out the clock in proper HH:MM:SS format to console

     */
    public String toString(){
        String time = "";
        String HOUR = "";
        String MINUTE = "";
        String SECOND = "";

        HOUR = Integer.toString(hour);
        if(HOUR.length()==1){
            HOUR = "0" + HOUR;
        }
        MINUTE = Integer.toString(minute);
        if(MINUTE.length()==1){
            MINUTE = "0" + MINUTE;
        }
        SECOND = Integer.toString(second);
        if(SECOND.length()==1){
            SECOND = "0" + SECOND;
        }

        time = HOUR + ":" + MINUTE + ":" + SECOND;
        return time;
    }
}
