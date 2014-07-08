package com.barthezzko.ws;

import java.io.IOException;
import java.net.URL;

import org.russianpost.operationhistory.AuthorizationFault;
import org.russianpost.operationhistory.LanguageFault;
import org.russianpost.operationhistory.OperationHistory;
import org.russianpost.operationhistory.OperationHistoryFault;
import org.russianpost.operationhistory.OperationHistoryInterface;
import org.russianpost.operationhistory.data.AuthorizationHeader;
import org.russianpost.operationhistory.data.OperationHistoryData;
import org.russianpost.operationhistory.data.OperationHistoryRecord;
import org.russianpost.operationhistory.data.OperationHistoryRequest;

public class WSChecker {
	
	public static void main(String ... args) throws IOException, OperationHistoryFault, LanguageFault, AuthorizationFault{
		OperationHistory oh = new OperationHistory(new URL("http://voh.russianpost.ru:8080/niips-operationhistory-web/OperationHistory?wsdl")); 
		OperationHistoryRequest req = new OperationHistoryRequest();
		req.setBarcode("RC351224685CN");
		OperationHistoryInterface inter = oh.getOperationHistory();
		OperationHistoryData data = inter.getOperationHistory(req, new AuthorizationHeader());
		StringBuilder sb = new StringBuilder("");
		for (OperationHistoryRecord record : data.getHistoryRecord()){
			sb.append(record.getItemParameters().getComplexItemName());
			sb.append(" | " + record.getItemParameters().getMass());
			sb.append(" | " + record.getAddressParameters().getOperationAddress().getDescription()+ "\n");
		}
		System.out.println(sb.toString());
	}

}
