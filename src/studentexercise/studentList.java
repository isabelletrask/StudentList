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
public class studentList {
    public static void main(String [] args){
    
        Studentexercise [] studentList= new Studentexercise[2];
        Studentexercise s1 = new Studentexercise();
        s1.setName("Ronak");
        Studentexercise s2 = new Studentexercise();
        s2.setName("Sheth");
        studentList[0] =s1;
        studentList[1] =s2;
        
        for (Studentexercise s : studentList){
        System.out.println(s.getName());
        }
        
    }
    
}
