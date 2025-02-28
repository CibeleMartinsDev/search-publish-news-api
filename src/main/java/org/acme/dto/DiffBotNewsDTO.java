package org.acme.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiffBotNewsDTO {

    @JsonProperty("request")
    public Request request;

    @JsonProperty("humanLanguage")
    public String humanLanguage;

    @JsonProperty("objects")
    public List<Object> objects;

    @Override
    public String toString() {
        return "DiffBotNewsDTO{" +
                "request=" + request +
                ", humanLanguage='" + humanLanguage + '\'' +
                ", objects=" + objects +
                '}';
    }

    // Construtor com JsonCreator
    @JsonCreator
    public DiffBotNewsDTO(@JsonProperty("request") Request request,
                          @JsonProperty("humanLanguage") String humanLanguage,
                          @JsonProperty("objects") List<Object> objects) {
        this.request = request;
        this.humanLanguage = humanLanguage;
        this.objects = objects;
    }

    // Getters e Setters
    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getHumanLanguage() {
        return humanLanguage;
    }

    public void setHumanLanguage(String humanLanguage) {
        this.humanLanguage = humanLanguage;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    // Subclasse Request
    public static class Request {

        @JsonProperty("options")
        public List<String> options;

        @JsonProperty("pageUrl")
        public String pageUrl;

        @JsonProperty("api")
        public String api;

        @JsonProperty("version")
        public int version;

        @Override
        public String toString() {
            return "Request{" +
                    "options=" + options +
                    ", pageUrl='" + pageUrl + '\'' +
                    ", api='" + api + '\'' +
                    ", version=" + version +
                    '}';
        }

        // Construtor com JsonCreator
        @JsonCreator
        public Request(@JsonProperty("options") List<String> options,
                       @JsonProperty("pageUrl") String pageUrl,
                       @JsonProperty("api") String api,
                       @JsonProperty("version") int version) {
            this.options = options;
            this.pageUrl = pageUrl;
            this.api = api;
            this.version = version;
        }

        // Getters e Setters
        public List<String> getOptions() {
            return options;
        }

        public void setOptions(List<String> options) {
            this.options = options;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public String getApi() {
            return api;
        }

        public void setApi(String api) {
            this.api = api;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }
    }

    // Subclasse Object
    public static class Object {

        @JsonProperty("date")
        public String date;

        @JsonProperty("images")
        public List<Image> images;

        @JsonProperty("author")
        public String author;

        @JsonProperty("estimatedDate")
        public String estimatedDate;

        @JsonProperty("icon")
        public String icon;

        @JsonProperty("diffbotUri")
        public String diffbotUri;

        @JsonProperty("siteName")
        public String siteName;

        @JsonProperty("type")
        public String type;

        @JsonProperty("title")
        public String title;

        @JsonProperty("humanLanguage")
        public String humanLanguage;

        @JsonProperty("pageUrl")
        public String pageUrl;

        @JsonProperty("html")
        public String html;

        @JsonProperty("categories")
        public List<Category> categories;

        @JsonProperty("text")
        public String text;

        @Override
        public String toString() {
            return "Object{" +
                    "date='" + date + '\'' +
                    ", images=" + images +
                    ", author='" + author + '\'' +
                    ", estimatedDate='" + estimatedDate + '\'' +
                    ", icon='" + icon + '\'' +
                    ", diffbotUri='" + diffbotUri + '\'' +
                    ", siteName='" + siteName + '\'' +
                    ", type='" + type + '\'' +
                    ", title='" + title + '\'' +
                    ", humanLanguage='" + humanLanguage + '\'' +
                    ", pageUrl='" + pageUrl + '\'' +
                    ", html='" + html + '\'' +
                    ", categories=" + categories +
                    ", text='" + text + '\'' +
                    '}';
        }

        // Construtor com JsonCreator
        @JsonCreator
        public Object(@JsonProperty("date") String date,
                      @JsonProperty("images") List<Image> images,
                      @JsonProperty("author") String author,
                      @JsonProperty("estimatedDate") String estimatedDate,
                      @JsonProperty("icon") String icon,
                      @JsonProperty("diffbotUri") String diffbotUri,
                      @JsonProperty("siteName") String siteName,
                      @JsonProperty("type") String type,
                      @JsonProperty("title") String title,
                      @JsonProperty("humanLanguage") String humanLanguage,
                      @JsonProperty("pageUrl") String pageUrl,
                      @JsonProperty("html") String html,
                      @JsonProperty("categories") List<Category> categories,
                      @JsonProperty("text") String text) {
            this.date = date;
            this.images = images;
            this.author = author;
            this.estimatedDate = estimatedDate;
            this.icon = icon;
            this.diffbotUri = diffbotUri;
            this.siteName = siteName;
            this.type = type;
            this.title = title;
            this.humanLanguage = humanLanguage;
            this.pageUrl = pageUrl;
            this.html = html;
            this.categories = categories;
            this.text = text;
        }

        // Getters e Setters
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<Image> getImages() {
            return images;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getEstimatedDate() {
            return estimatedDate;
        }

        public void setEstimatedDate(String estimatedDate) {
            this.estimatedDate = estimatedDate;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getDiffbotUri() {
            return diffbotUri;
        }

        public void setDiffbotUri(String diffbotUri) {
            this.diffbotUri = diffbotUri;
        }

        public String getSiteName() {
            return siteName;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getHumanLanguage() {
            return humanLanguage;
        }

        public void setHumanLanguage(String humanLanguage) {
            this.humanLanguage = humanLanguage;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    // Subclasse Image
    public static class Image {

        @JsonProperty("naturalHeight")
        public int naturalHeight;

        @JsonProperty("width")
        public int width;

        @JsonProperty("diffbotUri")
        public String diffbotUri;

        @JsonProperty("title")
        public String title;

        @JsonProperty("url")
        public String url;

        @JsonProperty("naturalWidth")
        public int naturalWidth;

        @JsonProperty("primary")
        public boolean primary;

        @JsonProperty("height")
        public int height;

        @Override
        public String toString() {
            return "Image{" +
                    "naturalHeight=" + naturalHeight +
                    ", width=" + width +
                    ", diffbotUri='" + diffbotUri + '\'' +
                    ", title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    ", naturalWidth=" + naturalWidth +
                    ", primary=" + primary +
                    ", height=" + height +
                    '}';
        }

        // Construtor com JsonCreator
        @JsonCreator
        public Image(@JsonProperty("naturalHeight") int naturalHeight,
                     @JsonProperty("width") int width,
                     @JsonProperty("diffbotUri") String diffbotUri,
                     @JsonProperty("title") String title,
                     @JsonProperty("url") String url,
                     @JsonProperty("naturalWidth") int naturalWidth,
                     @JsonProperty("primary") boolean primary,
                     @JsonProperty("height") int height) {
            this.naturalHeight = naturalHeight;
            this.width = width;
            this.diffbotUri = diffbotUri;
            this.title = title;
            this.url = url;
            this.naturalWidth = naturalWidth;
            this.primary = primary;
            this.height = height;
        }

        // Getters e Setters
        public int getNaturalHeight() {
            return naturalHeight;
        }

        public void setNaturalHeight(int naturalHeight) {
            this.naturalHeight = naturalHeight;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public String getDiffbotUri() {
            return diffbotUri;
        }

        public void setDiffbotUri(String diffbotUri) {
            this.diffbotUri = diffbotUri;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getNaturalWidth() {
            return naturalWidth;
        }

        public void setNaturalWidth(int naturalWidth) {
            this.naturalWidth = naturalWidth;
        }

        public boolean isPrimary() {
            return primary;
        }

        public void setPrimary(boolean primary) {
            this.primary = primary;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    // Subclasse Category
    public static class Category {

        @JsonProperty("score")
        public double score;

        @JsonProperty("name")
        public String name;

        @JsonProperty("id")
        public String id;

        @Override
        public String toString() {
            return "Category{" +
                    "score=" + score +
                    ", name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }

        // Construtor com JsonCreator
        @JsonCreator
        public Category(@JsonProperty("score") double score,
                        @JsonProperty("name") String name,
                        @JsonProperty("id") String id) {
            this.score = score;
            this.name = name;
            this.id = id;
        }

        // Getters e Setters
        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
