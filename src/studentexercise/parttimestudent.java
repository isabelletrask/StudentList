/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentexercise;

/**
 *
 * @author izzyt
 */
public class parttimestudent extends studentList{
    private int numcourse;
    
    public parttimestudent(String name, String address, int numcourse){
//        super(name,address);
    this.numcourse = numcourse;
    }
    
    public int getNumCourse(){
    return numcourse;
    }
    public void setNumCourse(int numcourse){
    this.numcourse =numcourse;
    }

}
