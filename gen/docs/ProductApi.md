# ProductApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**showProductById**](ProductApi.md#showProductById) | **GET** /products/{productId} | Info for a specific product


<a name="showProductById"></a>
# **showProductById**
> Product showProductById(productId)

Info for a specific product

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Long productId = 56L; // Long | The id of the product to retrieve
    try {
      Product result = apiInstance.showProductById(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#showProductById");
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
 **productId** | **Long**| The id of the product to retrieve |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response to a valid request |  -  |
**0** | unexpected error |  -  |

