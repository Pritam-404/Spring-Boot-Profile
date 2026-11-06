package org.example.profile;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "payment")
public class PaymentProperty {
    private String modeName;
    private String url;
    private String environment;
    private String status;


    public PaymentProperty() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }



    @Override
    public String toString() {
        return "PaymentProperty{" +
                "modeName='" + modeName + '\'' +
                ", url='" + url + '\'' +
                ", environment='" + environment + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
