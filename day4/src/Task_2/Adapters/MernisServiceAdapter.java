package Task_2.Adapters;

import Task_2.Abstract.CustomerCheckService;
import Task_2.Entities.Customer;
import Task_2.MernisService.TDFKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        TDFKPSPublicSoap publicSoap = new TDFKPSPublicSoap();

        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
