## Builder design
builder design is a way to create objects more sophisticated and ease

For example,  you want to build a pizza with different toppings, crust, and size. Instead of creating separate constructors for each combination, you can use the Builder pattern. Here's an example implementation:

```java
public class Pizza {
    private String crust;
    private String size;
    private String toppings;
    
    public Pizza(String crust, String size, String toppings) {
        this.crust = crust;
        this.size = size;
        this.toppings = toppings;
    }
    
    public static class Builder {
        private String crust;
        private String size;
        private String toppings;
        
        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }
        
        public Builder size(String size) {
            this.size = size;
            return this;
        }
        
        public Builder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(crust, size, toppings);
        }
    }
}
```
moreover you want to instantiate this object right?
so you do like this.
<br/>
```java 
Pizza pizza = new Pizza.Builder()
.crust("thin")
.size("medium")
.toppings("mushrooms, onions, peppers")
.build();```