
package medicalrecord;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AWSMedicalRecordImplService", targetNamespace = "http://medicalRecord/", wsdlLocation = "http://25.48.208.207:8080/epl362/MedicalWS?wsdl")
public class AWSMedicalRecordImplService
    extends Service
{

    private final static URL AWSMEDICALRECORDIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AWSMEDICALRECORDIMPLSERVICE_EXCEPTION;
    private final static QName AWSMEDICALRECORDIMPLSERVICE_QNAME = new QName("http://medicalRecord/", "AWSMedicalRecordImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://25.48.208.207:8080/epl362/MedicalWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AWSMEDICALRECORDIMPLSERVICE_WSDL_LOCATION = url;
        AWSMEDICALRECORDIMPLSERVICE_EXCEPTION = e;
    }

    public AWSMedicalRecordImplService() {
        super(__getWsdlLocation(), AWSMEDICALRECORDIMPLSERVICE_QNAME);
    }

    public AWSMedicalRecordImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AWSMEDICALRECORDIMPLSERVICE_QNAME, features);
    }

    public AWSMedicalRecordImplService(URL wsdlLocation) {
        super(wsdlLocation, AWSMEDICALRECORDIMPLSERVICE_QNAME);
    }

    public AWSMedicalRecordImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AWSMEDICALRECORDIMPLSERVICE_QNAME, features);
    }

    public AWSMedicalRecordImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AWSMedicalRecordImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AWSMedicalRecord
     */
    @WebEndpoint(name = "AWSMedicalRecordImplPort")
    public AWSMedicalRecord getAWSMedicalRecordImplPort() {
        return super.getPort(new QName("http://medicalRecord/", "AWSMedicalRecordImplPort"), AWSMedicalRecord.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSMedicalRecord
     */
    @WebEndpoint(name = "AWSMedicalRecordImplPort")
    public AWSMedicalRecord getAWSMedicalRecordImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://medicalRecord/", "AWSMedicalRecordImplPort"), AWSMedicalRecord.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AWSMEDICALRECORDIMPLSERVICE_EXCEPTION!= null) {
            throw AWSMEDICALRECORDIMPLSERVICE_EXCEPTION;
        }
        return AWSMEDICALRECORDIMPLSERVICE_WSDL_LOCATION;
    }

}
