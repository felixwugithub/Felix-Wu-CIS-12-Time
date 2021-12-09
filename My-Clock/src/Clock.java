public class Clock {
    private int hour;
    private int minute;
    private int second;


    //ignores incorrect construction
    public Clock(int hour, int minute, int second) {

        if (hour < 60){
        this.hour = hour;}

        if(minute < 60){
        this.minute = minute;}

        if(second < 60){
        this.second = second;}

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

    public String nextSecond(){
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
        return this.toString();
    }

    public String previousSecond(){
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
        return this.toString();
    }

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
