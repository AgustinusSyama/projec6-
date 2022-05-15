/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

/**
 *
 * @author user
 */
public  interface Restoran {
    public void Memasak();
    public void melayani();

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        // TODO code application logic here
       Karyawan a = new Karyawan();
       a.masak();
       a.melayani();
       System.out.println("melayani masak lauk ");
       System.out.println("melayani masak sayur");
       System.out.println("melayani masak nasi");
       
        
    }
    
}