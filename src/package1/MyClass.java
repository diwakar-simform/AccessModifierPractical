package package1;

public class MyClass {
    //instance variables
    public String myNickName;
    protected String myName;
    private int myAge;

    //setter methods
    public void setMyNickName(String x){
        this.myNickName = x;
    }

    public void setMyName(String y) {
        this.myName = y;
    }

    public void setMyAge(int z){
        if(z > 0 && z < 100){
            this.myAge = z;
        }
    }

    //getter methods
    public String getMyNickName(){
        return myNickName;
    }

    public String getMyName(){
        return myName;
    }

    public int getMyAge(){
        return myAge;
    }
}
