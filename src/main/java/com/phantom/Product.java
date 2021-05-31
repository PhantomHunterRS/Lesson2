package com.phantom;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)

    public class Product {

        private int id;
        private String nameProduct;
        private double costProduct;

        public int getId() {
            return id;
        }
        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public double getCostProduct() {
            return costProduct;
        }

        public void setCostProduct(double costProduct) {
            this.costProduct = costProduct;
        }

        public Product(int id, String nameProduct, double costProduct) {
            this.nameProduct = nameProduct;
            this.costProduct = costProduct;
        }
}