package ru.gb.servlet;

import ru.gb.model.Product;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("product", createProduct());
       getServletContext().getRequestDispatcher("/product.jsp")
               .forward(req, resp);
    }

    private Product createProduct() {
        List<Product> products = List.of(
                new Product("Kefir", 1, 30.0f, null),
                new Product("Snezhok", 2, 35.0f, null),
                new Product("Ryazhenka", 3, 20.0f, null),
                new Product("Prostokvasha", 4, 25.0f, null),
                new Product("Smetana", 5, 18.0f, null),
                new Product("Tvorog", 6, 20.0f, null),
                new Product("Milk", 7, 25.0f, null),
                new Product("Kumis", 8, 68.0f, null),
                new Product("Airan ", 9, 67f, null)
        );
        return Product.builder()
                .title("Fermented milk")
                .id(0)
                .children(products)
                .build();
    }
}
