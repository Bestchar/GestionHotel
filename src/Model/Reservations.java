
package Model;
import Model.ClientM;
import Model.Connect;
import Vu.Client;

import java.util.Date;

/**
 *
 * @author charles_4545
 */
public class Reservations {
    private Date date_reserver;
    private Date date_Arriver;
    private Date date_depart;
    private int validiter;
    
    public Reservations(){
        
    }

    public Reservations(Date date_reserver, Date date_Arriver, Date date_depart, int validiter) {
        this.date_reserver = date_reserver;
        this.date_Arriver = date_Arriver;
        this.date_depart = date_depart;
        this.validiter = validiter;
    }

    public Date getDate_reserver() {
        return date_reserver;
    }

    public void setDate_reserver(Date date_reserver) {
        this.date_reserver = date_reserver;
    }

    public Date getDate_Arriver() {
        return date_Arriver;
    }

    public void setDate_Arriver(Date date_Arriver) {
        this.date_Arriver = date_Arriver;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public int getValiditer() {
        return validiter;
    }

    public void setValiditer(int validiter) {
        this.validiter = validiter;
    }
    
           
            
}
