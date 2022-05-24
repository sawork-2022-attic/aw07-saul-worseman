# DeliveryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOrderByCartId**](DeliveryApi.md#listOrderByCartId) | **GET** /delivery/check/{checkId} | checkout my order according to my cartId


<a name="listOrderByCartId"></a>
# **listOrderByCartId**
> Order listOrderByCartId(checkId)

checkout my order according to my cartId

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryApi apiInstance = new DeliveryApi(defaultClient);
    Long checkId = 56L; // Long | 
    try {
      Order result = apiInstance.listOrderByCartId(checkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryApi#listOrderByCartId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **Long**|  |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Order |  -  |
**0** | unexpected error |  -  |

