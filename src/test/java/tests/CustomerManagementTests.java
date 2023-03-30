package tests;

import Customers.CustomerManagement;
import com.intuit.karate.core.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("When managing new customers")
public class CustomerManagementTests {

    @Test
    @DisplayName("should return empty when there are no customers")
    public void shouldReturnEmptyWhenThereAreNoCustomers() {
        CustomerManagement customer = new CustomerManagement();
        List<List<String>> customers = customer.getCustomers();

        assertTrue(customers.isEmpty(), "Error: Customers exists");
    }

    @Test
    @DisplayName("should throw exception when customer name is invalid")
    public void shouldThrowExceptionForInvalidInput() {
        List<String> newCustomer = new ArrayList<>();
        newCustomer.add("");
        newCustomer.add("Jackson");
        newCustomer.add("20");

        CustomerManagement customer = new CustomerManagement();
        IllegalArgumentException err =
                assertThrows(IllegalArgumentException.class, () ->
                        customer.addCustomers(newCustomer));
    }

}
