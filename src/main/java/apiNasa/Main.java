package apiNasa;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    private final static String URL = "https://api.nasa.gov/planetary/apod?api_key=AbLihp5qqF7gk0NyqdoPnGDrvtmQDgCXLchpoMYo";

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()

                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet(URL);
        CloseableHttpResponse response = httpClient.execute(request);

        System.out.println("Код ответа: ");
        System.out.println(response.getStatusLine().getStatusCode());

        ObjectMapper mapper = new ObjectMapper();
        ApiNasa apiNasa = mapper.readValue(response.getEntity().getContent(), new TypeReference<>() {
        });

        String URLFile = apiNasa.getUrl();

        request = new HttpGet(URLFile);
        response = httpClient.execute(request);

        byte[] body = response.getEntity().getContent().readAllBytes();

        String nameFile = apiNasa.getTitle();

        FileOutputStream fos = new FileOutputStream(nameFile + ".jpg");
        fos.write(body);
        fos.close();
    }
}
