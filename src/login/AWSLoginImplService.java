
package login;

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
@WebServiceClient(name = "AWSLoginImplService", targetNamespace = "http://login/", wsdlLocation = "http://25.48.208.207:8080/epl362/LoginWS?wsdl")
public class AWSLoginImplService
    extends Service
{

    private final static URL AWSLOGINIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AWSLOGINIMPLSERVICE_EXCEPTION;
    private final static QName AWSLOGINIMPLSERVICE_QNAME = new QName("http://login/", "AWSLoginImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://25.48.208.207:8080/epl362/LoginWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AWSLOGINIMPLSERVICE_WSDL_LOCATION = url;
        AWSLOGINIMPLSERVICE_EXCEPTION = e;
    }

    public AWSLoginImplService() {
        super(__getWsdlLocation(), AWSLOGINIMPLSERVICE_QNAME);
    }

    public AWSLoginImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AWSLOGINIMPLSERVICE_QNAME, features);
    }

    public AWSLoginImplService(URL wsdlLocation) {
        super(wsdlLocation, AWSLOGINIMPLSERVICE_QNAME);
    }

    public AWSLoginImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AWSLOGINIMPLSERVICE_QNAME, features);
    }

    public AWSLoginImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AWSLoginImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AWSLogin
     */
    @WebEndpoint(name = "AWSLoginImplPort")
    public AWSLogin getAWSLoginImplPort() {
        return super.getPort(new QName("http://login/", "AWSLoginImplPort"), AWSLogin.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSLogin
     */
    @WebEndpoint(name = "AWSLoginImplPort")
    public AWSLogin getAWSLoginImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://login/", "AWSLoginImplPort"), AWSLogin.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AWSLOGINIMPLSERVICE_EXCEPTION!= null) {
            throw AWSLOGINIMPLSERVICE_EXCEPTION;
        }
        return AWSLOGINIMPLSERVICE_WSDL_LOCATION;
    }

}
