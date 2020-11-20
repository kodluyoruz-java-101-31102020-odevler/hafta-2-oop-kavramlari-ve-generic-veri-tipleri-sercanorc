package kodluyoruz.soru4.manager;

import kodluyoruz.soru4.User;
import kodluyoruz.soru4.adres.IAdres;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    public static User adresEkle(User user, IAdres adres){
        if (user != null){
            if(user.getAdresList().size()==0){
                List<IAdres> adresListesi=new ArrayList<>();
                adresListesi.add(adres);
                user.setAdresList(adresListesi);
            }else{
                user.getAdresList().add(adres);
            }
        }
        return user;
    }
    public static User adresSil(User user,IAdres adres){
        if (user !=null && user.getAdresList().size()>0){
            user.getAdresList().remove(adres);
        }
        return user;
    }
}
