package tv;

public class TV {
    private boolean isTurnedOn;
    private String channel;
    private int volume;


    public TV(){
        isTurnedOn = false;
        channel = "0";
        volume = 10;
    }

    public void turnOnTurnOff(){
        if(isTurnedOn)
        {
            isTurnedOn = false;
            System.out.println("TV is turned off !");
        }else{
            isTurnedOn = true;
            System.out.println("TV is turned on !");
        }
    }

    public void increaseVolume(int volume){
        if(this.volume + volume > 100){
            this.volume = 100;
        }else{
            this.volume += volume;
        }

        System.out.println("Volume is set to : " + this.volume);
    }


    public void decreaseVolume(int volume){
        if(this.volume + volume < 0){
            this.volume = 0;
        }else{
            this.volume -= volume;
        }
        System.out.println("Volume is set to : " + this.volume);
    }


    public void setChannel(String newChannel){
        this.channel = newChannel;
        System.out.println("Channel Set to : " + newChannel);
    }




}
