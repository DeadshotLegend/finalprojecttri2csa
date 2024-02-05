package main.java.com.example.aichatbot2.grocery;

@Document("groceryitems")
public class GroceryItem {

        @Id
        private String id;

        private String name;
        private int quantity;
        private String category;
        
        public GroceryItem(String id, String name, int quantity, String category) {
            super();
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.category = category;
        }
// Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }

// Getter
  public String getQuantity() {
    return quantity;
  }

// Setter
  public String setQuantity(String newQuantity) {
    this.quantity = newQuantity; 
  }

// Getter
  public String getCategory() {
    return category;
  }

// Setter
  public String setCategory(String newCategory){
    this.category = newCategory;
  }
}
