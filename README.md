# SSTMid1-Spring
# ServiceCart Class

This class provides methods to interact with the FakeStore API for cart items.

## Methods

### getAllCartItems()
- **Description:** Retrieves all cart items from the FakeStore API.
- **Return Type:** `fakestore[]`

### getCartItem(Long id)
- **Description:** Retrieves a specific cart item by ID from the FakeStore API.
- **Parameters:** `id` (Long)
- **Return Type:** `fakestore`

### getCartByUser(Long id)
- **Description:** Retrieves cart items for a specific user from the FakeStore API.
- **Parameters:** `id` (Long)
- **Return Type:** `fakestore`

### getCartsInRange(String startDate, String endDate)
- **Description:** Retrieves cart items within a specified date range from the FakeStore API.
- **Parameters:** `startDate` (String), `endDate` (String)
- **Return Type:** `fakestore[]`

### updateCartItem(fakestore cart)
- **Description:** Updates an existing cart item in the FakeStore API.
- **Parameters:** `cart` (fakestore object)
- **Return Type:** `fakestore`

### AddCartItem(fakestore cart)
- **Description:** Adds a new cart item to the FakeStore API.
- **Parameters:** `cart` (fakestore object)
- **Return Type:** `fakestore`

### deleteCartItem(Long id)
- **Description:** Deletes a cart item by ID from the FakeStore API.
- **Parameters:** `id` (Long)
- **Return Type:** void
