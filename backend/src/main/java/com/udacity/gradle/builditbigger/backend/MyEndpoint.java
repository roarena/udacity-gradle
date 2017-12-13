/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.rodrigocamara.joketeller.TheJoker;

import javax.inject.Named;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    private static final String GCE_MESSAGE = "From Joke GCE Server:\n";
    private static final String API_METHOD_NAME = "wakeJoker";

    @ApiMethod(name = API_METHOD_NAME)
    public MyBean tellJoke() {
        MyBean response = new MyBean();
        response.setData(GCE_MESSAGE + TheJoker.tellJoke());
        return response;
    }

}
