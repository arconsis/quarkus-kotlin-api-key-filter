# Quarkus API Key Filter Example

Explore this repository to learn how to implement a robust API key filter for securing your Quarkus-powered REST API. 
The example code demonstrates how to create a custom API key request filter using Quarkus, ensuring that only authorized clients can access your API endpoints. 
Follow [the step-by-step guide](https://medium.com/arconsis/securing-your-rest-api-with-quarkus-implementing-an-api-key-request-filter-515ead51739f) and accompanying [video tutorial](https://youtu.be/pjWV0eZY1Xs) to strengthen your API's security and build a solid foundation for your applications.


## Start Up

To run the project, simply run

```shell
./gradlew quarkusDev
```


## Testing

When the service is started, make an HTTP GET call to http://localhost:8080/hello and provide the required api key.
E.g. with `curl` it could look like this:

```shell
curl -L 'localhost:8080/hello' -H 'x-api-key: my-api-key-1'
```