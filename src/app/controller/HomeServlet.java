package app.controller;

import app.config.PathConfig;
import app.dao.product.IProduct;
import app.dao.product.ProductDAO;
import app.model.Product;
import app.service.Database;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "home", urlPatterns = "/")
public class HomeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String search = req.getParameter("search");

		IProduct iProduct = new ProductDAO();
		List<Product> lists = null;

		if (search != null){
			lists = iProduct.findName(search);
		}else{
			lists = iProduct.findAll();
		}

		req.setAttribute("lists", lists);
		RequestDispatcher dispatcher = req.getRequestDispatcher(PathConfig.LAYOUT + "index.jsp");
		dispatcher.forward(req, resp);
	}
}
