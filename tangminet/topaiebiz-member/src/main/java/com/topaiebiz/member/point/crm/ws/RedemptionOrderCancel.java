
package com.topaiebiz.member.point.crm.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RedemptionOrderCancel", targetNamespace = "http://siebel.com/asi/BYM")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RedemptionOrderCancel {


    /**
     * 
     * @param errDesc
     * @param errCode
     * @param inXml
     * @param outXml
     * @param source
     */
    @WebMethod(operationName = "RedemptionOrderCancel", action = "rpc/http://siebel.com/asi/BYM:RedemptionOrderCancel")
    public void redemptionOrderCancel(
            @WebParam(name = "InXml", partName = "InXml")
                    String inXml,
            @WebParam(name = "Source", partName = "Source")
                    String source,
            @WebParam(name = "ErrCode", mode = WebParam.Mode.OUT, partName = "ErrCode")
                    Holder<String> errCode,
            @WebParam(name = "ErrDesc", mode = WebParam.Mode.OUT, partName = "ErrDesc")
                    Holder<String> errDesc,
            @WebParam(name = "OutXml", mode = WebParam.Mode.OUT, partName = "OutXml")
                    Holder<String> outXml);

}
