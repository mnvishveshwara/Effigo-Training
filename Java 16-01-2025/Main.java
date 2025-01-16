import java.util.Arrays;

public class Main {
    private String name;
    private String nationality;
    private String dob;
    private String[] passport;
    private int seatNumber;

    public Main(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dob=dateOfBirth;
        this.seatNumber=seatNumber;
        this.passport= new String[3];
    }


    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);

    }

    public String getName(){
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDob(){
        return this.dob;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void setPassport(){
        passport[0] = name;
        passport[1]= nationality;
        passport[2]= dob;

    }
    public void setName(String name){
        this.name = name;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setSeat(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public boolean applyPassport(){
        int num= (int) (Math.random()*2);
        if(num==0){
            return false;
        }
        return true;
    }

    public int chooseSeat(){
        int num = (int) (Math.random()*11+1);
        this.seatNumber=num;
        return num;
    }

}
