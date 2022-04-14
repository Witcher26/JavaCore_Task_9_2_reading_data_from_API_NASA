package apinasa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiNasa {

    @JsonProperty
    private String copyright;
    @JsonProperty
    private int id;
    @JsonProperty
    private String date;
    @JsonProperty
    private String explanation;
    @JsonProperty
    private String hdurl;
    @JsonProperty("media_type")
    private String media;
    @JsonProperty("service_version")
    private String service;
    @JsonProperty
    private String title;
    @JsonProperty
    private String url;

    public ApiNasa() {
    }

    public String getCopyright() {
        return copyright;
    }

    public ApiNasa setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public int getId() {
        return id;
    }

    public ApiNasa setId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ApiNasa setDate(String date) {
        this.date = date;
        return this;
    }

    public String getExplanation() {
        return explanation;
    }

    public ApiNasa setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    public String getHdurl() {
        return hdurl;
    }

    public ApiNasa setHdurl(String hdurl) {
        this.hdurl = hdurl;
        return this;
    }

    public String getMedia() {
        return media;
    }

    public ApiNasa setMedia(String media) {
        this.media = media;
        return this;
    }

    public String getService() {
        return service;
    }

    public ApiNasa setService(String version) {
        this.service = version;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ApiNasa setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ApiNasa setUrl(String url) {
        this.url = url;
        return this;
    }
}
