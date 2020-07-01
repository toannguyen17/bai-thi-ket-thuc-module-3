package app.dao.category;

import app.model.Category;
import app.model.Product;

import java.util.List;

public interface ICategory {
	List<Category> findAlL();

	Category findByID(int category);
}
