//G@P

package sessions;

import entities.TypeReglement;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionTypeReglementLocal {

    public List<TypeReglement> getAllType();

    public TypeReglement getTypeReglementById(String type);
    
}
