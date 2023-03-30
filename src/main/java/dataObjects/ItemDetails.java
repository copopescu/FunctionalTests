package dataObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"sku", "color", "size"})
public class ItemDetails {

    private String sku;
    private String color;
    private String size;

    public ItemDetails(String sku, String color, String size) {
        this.sku = sku;
        this.color = color;
        this.size = size;
    }

    @JsonProperty
    public String getSku() {
        return sku;
    }

    @JsonProperty
    public String getColor() {
        return color;
    }

    @JsonProperty
    public String getSize() {
        return size;
    }
}

