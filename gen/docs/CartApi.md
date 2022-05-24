# CartApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](CartApi.md#addProduct) | **POST** /cart/add/{cartId}/{productId} | Add a product to cart
[**createCart**](CartApi.md#createCart) | **POST** /cart/create | create a cart


<a name="addProduct"></a>
# **addProduct**
> Cart addProduct(cartId, productId)

Add a product to cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CartApi apiInstance = new CartApi(defaultClient);
    Long cartId = 56L; // Long | Cart Id
    Long productId = 56L; // Long | Product ID
    try {
      Cart result = apiInstance.addProduct(cartId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addProduct");
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
 **cartId** | **Long**| Cart Id |
 **productId** | **Long**| Product ID |

### Return type

[**Cart**](Cart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Cart not found |  -  |

<a name="createCart"></a>
# **createCart**
> Cart createCart()

create a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CartApi apiInstance = new CartApi(defaultClient);
    try {
      Cart result = apiInstance.createCart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#createCart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cart**](Cart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Cart not found |  -  |

