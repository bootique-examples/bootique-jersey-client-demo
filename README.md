# bootique-jersey-client-demo

**WARNING: Since 2.0, Jersey client integration is developed in "bootique-jersey" project. This project is only for 1.x support. The newer client examples are available [here](https://github.com/bootique-examples/bootique-jersey-examples).**

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Jersey Client Module.

You can find different versions of framework in use at
* [1.x](https://github.com/bootique-examples/bootique-jersey-client-demo/tree/1.x)
* [2.x](https://github.com/bootique-examples/bootique-jersey-client-demo/tree/2.x)

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```

git clone https://github.com/bootique-examples/bootique-jersey-client-demo.git
cd bootique-jersey-client-demo
mvn package
```
Enter the following to launch the app in Maven.

```bash
java -jar target/bootique-jersey-client-demo-1.0-SNAPSHOT.jar
```

You will see responded html code from [google.com](https://google.com)
