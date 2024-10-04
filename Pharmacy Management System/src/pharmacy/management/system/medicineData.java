/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy.management.system;

import java.sql.Date;

/**
 *
 * @author Nowsin
 */
public class medicineData {
    
    private Integer medicineId;
    private String brand;
    private String productName;
    private String type;
    private String status;
    private Double price;
    private Date date;
    private String image;
    
    public medicineData (Integer medicineId, String brand ,String productName,
            String type, String status,
            Double price,String image, Date date){
        
        this.medicineId = medicineId;
        this.brand = brand;
        this.productName = productName;
        this.type = type;
        this.status = status;
        this.date = date;
        this.price = price;
        this.image = image;
    }
    
    public Integer getMedicineId(){
        return medicineId;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public String getType(){
        return type;
    }
    
    public String getStatus(){
        return status;
    }
    
     public Double getPrice(){
        return price;
    }
     
     public String getImage(){
         return image;
     }
     
      public Date getDate(){
        return date;
    }
}
