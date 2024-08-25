class Computer {
    public void playMusic()
    {
        System.out.println("Playing Music");
    }

    public String getMePen(int cost)
    {
        if(cost >= 10)
        {
            return "Pen";    
        }
        return "Nothing";
    }
}

public class Methods {
    public static void main(String a[]){
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMePen(3));
    }
}
