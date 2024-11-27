/*

function handleselect() {
    const selectedCategory = document.getElementById("categorySelect").value; 

    if (selectedCategory === "All") {
        LoadProduct(allProducts); 
    } else {
        const filteredProducts = allProducts.filter(
            (product) => product.category === selectedCategory
        );
        LoadProduct(filteredProducts);
    }
}
*/
function handleSubmit(event) {
    const query = document.querySelector('input[name="query"]').value;
    if (query.trim() === "") {
      event.preventDefault();
      alert("Please enter a search term.");
    }
  }