Multi DispatcherServlet Demo
============================

[![Check](https://github.com/AlphaHinex/multi-dispatcher/workflows/Check/badge.svg)](https://github.com/AlphaHinex/multi-dispatcher/actions?query=workflow%3ACheck)

The demo defines three controller:

1. [DefaultController](./modules/app/src/main/java/alpha/hinex/demo/app/DefaultController.java) mapping `/`
1. [FooController](./modules/foo/src/main/java/alpha/hinex/demo/foo/controller/FooController.java) mapping `/same/path`
1. [BarController](./modules/bar/src/main/java/alpha/hinex/demo/bar/BarController.java) mapping `/same/path`

and use [FooBarConfiguration](./modules/app/src/main/java/alpha/hinex/demo/app/FooBarConfiguration.java) register two servlets 
to separate `/same/path` to two urls: `/foo/same/path` and `/bar/same/path`.

[IntegrationTest](./modules/app/src/test/groovy/alpha/hinex/demo/app/IntegrationTest.groovy) test everything works.

How to use?
-----------

### Prepare

Set GitHub username and [token](https://github.com/settings/tokens) (with `read:packages` scope for read packages in GitHub Package Registry) in [build.gradle](./build.gradle), modify below contents:

    ```
    username = project.findProperty("gpr.user") ?: System.getenv("GH_OWNER")
    password = project.findProperty("gpr.reader") ?: System.getenv("GH_PKG_READER")
    ```

### Check result

1. Run integration test and check tests are pass.

    ```
    $ ./gradlew check
    ```

1. Start the application

    ```
    $ ./gradlew bootRun
    ```
   
   and the visit
   
   * http://localhost:8080 —— See `hello world` in page
   * http://localhost:8080/foo/same/path —— See `in foo controller` in page
   * http://localhost:8080/bar/same/path —— See `in bar controller` in page