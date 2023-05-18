package sg.edu.rp.c346.id22020995.mymodules;

import android.annotation.SuppressLint;

public class Module {
    // create object values
    private String code;
    private String name;
    private int year;
    private int semester;
    private int credit;
    private String venue;

    // object constructor
    public Module(String code, String name, int year, int semester, int credit, String venue) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.credit = credit;
        this.venue = venue;
    }

    // get values from object
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getSemester(){
        return semester;
    }
    public int getCredit(){
        return credit;
    }
    public String getVenue(){
        return venue;
    }

    // display object info
    public String display(){
        String display = String.format("Module Code: %s \nModule Name: %s \nAcademic Year: %d \nSemester: %d \nCredit: %d \nClassroom: %s",
                code,name,year,semester,credit,venue);
        return display;
    }
}
