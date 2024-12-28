package xml;

import com.fasterxml.jackson.xml.XmlMapper;
import org.apache.commons.validator.routines.IntegerValidator;

import java.io.File;

public class XmlReader {
    public static void main(String[] args) {

        String xmlFile = "company.xml";

        XmlMapper xmlMapper = new XmlMapper();
        try {

            Company company = xmlMapper.readValue(new File(xmlFile), Company.class);
//            JAXBContext context = JAXBContext.newInstance(Company.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            File file = new File("company.xml");
//            Company company = (Company) unmarshaller.unmarshal(file);
            validate(company);
            System.out.println(company);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validate(Company company) {
        IntegerValidator integerValidator = IntegerValidator.getInstance();

        if (!integerValidator.isInRange(company.getEstablishedYear(), 2000, 2010)) {
            System.out.println("Invalid establishedYear: It should be between 2000 and 2010.");
        }

        // Validate 'companyID' is a non-negative integer
        if (!integerValidator.isValid(String.valueOf(company.getCompanyID())) || company.getCompanyID() < 0) {
            System.out.println("Invalid companyID: It should be a non-negative integer.");
        }

        if (company.getName() == null || company.getName().isEmpty()) {
            System.out.println("Invalid name: Name cannot be null or empty.");
        }

        System.out.println("Validation completed.");
    }
}
