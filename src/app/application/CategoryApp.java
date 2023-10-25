package app.application;

import app.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.getId();

        System.out.println(category.getId());
    }
}
