  String  ReportId="", ReportType="_GET_ORDERS_DATA_";
  List<String> abc= new ArrayList<String>();
	List<String> list1=new ArrayList<String>();

  abc.add(ReportType);
  
		final String accessKeyId = context.accessKeyId;
        final String secretAccessKey = context.secretAccessKey;

        final String appName = context.appName;
        final String appVersion = context.appVersion;

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig(); 
        config.setServiceURL("https://mws.amazonservices.in");
        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

		final String merchantId = context.merchantId;
        final String sellerDevAuthToken = context.sellerDevAuthToken;
{
        GetReportListRequest request = new GetReportListRequest();
        request.setMerchant( merchantId );
        TypeList obj=new TypeList(abc);
                request.withReportTypeList(obj);
                request.setMWSAuthToken(sellerDevAuthToken);

        // @TODO: set request parameters here

              try {

            GetReportListResponse response = service.getReportList(request);


            System.out.println ("GetReportList Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportListResponse");
            System.out.println();
            if (response.isSetGetReportListResult()) {
                System.out.print("        GetReportListResult");
                System.out.println();
                GetReportListResult  getReportListResult = response.getGetReportListResult();
                if (getReportListResult.isSetNextToken()) {
                    System.out.print("            context.NextToken");
                    System.out.println();
                    System.out.print("                " + (context.NextToken=getReportListResult.getNextToken()));
                    System.out.println();
                }
                if (getReportListResult.isSetHasNext()) {
                    System.out.print("            context.HasNext");
                    System.out.println();
                    System.out.print("                " + (context.HasNext=getReportListResult.isHasNext()));
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoListList = getReportListResult.getReportInfoList();
                for (ReportInfo reportInfoList : reportInfoListList) {
                    System.out.print("            ReportInfoList");
                    System.out.println();
                    if (reportInfoList.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + (ReportId=reportInfoList.getReportId()));
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + (ReportType=reportInfoList.getReportType()));
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAcknowledgedDate());
                        System.out.println();
                    }
							// Begiinnig of Get Report
							{ 
							 OutputStream requestoutputstream = new ByteArrayOutputStream();
							 
							  GetReportRequest request1 = new GetReportRequest();
							  request1.setMerchant( merchantId );
							request1.setMWSAuthToken(sellerDevAuthToken);
							request1.setReportId( ReportId );
								 request1.setReportOutputStream( requestoutputstream );
							
							try {

								GetReportResponse response1 = service.getReport(request1);


								System.out.println ("GetReport Action Response");
								System.out.println ("=============================================================================");
								System.out.println ();

								System.out.print("    GetReportResponse");
								System.out.println();
								System.out.print("    GetReportResult");
								System.out.println();
								System.out.print("            MD5Checksum");
								System.out.println();
								System.out.print("                " + response1.getGetReportResult().getMD5Checksum());
								System.out.println();
								if (response1.isSetResponseMetadata()) {
									System.out.print("        ResponseMetadata");
									System.out.println();
									ResponseMetadata  responseMetadata = response1.getResponseMetadata();
									if (responseMetadata.isSetRequestId()) {
										System.out.print("            RequestId");
										System.out.println();
										System.out.print("                " + responseMetadata.getRequestId());
										System.out.println();
									}
								} 
								System.out.println();

								System.out.println("Report");
								System.out.println ("=============================================================================");
								System.out.println();
								String str=new String();
								str+= request1.getReportOutputStream().toString() ;
								row1.content=str;

								System.out.println();

								System.out.println(response1.getResponseHeaderMetadata());
								System.out.println();
										list1.add(ReportId);



							} catch (MarketplaceWebServiceException ex) {

								System.out.println("Caught Exception: " + ex.getMessage());
								System.out.println("Response Status Code: " + ex.getStatusCode());
								System.out.println("Error Code: " + ex.getErrorCode());
								System.out.println("Error Type: " + ex.getErrorType());
								System.out.println("Request ID: " + ex.getRequestId());
								System.out.print("XML: " + ex.getXML());
								System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
							}
						 }// End of Get Report
						 
                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
      }
 					//Update Acknowledgement Status
					{
	    UpdateReportAcknowledgementsRequest request2 = new UpdateReportAcknowledgementsRequest();
                   request2.setMWSAuthToken(context.sellerDevAuthToken);
 request2.setMerchant( merchantId );
		list1.add(ReportId);
		IdList ReportIdList= new IdList(list1);
		request2.setReportIdList( ReportIdList );
		request2.setAcknowledged( true );
		try {

            UpdateReportAcknowledgementsResponse response2 = service.updateReportAcknowledgements(request2);


            System.out.println ("UpdateReportAcknowledgements Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    UpdateReportAcknowledgementsResponse");
            System.out.println();
            if (response2.isSetUpdateReportAcknowledgementsResult()) {
                System.out.print("        UpdateReportAcknowledgementsResult");
                System.out.println();
                UpdateReportAcknowledgementsResult  updateReportAcknowledgementsResult = response2.getUpdateReportAcknowledgementsResult();
                if (updateReportAcknowledgementsResult.isSetCount()) {
                    System.out.print("            Count");
                    System.out.println();
                    System.out.print("                " + updateReportAcknowledgementsResult.getCount());
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoList = updateReportAcknowledgementsResult.getReportInfoList();
                for (ReportInfo reportInfo : reportInfoList) {
                    System.out.print("            ReportInfo");
                    System.out.println();
                    if (reportInfo.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportId());
                        System.out.println();
                    }
                    if (reportInfo.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportType());
                        System.out.println();
                    }
                    if (reportInfo.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfo.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfo.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAcknowledgedDate());
                        System.out.println();
                    }
                }
            } 
            if (response2.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response2.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response2.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
						 }// End of upadte Acknowledgement
//Beginning of HasNext	
 while(context.HasNext)
 {
 	    GetReportListByNextTokenRequest request = new GetReportListByNextTokenRequest();
        request.setMerchant( merchantId );
        request.setMWSAuthToken(sellerDevAuthToken);
        request.setNextToken( context.NextToken );

        // @TODO: set request parameters here
        
        try {

            GetReportListByNextTokenResponse response = service.getReportListByNextToken(request);


            System.out.println ("GetReportListByNextToken Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportListByNextTokenResponse");
            System.out.println();
            if (response.isSetGetReportListByNextTokenResult()) {
                System.out.print("        GetReportListByNextTokenResult");
                System.out.println();
                GetReportListByNextTokenResult  getReportListByNextTokenResult = response.getGetReportListByNextTokenResult();
                if (getReportListByNextTokenResult.isSetNextToken()) {
                    System.out.print("            context.NextToken");
                    System.out.println();
                    System.out.print("                " + (context.NextToken=getReportListByNextTokenResult.getNextToken()));
                    System.out.println();
                }
                if (getReportListByNextTokenResult.isSetHasNext()) {
                    System.out.print("            context.HasNext");
                    System.out.println();
                    System.out.print("                " +(context.HasNext= getReportListByNextTokenResult.isHasNext()));
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoList = getReportListByNextTokenResult.getReportInfoList();
                for (ReportInfo reportInfo : reportInfoList) {
                    System.out.print("            ReportInfo");
                    System.out.println();
                    if (reportInfo.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + (ReportId=reportInfo.getReportId()));
                        System.out.println();
                    }
                    if (reportInfo.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + (ReportType=reportInfo.getReportType()));
                        System.out.println();
                    }
                    if (reportInfo.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfo.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfo.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAcknowledgedDate());
                        System.out.println();
                    }
                   			// Beginning of Get Report
							{ 
							 OutputStream requestoutputstream = new ByteArrayOutputStream();
							 
							  GetReportRequest request1 = new GetReportRequest();
							  request1.setMerchant( merchantId );
							request1.setMWSAuthToken(sellerDevAuthToken);
							request1.setReportId( ReportId );
								 request1.setReportOutputStream( requestoutputstream );
							
							try {

								GetReportResponse reponse1 = service.getReport(request1);


								System.out.println ("GetReport Action Response");
								System.out.println ("=============================================================================");
								System.out.println ();

								System.out.print("    GetReportResponse");
								System.out.println();
								System.out.print("    GetReportResult");
								System.out.println();
								System.out.print("            MD5Checksum");
								System.out.println();
								System.out.print("                " + reponse1.getGetReportResult().getMD5Checksum());
								System.out.println();
								if (reponse1.isSetResponseMetadata()) {
									System.out.print("        ResponseMetadata");
									System.out.println();
									ResponseMetadata  responseMetadata = reponse1.getResponseMetadata();
									if (responseMetadata.isSetRequestId()) {
										System.out.print("            RequestId");
										System.out.println();
										System.out.print("                " + responseMetadata.getRequestId());
										System.out.println();
									}
								} 
								System.out.println();

								System.out.println("Report");
								System.out.println ("=============================================================================");
								System.out.println();
									String str=new String();
								str+= request1.getReportOutputStream().toString() ;
								row1.content=str;
								System.out.println();

								System.out.println(reponse1.getResponseHeaderMetadata());
								System.out.println();
										list1.add(ReportId);



							} catch (MarketplaceWebServiceException ex) {

								System.out.println("Caught Exception: " + ex.getMessage());
								System.out.println("Response Status Code: " + ex.getStatusCode());
								System.out.println("Error Code: " + ex.getErrorCode());
								System.out.println("Error Type: " + ex.getErrorType());
								System.out.println("Request ID: " + ex.getRequestId());
								System.out.print("XML: " + ex.getXML());
								System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
							}
						 }// End of Get Report
 
                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
 }
 					//Update Acknowledgement Status
					{
	    UpdateReportAcknowledgementsRequest request2 = new UpdateReportAcknowledgementsRequest();
                   request2.setMWSAuthToken(context.sellerDevAuthToken);
 request2.setMerchant( merchantId );
		list1.add(ReportId);
		IdList ReportIdList= new IdList(list1);
		request2.setReportIdList( ReportIdList );
		request2.setAcknowledged( true );
		try {

            UpdateReportAcknowledgementsResponse response2 = service.updateReportAcknowledgements(request2);


            System.out.println ("UpdateReportAcknowledgements Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    UpdateReportAcknowledgementsResponse");
            System.out.println();
            if (response2.isSetUpdateReportAcknowledgementsResult()) {
                System.out.print("        UpdateReportAcknowledgementsResult");
                System.out.println();
                UpdateReportAcknowledgementsResult  updateReportAcknowledgementsResult = response2.getUpdateReportAcknowledgementsResult();
                if (updateReportAcknowledgementsResult.isSetCount()) {
                    System.out.print("            Count");
                    System.out.println();
                    System.out.print("                " + updateReportAcknowledgementsResult.getCount());
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoList = updateReportAcknowledgementsResult.getReportInfoList();
                for (ReportInfo reportInfo : reportInfoList) {
                    System.out.print("            ReportInfo");
                    System.out.println();
                    if (reportInfo.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportId());
                        System.out.println();
                    }
                    if (reportInfo.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportType());
                        System.out.println();
                    }
                    if (reportInfo.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfo.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfo.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfo.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfo.getAcknowledgedDate());
                        System.out.println();
                    }
                }
            } 
            if (response2.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response2.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response2.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
						 }// End of upadte Acknowledgement
 