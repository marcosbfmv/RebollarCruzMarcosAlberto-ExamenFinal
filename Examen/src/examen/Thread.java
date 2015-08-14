/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author T-107
 */
public class Thread {

    private static void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
     
    
    public  void run(){
        while(true){
            Thread.sleep(250);
            System.out.println("thread");
        }
    }

    
}

    
    
    
    
    
    










/*public  void run(){
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Yo soy el tercer  thread");
            }catch(InterruptedException e){
                
            }
        }
    }
    




















/* public CrontraReloj() {
        initComponents();
        
        jLabel1.setText("Hola");
        
                Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                
                        while(true){
            try{
                Thread.sleep(1000);
                setSize(x,y);
                Calendar cal=Calendar.getInstance();
                int horas=cal.get(Calendar.HOUR);
                int minutos=cal.get(Calendar.MINUTE);
                int segundos=cal.get(Calendar.SECOND);
                
                jLabel1.setText(horas+":"+minutos+":"+segundos);
                //if(minutos==57)dispose();
                
                x=x+2;
                y=y+2; */