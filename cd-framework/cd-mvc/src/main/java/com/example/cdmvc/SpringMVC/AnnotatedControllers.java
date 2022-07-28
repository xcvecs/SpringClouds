package com.example.cdmvc.SpringMVC;

import lombok.Data;
import lombok.SneakyThrows;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

public class AnnotatedControllers {


    /**
     * 1.3.2 Request Mapping
     * URI patterns
     * <p>
     * Some example patterns:
     * 1 "/resources/*.png" - match zero or more characters in a path segment
     * <p>
     * 2 "/resources/**" - match multiple path segments
     * <p>
     * 3 "/projects/{project}/versions" - match a path segment and capture it as a variable
     * <p>
     * 4 "/projects/{project:[a-z]+}/versions" - match and capture a variable with a regex
     */

    @GetMapping("/owners/{ownerId}/pets/{petId}")
    @RequestMapping
    public ResponseEntity findPet(@PathVariable Long ownerId, @PathVariable Long petId) {
        // ... Captured URI variables can be accessed with @PathVariable
        return null;
    }


    /**
     * 1.3.2 Request Mapping
     * Consumable Media Types
     *
     * @PostMapping(path = "/pets", consumes = "application/json")
     * public void addPet(@RequestBody Pet pet) {
     * // ...
     * }
     */
    @PostMapping(path = "/pets", consumes = "application/json")
    public void addPet(@RequestBody User pet) {
        // ...
    }


    /**
     * 1.3.2 Request Mapping
     * Producible Media Types
     *
     * @param petId
     * @return
     */
    @GetMapping(path = "/pets/{petId}", produces = "application/json")
    @ResponseBody
    public User getPet(@PathVariable String petId) {
        // ...
        return null;
    }

    /**
     * 1.3.2 Request Mapping
     * Parameters, headers
     *
     * @param petId
     */
    @GetMapping(path = "/pets/{petId}", params = "myParam=myValue")
    public void findPet(@PathVariable String petId) {
        // ...
    }

    @GetMapping(path = "/pets", headers = "myHeader=myValue")
    public void findPets(@PathVariable String petId) {
        // ...
    }

    RequestMappingHandlerMapping requestMappingHandlerMapping;


    @Configuration
    public class MyConfig {

        @Autowired
        public void setHandlerMapping(RequestMappingHandlerMapping mapping, UserHandler handler)
                throws NoSuchMethodException {

            RequestMappingInfo info = RequestMappingInfo
                    .paths("/user/{id}").methods(RequestMethod.GET).build();

            Method method = UserHandler.class.getMethod("getUser", Long.class);

            mapping.registerMapping(info, handler, method);
        }

        @Component
        class UserHandler {

        }
    }

    /**
     * 1.3.3 Handler Methods
     *
     * Method Arguments
     * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-arguments
     */

    /**
     * 1.3.3 Handler Methods
     * Return Values
     * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-return-types
     *
     */

    /**
     * 1.3.3 Handler Methods
     * <p>
     * Matrix Variables
     * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-matrix-variables">...</a>
     */
    @GetMapping("/pets/{petId}")// GET /pets/42;q=11;r=22
    public void findPet(@PathVariable String petId, @MatrixVariable int q) {

        // petId == 42
        // q == 11
    }

    @Data
    class MyForm {

        private String name;

        private MultipartFile file;

        // ...
    }

    @Controller
    public class FileUploadController {

        @SneakyThrows
        @PostMapping("/form")
        public String handleFormUpload(MyForm form, BindingResult errors) {
            if (!form.getFile().isEmpty()) {
                byte[] bytes = form.getFile().getBytes();
                // store the bytes somewhere
                return "redirect:uploadSuccess";
            }
            return "redirect:uploadFailure";
        }
    }

    @PostMapping("/")
    public String handle(/*@RequestPart("meta-data") MetaData metadata,*/
                         @RequestPart("file-data") MultipartFile file) {


        // ...
        return null;
    }


    /**
     * 1.3.6 Exceptions
     * Method Arguments
     *
     * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-exceptionhandler-args
     */

    /**
     * 1.3.6 Exceptions
     * Return Values
     * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-exceptionhandler-return-values
     */

    /**
     * 1.3.6 Exceptions
     * REST API exceptions
     */





}
