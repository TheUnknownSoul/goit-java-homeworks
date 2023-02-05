package org.web;

import com.github.javafaker.Faker;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;


public class RequestSender {
    /**
     * Collection of parameters which we would use in this task.
     */
    private final List<BasicNameValuePair> parameters = new ArrayList<>();

    /**
     * Default constructor with randomly generated values.
     */
    public RequestSender() {
        Faker faker = new Faker();
        parameters.add(new BasicNameValuePair("id", "11"));
        parameters.add(new BasicNameValuePair("name", faker.name().fullName()));
        parameters.add(new BasicNameValuePair("username", faker.name().username()));
    }

    /**
     * Send POST request to URL with entity (parameters) in the body.
     *
     * @return true if one of our parameters returns in response.
     */
    public boolean isUserCreated() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpPost httpPost = new HttpPost("https://jsonplaceholder.typicode.com/users");
            httpPost.setEntity(new UrlEncodedFormEntity(parameters));
            CloseableHttpResponse response = httpClient.execute(httpPost);
            String entity = EntityUtils.toString(response.getEntity());
            return entity.contains(parameters.get(0).getValue());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send PUT request to URI with the id in the end of request (path variable).
     *
     * @return true if one of our parameters returns in response.
     */
    public boolean isUserUpdated() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpPut httpPut = new HttpPut("https://jsonplaceholder.typicode.com/users/8");
            httpPut.setEntity(new UrlEncodedFormEntity(parameters));
            CloseableHttpResponse response = httpClient.execute(httpPut);
            String entity = EntityUtils.toString(response.getEntity());
            if (entity.contains(parameters.get(1).getValue())) {
                return true;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send DELETE request to deleting user.
     *
     * @return true if response status code equals 200.
     */
    public boolean isUserDeleted() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpDelete httpDelete = new HttpDelete("https://jsonplaceholder.typicode.com/users/8");
            CloseableHttpResponse response = httpClient.execute(httpDelete);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                return true;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send GET request to get all users.
     *
     * @return true if we found some id (8 in our case) that exists on the website.
     */
    public boolean isGettingUsers() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users");
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String string = EntityUtils.toString(response.getEntity());
            if (string.contains("8")) {
                return true;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    /**
     * Send GET request with parameters.
     *
     * @return true if response contains out parameter
     */
    public boolean isGettingUserById() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            String userId = "1";
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/" + userId);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String string = EntityUtils.toString(response.getEntity());
            if (string.contains(userId)) {
                return true;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send GET request with parameters.
     *
     * @return true if response contains out parameter.
     */
    public boolean isGettingUserByUsername() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/");
            String parameterToSearch = "username";
            String parameterValue = "Moriah.Stanton";
            URI uri = new URIBuilder(httpGet.getURI())
                    .addParameter(parameterToSearch, parameterValue)
                    .build();
            httpGet.setURI(uri);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String string = EntityUtils.toString(response.getEntity());
            if (string.contains("Moriah.Stanton")) {
                return true;
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send GET request with parameters. Get the response and write it in to file.
     *
     * @return true if operation success.
     */
    public boolean isGettingCommetsAndWriteInToFile() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/");
            String parameterToSearch = "userId";
            String parametersValue = "1";
            URI uri = new URIBuilder(httpGet.getURI())
                    .addParameter(parameterToSearch, parametersValue)
                    .build();
            httpGet.setURI(uri);
            String path = System.getProperty("user.dir") + "/goit-web-homework/src/main/java/org/web/files/";
            File file = new File(String.format(path + "users_%s_posts.json", parametersValue));
            CloseableHttpResponse response = httpClient.execute(httpGet);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                String string = EntityUtils.toString(response.getEntity());
                writer.write(string);
                if (file.exists() & file.isFile()) {
                    return true;
                }
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send GET request with parameters. Get the response and write it in to file.
     *
     * @return true if operation success.
     */
    public boolean isGettingLastCommetAndWriteInToFile() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/posts/");
            String parameterToSearch = "postId";
            String parametersValue = "1";
            URI uri = new URIBuilder(httpGet.getURI())
                    .addParameter(parameterToSearch, parametersValue)
                    .build();
            httpGet.setURI(uri);
            String path = System.getProperty("user.dir") + "/goit-web-homework/src/main/java/org/web/files/";
            File file = new File(String.format(path + "/users_%s_comment.json", parametersValue));
            CloseableHttpResponse response = httpClient.execute(httpGet);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                String string = EntityUtils.toString(response.getEntity());
                writer.write(string);
                if (file.exists()) {
                    return true;
                }
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Send GET request with parameters.
     *
     * @return true if operation success and response contains false in tasks statuses.
     */
    public boolean isGettingIncomplitedTasks() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/1/todos/");
            String parameterToSearch = "completed";
            String parameterValue = "false";
            URI uri = new URIBuilder(httpGet.getURI())
                    .addParameter(parameterToSearch, parameterValue)
                    .build();
            httpGet.setURI(uri);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String string = EntityUtils.toString(response.getEntity());
            if (string.contains("false")) {
                return true;
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
