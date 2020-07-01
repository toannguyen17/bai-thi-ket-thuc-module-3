package app.controller;

import app.dao.product.IProduct;
import app.dao.product.ProductDAO;
import app.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete", urlPatterns = "/delete")
public class DeleteProductServlet extends HomeServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		IProduct iProduct = new ProductDAO();
		iProduct.delete(id);

		resp.sendRedirect("/");
	}
}
