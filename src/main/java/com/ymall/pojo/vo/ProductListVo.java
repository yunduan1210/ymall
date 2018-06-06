package com.ymall.pojo.vo;

import com.ymall.pojo.Product;

public class ProductListVo {

    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private Integer status;

    private String imageHost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }


    public static class Builder {

        private Integer id;

        private Integer categoryId;

        private String name;

        private String subtitle;

        private String mainImage;

        private Integer status;

        private String imageHost;

        public Builder() {

        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder categoryId(Integer val) {
            categoryId = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder subtitle(String val) {
            subtitle = val;
            return this;
        }

        public Builder mainImage(String val) {
            mainImage = val;
            return this;
        }

        public Builder status(Integer val) {
            status = val;
            return this;
        }

        public Builder imageHost(String val) {
            imageHost = val;
            return this;
        }

        public ProductListVo build(){
            return new ProductListVo(this);
        }

    }

    private ProductListVo(Builder builder){
        id = builder.id;
        categoryId = builder.categoryId;
        name = builder.name;
        subtitle = builder.subtitle;
        mainImage = builder.mainImage;
        status = builder.status;
        imageHost = builder.imageHost;
    }
}
