
public class Handphone {
    
    public String merk;
   public int tahun_pembuatan;
    
public void setDataHP( String Merk, int tahun_pembuatan){
    this.merk = merk;
    tahun_pembuatan = tahun_pembuatan;
}

    public String getmerk_HP(){
        return merk;
    }

public int getTahun_Pembuatan(){  
  return  tahun_pembuatan;
    
}

    public static void main (String[]args){
        Handphone hp = new Handphone();
        hp.getDatahp("Vivo",2021);
        System.out.println ("Merk Handphone : " + hp.getMerkHp());
                
       System.out.println("Tahun Handphone : " + hp.getTahun());
    }

    private void getDatahp(String vivo, int i) {
        throw new UnsupportedOperationException(""); 
    }

    private String getMerkHp() {
        throw new UnsupportedOperationException(""); 
    }

    private String getTahun() {
        throw new UnsupportedOperationException(""); 
    }
   }


    
 
        
        
        

  
    


    
    
        
        
    

   
        



    
    
    

