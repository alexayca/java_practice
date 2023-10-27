/*
*  Se encapsula la informacion
*
* */
package productos_model;

public class Productos {

    private String articleName;
    private String section;
    private String price;
    private String country;

    public Productos(){
        articleName ="";
        section ="";
        price ="";
        country ="";
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArticleName() {
        return articleName;
    }

    public String getSection() {
        return section;
    }

    public String getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

}
