package woowacourse.shoppingcart.domain;

public class LoginCustomer {

    private String loginId;

    public LoginCustomer(String loginId) {
        this.loginId = loginId;
    }

    public static LoginCustomer of(Customer customer) {
        return new LoginCustomer(customer.getLoginId());
    }

    public String getLoginId() {
        return loginId;
    }
}
